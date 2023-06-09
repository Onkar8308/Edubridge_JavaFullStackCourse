/**
 * this class contains all the method related to user account*/
package atmRepo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import atmDao.AccountDetails;

public class AccountOperationRepo {
	//static List<AccountDetails> accDet = new ArrayList<>();
	private ResultSet rs;

	// DatabaseConnection con = new DatabaseConnection();
//	private static Connection con = null;
//	static {
//		try {
//			con = DatabaseConnection.getDatabaseConnection();
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	public void addAccount(AccountDetails details) throws SQLException, ClassNotFoundException {
		Connection con = DatabaseConnection.getDatabaseConnection();
		String insertQuery = "insert into atm (userId,password,accHolderName,accNumber,bankName,branchName,cityName,mobileNumber,balance) values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement st = con.prepareStatement(insertQuery);
		st.setInt(1, details.getUserId());
		st.setString(2, details.getPassword());
		st.setString(3, details.getAcoountHolderName());
		st.setDouble(4, details.getAccountNumber());
		st.setString(5, details.getBankName());
		st.setString(6, details.getBranchName());
		st.setString(7, details.getCityName());
		st.setDouble(8, details.getMobileNumber());
		st.setDouble(9, details.getBalance());
		int r = st.executeUpdate();
		if (r > 0)
			System.out.println("account added succesfully");
		else
			System.out.println("acoount addition failed!");
		// accDet.add(details);
	}

	public boolean isValidLogIn(int userId, String userPass) {
		// List<AccountHolderDetails> existingUser = getAllUser();

		for (int i = 0; i < accDet.size(); i++) {
			AccountDetails user = accDet.get(i);

			if (user.getUserId() == userId && user.getPassword().equals(userPass))
				return true;
			// TODO Auto-generated method stub
		}
		return false;
	}

	public boolean isValidRegisteration(int uniqueId) {

		for (int i = 0; i < accDet.size(); i++) {
			AccountDetails user = accDet.get(i);

			if (user.getUserId() == uniqueId)
				return false;
		}
		return true;
	}

	public AccountDetails getAccountDdetails(int userId) {
		// TODO Auto-generated method stub
		for (int i = 0; i < accDet.size(); i++) {
			AccountDetails user = accDet.get(i);

			if (user.getUserId() == userId)
				return user;
		}
		return null;
	}
}
