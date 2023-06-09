package databaseCreation;
import java.util.Scanner;
import java.sql.*;

public class databaseCreation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String databaseName;
		Scanner sc=new Scanner(System.in);
//	System.out.println("Enter database name");
//		databaseName=sc.next();
//		
		 Class.forName("com.mysql.cj.jdbc.Driver");
	     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Pass123");
	      Statement st=con.createStatement();
	     System.out.println("Connection ="+con);
	     if(con!=null) {
	    	 System.out.println("Enter database name");
	 		databaseName=sc.next();
	 		String db="create database "+databaseName; //create database proddb;
	 		int r=st.executeUpdate(db);
	 		if (r>0) {
	 			System.out.println("Database is created");
	 		}
	 		else {
	 			System.out.println("database is not created");
	 		}
	     }
	}

}