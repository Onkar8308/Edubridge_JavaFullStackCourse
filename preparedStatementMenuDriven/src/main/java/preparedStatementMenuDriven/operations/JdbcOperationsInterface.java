package preparedStatementMenuDriven.operations;

import java.io.IOException;
import java.sql.SQLException;

public interface JdbcOperationsInterface {
	public void insertData(int empId,String empName, int empAge, double empSalary, int deptId)throws ClassNotFoundException, SQLException ;
	public void viewData() throws ClassNotFoundException, SQLException;
	public void updateData(int updaterecordID) throws NumberFormatException, IOException, ClassNotFoundException, SQLException;
	public void deleteData(int delRecId) throws ClassNotFoundException, SQLException;
	public void viewByID(int viewId) throws SQLException, ClassNotFoundException ;
}
