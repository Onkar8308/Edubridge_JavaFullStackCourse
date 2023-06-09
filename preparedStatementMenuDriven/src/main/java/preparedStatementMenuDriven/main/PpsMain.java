package preparedStatementMenuDriven.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import preparedStatementMenuDriven.operations.JdbcOperationsimpl;

public class PpsMain {

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		JdbcOperationsimpl oper = new JdbcOperationsimpl();
		do {
			System.out.println("Enter your choice");
			System.out.println("1: insert 2:update 3:delete 4:view 5: view By Id");
			int choice = Integer.parseInt(br.readLine());
			switch(choice) {
			case 1:

				System.out.println("enter employee ID:");
				int empId = Integer.parseInt(br.readLine());
				System.out.println("enter employee name:");
				String empName = br.readLine();
				System.out.println("enter employee age:");
				int empAge = Integer.parseInt( br.readLine());
				System.out.println("enter employee salary:");
				double empSalary = Double.parseDouble(br.readLine());
				System.out.println("enter employee department id:");
				int deptId =Integer.parseInt(br.readLine());
				oper.insertData(empId, empName, empAge, empSalary, deptId);
				System.out.println("Record Inserted");
				break;
			case 2:
				System.out.println("Enter Id to update the record");
				int updaterecordID = Integer.parseInt(br.readLine());
				oper.updateData(updaterecordID);
				System.out.println("record Updated!!");
				break;
			case 3:
				System.out.println("enter Id of record which you want delete");
				int delRecId = Integer.parseInt(br.readLine());
				oper.deleteData(delRecId);
				System.out.println("record deleted!");
				break;
			case 4:
				oper.viewData();
				break;
			case 5:
				System.out.println("enter Id to view the record");
				int viewId = Integer.parseInt(br.readLine());
				oper.viewByID(viewId);
				default: System.out.println("wrong choice");
			}
		}while(true);
	}

}
