package preparedStatementMenuDriven.operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import preparedStatementMenuDriven.connection.DatabaseConn;

public class JdbcOperationsimpl implements JdbcOperationsInterface {
	DatabaseConn con = new DatabaseConn();
	
	public void insertData(int empId, String  empName, int empAge, double empSalary, int deptId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conObj = con.getconnection();
		String query = "insert into employee values(?,?,?,?,?)";
		PreparedStatement st =conObj.prepareStatement(query);
		st.setInt(1, empId);
		st.setString(2, empName);	
		st.setInt(3, empAge);
		st.setDouble(4, empSalary);
		st.setInt(5, deptId);
		st.executeUpdate();
		conObj.close();
		st.close();
	}

	public void viewData() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conObj = con.getconnection();
		String query = "select * from employee";
		PreparedStatement st =conObj.prepareStatement(query);
		
		ResultSet rs = st.executeQuery();
		
		System.out.println("id\tname\tage\tsalary\tdept_id");
		while (rs.next()) {
			System.out.println(rs.getInt("eid")+ "\t"+ rs.getString("empname")+ "\t"+
								rs.getInt("eage")+ "\t"+rs.getFloat("esalary")+ "\t"+rs.getInt("did"));
		}
		conObj.close();
		st.close();
	}

	public void updateData(int updaterecordID) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		
		Connection conObj = con.getconnection();
		
		System.out.println("what you want to update\n"
				+ "1 : name\n"
				+ "2: age\n"
				+ "3:salary\n"
				+ "4:dept id\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice = Integer.parseInt(br.readLine());
		switch(choice) {
		case 1:
			System.out.println("enter Updated Name");
			String name = br.readLine();
			String query = "update employee set empname=? where eid=?";
			PreparedStatement st =conObj.prepareStatement(query);
			st.setString(1, name);
			st.setInt(2, updaterecordID);
			st.executeUpdate();
			break;
		case 2:
			System.out.println("enter Updated age");
			int age = Integer.parseInt(br.readLine());
			String query2 = "update employee set eage=? where eid=?";
			PreparedStatement st2 =conObj.prepareStatement(query2);
			st2.setInt(1, age);
			st2.setInt(2, updaterecordID);
			st2.executeUpdate();
			st2.close();
			break;
		case 3:
			System.out.println("enter Updated salary");
			double salary =Double.parseDouble( br.readLine());
			String query3 = "update employee set esalary=? where eid=?";
			PreparedStatement st3 =conObj.prepareStatement(query3);
			st3.setDouble(1, choice);
			st3.setInt(2, updaterecordID);
			st3.executeUpdate();
			st3.close();
			break;
		case 4:
			System.out.println("enter Updated department id");
			int deptid =Integer.parseInt(br.readLine());
			String query4 = "update employee set did=? where eid=?";
			PreparedStatement st4 =conObj.prepareStatement(query4);
			st4.setInt(1, choice);
			st4.setInt(2, updaterecordID);
			st4.executeUpdate();
			st4.close();
			break;
		}
		conObj.close();
	
	}

	public void deleteData(int delRecId) throws ClassNotFoundException, SQLException {
	
		// TODO Auto-generated method stub
		if(delRecId>0) {
		Connection conObj = con.getconnection();
		String query = "delete from employee where eid = ?";
		PreparedStatement st =conObj.prepareStatement(query);
		st.setInt(1, delRecId);
		st.executeUpdate();
		conObj.close();
		st.close();
		}
		else
			System.out.println("record id should be greater than 0");
	}

	public void viewByID(int viewId) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		if(viewId>0) {
			Connection conObj = con.getconnection();
			String query = "select * from employee where eid = ?";
			PreparedStatement st =conObj.prepareStatement(query);
			st.setInt(1, viewId);
			ResultSet rs =  st.executeQuery();
				while(rs.next()) {
			System.out.println(rs.getInt("eid")+ "\t"+ rs.getString("empname")+ "\t"+
					rs.getInt("eage")+ "\t"+rs.getFloat("esalary")+ "\t"+rs.getInt("did"));
			}
			conObj.close();
			st.close();
			}
			else
				System.out.println("record id should be greater than 0");
	}


}
