package tableCreation;

import java.lang.reflect.Executable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TableCreation {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
	     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Pass123");
	      Statement st=con.createStatement();
	     System.out.println("Connection ="+con);
	     Scanner sc = new Scanner(System.in);
	     if(con!=null) {
		 	st.executeUpdate("use demo2");
	    	 System.out.println("Enter table name name");
	    	 String tableName=sc.next();
	    	 String tablequery ="create table "+tableName+"(uid int primary key,uname varchar(40) not null)";
	    	 int t = st.executeUpdate(tablequery);
	    	 if(t>0) {
	    		 System.out.println("table created");
	    		 
	    	 }
	    	 else
	    		 System.out.println("table not created");
	    	
	    	 System.out.println("how many record you want to insert");
	    	 int numOfRec= sc.nextInt();
	    	 for(int i =0;i<numOfRec;i++) {
	 		System.out.println("enter user id");
	 		int uid = sc.nextInt();
	 		System.out.println("Enter username");
	 		String uname  = sc.next();
	    	 
	 		String query =" insert into "+tableName+" values("+uid+",'"+uname+"')";	
	 		int r1 = st.executeUpdate(query);
	 		if(r1>0)
	 			System.out.println("record inserted");
	 		else
	 			System.out.println("record not inserted");
    	 }
	
	     }
	     }
	}