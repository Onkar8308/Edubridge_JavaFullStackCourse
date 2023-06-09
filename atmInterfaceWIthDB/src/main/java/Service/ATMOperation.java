package Service;

import java.sql.SQLException;
import java.util.List;

import atmException.AccountNotExistException;

public interface ATMOperation {
	public double withdraw(int ammount, double mainBalnce, int cardNum) throws SQLException; // for withdraw money from
																							// acoount

	public double deposite(int depositeMoney, double mainBal, int cardNum) throws SQLException; // for deposite the money
																								// in your account

	public double transferMoney(double amounttransfer, double mainBal,int reciverrAccNum,int cuurentAccount) throws SQLException,AccountNotExistException; // to transfer the money to new account

	public void transectionHistory(List<String> transections); // to see the transections on your account
	
	public boolean viewBalance (int currntAccount) throws SQLException;
}
