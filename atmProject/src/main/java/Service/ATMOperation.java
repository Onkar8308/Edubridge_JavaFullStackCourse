package Service;
import java.util.List;

public interface ATMOperation {
	public double withdraw(int ammount, double mainBalnce);  //for withdraw money from u=acoount
	public double deposite(int depositeMoney, double mainBal); //for deposite the money in your account
	public double transferMoney(double amounttransfer, double mainBal);	//to transfer the money to new account
	public void transectionHistory(List<String> transections); //to see the transections on your account

}
