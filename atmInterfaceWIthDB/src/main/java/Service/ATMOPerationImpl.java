package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import atmException.InsufficientBalException;
import atmException.AccountNotExistException;
import atmRepo.DatabaseConnection;

public class ATMOPerationImpl implements ATMOperation {

	private static Connection con = null;
	static {
		try {
			con = DatabaseConnection.getDatabaseConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private PreparedStatement pst;
	private ResultSet rs;

	@Override
	public void transectionHistory(List<String> transections) {
		System.out.println("   Last transections are  ");
		Iterator<String> it = transections.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		// TODO Auto-generated method stub

	}

	@Override
	public double withdraw(int withdrawAmount, double mainBalnce, int cardNum) throws SQLException {
		if (mainBalnce >= withdrawAmount) {
			double updatedBal = mainBalnce - withdrawAmount;
			String uppdatedBalQuery = "update atm set balance =? where cardNum = ?";
			pst = con.prepareStatement(uppdatedBalQuery);
			pst.setDouble(1, updatedBal);
			pst.setInt(2, cardNum);
			pst.executeUpdate();
			System.out.println("Withdraw sucessfull Account bal is : " + updatedBal);
			return updatedBal;

		} else {
			try {
				throw new InsufficientBalException("Insufficient Bal ");

			} catch (InsufficientBalException obj) {
				System.out.println(obj);
				return mainBalnce;
			}
		}
	}

	@Override
	public double transferMoney(double amounttransfer, double mainbal, int reciverAccNum, int cuurentAccount)
			throws SQLException, AccountNotExistException {
		String validAccountNumber = "select cardNum from atm where cardNum =?"; // query to check acc to
																				// transfer is exist or
																				// not
		pst = con.prepareStatement(validAccountNumber);
		pst.setInt(1, reciverAccNum);
		rs = pst.executeQuery();
		if (rs.next()) {
			if (mainbal >= amounttransfer) {
				double cuurentupdateBal = mainbal - amounttransfer;
				String currentUppdatedBalQuery = "update atm set balance =? where cardNum = ?"; // for updating the
																								// cuurent account
																								// balance
				pst = con.prepareStatement(currentUppdatedBalQuery);
				pst.setDouble(1, cuurentupdateBal);
				pst.setInt(2, cuurentAccount);
				pst.executeUpdate();

				String getReciverAcccountBalance = "select balance from atm where cardNum =?"; // for fetching reciver
																								// account balance
				pst = con.prepareStatement(getReciverAcccountBalance);
				pst.setInt(1, reciverAccNum);
				rs = pst.executeQuery();
				if (rs.next()) {
					double reciverUpdatedBalance = rs.getDouble("balance") + amounttransfer;
					String reviverUppdatedBalQuery = "update atm set balance =? where cardNum = ?"; // for updating
																									// reciver account
																									// balance
					pst = con.prepareStatement(reviverUppdatedBalQuery);
					pst.setDouble(1, reciverUpdatedBalance);
					pst.setInt(2, reciverAccNum);
					pst.executeUpdate();
				}
				return cuurentupdateBal;
			} else
				try {
					throw new InsufficientBalException("Insufficient balance to transfer money");
				} catch (InsufficientBalException obj) {
					return mainbal;
				}

		} else {
			throw new AccountNotExistException("account not exist ");
		}

	}

	@Override
	public double deposite(int depositeMoney, double mainBal, int cardNum) throws SQLException {
		if (depositeMoney > 0) {
			System.out.println(mainBal);
			double updatedbal = mainBal + depositeMoney;
			String uppdatedBalQuery = "update atm set balance =? where cardNum = ?";
			pst = con.prepareStatement(uppdatedBalQuery);
			pst.setDouble(1, updatedbal);
			pst.setInt(2, cardNum);
			pst.executeUpdate();
			System.out.println("deposite successfull Account  bal is : " + updatedbal);
			pst.close();
			return updatedbal;
		} else {
			return mainBal;
		}

	}

	@Override
	public boolean viewBalance(int currntAccount) throws SQLException {
		// TODO Auto-generated method stub
		String uppdatedBalQuery = "select balance from atm where cardNum=? ";
		pst = con.prepareStatement(uppdatedBalQuery);
		pst.setInt(1, currntAccount);
		rs = pst.executeQuery();
		if (rs.next()) {
			System.out.println("your account balance is : " + rs.getDouble("balance"));
			return true;
		} else
			return false;
	}
}
