package connecting_to_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url ="jdbc:mysql://localhost:3306/edubridge";
		System.out.println("starting...");
		Class.forName(driver);
		
		System.out.println("Driver loaded succesfuully...");
		
		Connection con = DriverManager.getConnection(url, "root", "Pass123");
		System.out.println("Connection established succesfully... ");
		
		Statement st = con.createStatement();
		String query = "select *from employee";
		
		ResultSet rs =	st.executeQuery(query);
		
		System.out.println("id\tname\tage\tsalary\tdept_id");
		while (rs.next()) {
			System.out.println(rs.getInt("eid")+ "\t"+ rs.getString("empname")+ "\t"+
								rs.getInt("eage")+ "\t"+rs.getFloat("esalary")+ "\t"+rs.getInt("did"));
		}

		}
}