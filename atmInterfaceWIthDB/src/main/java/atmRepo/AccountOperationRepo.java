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
import atmException.AccountNotExistException;

public class AccountOperationRepo {
	static List<AccountDetails> accDet = new ArrayList<>();
	private ResultSet rs;
	private PreparedStatement st;
	// DatabaseConnection con = new DatabaseConnection();
	private static Connection con = null;
	static {
		try {
			con = DatabaseConnection.getDatabaseConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addAccount(AccountDetails details) throws SQLException, ClassNotFoundException {
		// Connection con = DatabaseConnection.getDatabaseConnection();
		String insertQuery = "insert into atm (cardNum,password,AccountHolderName,bankName,branchName,cityName,mobileNumber,balance) values(?,?,?,?,?,?,?,?)";
		st = con.prepareStatement(insertQuery);
		st.setInt(1, details.getcardNumber());
		st.setString(2, details.getPassword());
		st.setString(3, details.getAccountHolderName());
		st.setString(4, details.getBankName());
		st.setString(5, details.getBranchName());
		st.setString(6, details.getCityName());
		st.setDouble(7, details.getMobileNumber());
		st.setDouble(8, details.getBalance());
		int r = st.executeUpdate();
		if (r > 0)
			System.out.println("account added succesfully");
		else
			System.out.println("acoount addition failed!");
		// accDet.add(details);
	}

	public boolean isValidLogIn(int userId, String userPass) throws SQLException {
		// List<AccountDetails> existingUser = getAllUser();
		String validLogIn = "select cardNum,password from atm where cardNum =" + userId + "&& password = '" + userPass
				+ "'";
		st = con.prepareStatement(validLogIn);
		rs = st.executeQuery();
		if (rs.next()) {
			return true;
		} else
			return false;
//		for (int i = 0; i < accDet.size(); i++) {
//			AccountDetails user = accDet.get(i);
//
//			if (user.getUserId() == userId && user.getPassword().equals(userPass))
//				return true;
//			// TODO Auto-generated method stub
//		}
		// return false;
	}

	public boolean isValidRegisteration(int uniqueId) throws SQLException {
		String validReg = "select cardNum from atm where cardNum =" + uniqueId;
		st = con.prepareStatement(validReg);
		rs = st.executeQuery();
		if (rs.next())
			return false;
		else
			return true;

	}

	public AccountDetails getAccountDdetails(int userId) throws SQLException {
		String validReg = "select * from atm where cardNum = ?";
		st = con.prepareStatement(validReg);
		st.setInt(1, userId);
		rs = st.executeQuery();

		while (rs.next()) {
			AccountDetails currentUser = new AccountDetails(rs.getInt("cardNum"), rs.getString("password"),
					rs.getString("AccountHolderName"), rs.getString("bankName"), rs.getString("branchName"),
					rs.getString("cityName"), rs.getDouble("mobileNumber"), rs.getDouble("balance"));
			return currentUser;
		}
		return null;

	}

	public boolean changePassword(int cardNum, String newPass) throws SQLException {

		String validLogIn = "select * from atm where cardNum =" + cardNum;
		st = con.prepareStatement(validLogIn);
		rs = st.executeQuery();
		// TODO Auto-generated method stub
		if (rs.next()) {
			if (newPass.equals(rs.getString("password"))) {
				System.out.println("new password cannot be same as old password");
				return false;
			} else {
				String uppdatedBalQuery = "update atm set password =? where cardNum = ?";
				st = con.prepareStatement(uppdatedBalQuery);
				st.setString(1, newPass);
				st.setInt(2, cardNum);
				st.executeUpdate();
				return true;
			}
		} else {
			try {
				throw new AccountNotExistException("account not exist please enter valid card number");

			} catch (AccountNotExistException obj) {
				System.out.println(obj);
				return false;
			}
		}
	}
}
