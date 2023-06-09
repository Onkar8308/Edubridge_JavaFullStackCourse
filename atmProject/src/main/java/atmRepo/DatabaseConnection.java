package atmRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
private	static String driver ="com.mysql.cj.jdbc.Driver";
private	static String url="jdbc:mysql://localhost:3306/core_project";
private	static String username="root";
private	static String password="Pass123";


public static Connection getDatabaseConnection() throws ClassNotFoundException, SQLException {
	
	Class.forName(driver);
	Connection conn=DriverManager.getConnection(url,username,password);
	if(conn==null) 
		System.out.println("Connection error");
	
 return conn;
	
}
}

