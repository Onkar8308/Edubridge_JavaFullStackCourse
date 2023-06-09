package main;
/*
 * All copyright* reserved to user nkar katewal.
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Service.ATMOPerationImpl;
import atmDao.AccountDetails;
import atmException.AccountNotExistException;
import atmException.ExistingUserException;
import atmException.GreaterThanZeroException;
import atmException.InsufficientBalException;
import atmException.WrongChoiceException;
import atmRepo.AccountOperationRepo;

public class ATMInterfaceMain {
	public static void main(String[] args) throws WrongChoiceException, ClassNotFoundException, SQLException,
			AccountNotExistException, NumberFormatException, IOException {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("..........Welcome to BOI ATM.........");
			System.out.println("...........Select Choice.............");
			System.out.println("1 : Register  " + "\n2 : Log in " + "\n3 : Forgot password  " + "\n4 : Quit");
			int choice = Integer.parseInt(sc.readLine());
			AccountOperationRepo acc = new AccountOperationRepo();
			switch (choice) { // 1st switch for account operation like register,login,quit.
			case 1: // register
				System.out.println("Enter unique card number");
				int uniqueId = Integer.parseInt(sc.readLine());
				System.out.println("Enter your password");
				String uniquePass = sc.readLine();

				try {

					if (acc.isValidRegisteration(uniqueId)) {
						// Registering user into system
						System.out.println("enter account holder name");
						String accholderName = sc.readLine();
						System.out.println("enter bank name");
						String bankName = sc.readLine();
						System.out.println("enter branch name");
						String branchName = sc.readLine();
						System.out.println("enter city name");
						String cityName = sc.readLine();
						System.out.println("enter mobile number");
						double mobNum = Double.parseDouble(sc.readLine());
						System.out.println("enter balance");
						double balance = Double.parseDouble(sc.readLine());
						AccountDetails details = new AccountDetails(uniqueId, uniquePass, accholderName, bankName,
								branchName, cityName, mobNum, balance);

						acc.addAccount(details);
						System.out.println("Registeration Scuccrssfull");
					} else
						throw new ExistingUserException("User already Exist Please LogIn");
				} catch (ExistingUserException e) {
					System.out.println(e);

				}
				break;
			case 2: { // log in
				System.out.println("Enter card number and pass");
				System.out.print("user account number :");
				int cardNum = Integer.parseInt(sc.readLine());
				System.out.print("\n pass :");
				String userPass = sc.readLine();

				if (acc.isValidLogIn(cardNum, userPass)) { //
					AccountOperationRepo account = new AccountOperationRepo();
					AccountDetails currentAccount = account.getAccountDdetails(cardNum); // getting current user details
																							// from database

					List<String> transections = new ArrayList<>(); // list for saving valid transactions
					ATMOPerationImpl operation = new ATMOPerationImpl();

					System.out.println("    Welcome to ATM Service   ");
					String ip = "logIn";
					while (ip == "logIn") {
						System.out.println("please select :\n" + "1 : Transection history \n" + "2 : withdraw \n"
								+ "3 : Deposit\n" + "4 : transefer\n" + "5 : view balance\n" + "6:Log out");

						int operationChoice = Integer.parseInt(sc.readLine());

						switch (operationChoice) { // 2nd switch for the atm Operation like withdraw,deposite,etc,
						case 1: // for transaction history
							if (transections.size() > 0)
								operation.transectionHistory(transections);
							else
								System.out.println("No transection found");
							break;
						case 2: // for withdraw
							System.out.println("Enter Money to wihdraw");
							int withdrawAmount = Integer.parseInt(sc.readLine());
							if (withdrawAmount > 0) {
								double updatedBal = operation.withdraw(withdrawAmount, currentAccount.getBalance(),
										currentAccount.getcardNumber());
								if (updatedBal != currentAccount.getBalance()) {
									currentAccount.setBalance(updatedBal);
									transections.add(
											"money withdraw " + withdrawAmount + "\tremaining bal : " + updatedBal);
								}
							} else {
								try {
									throw new GreaterThanZeroException("withdraw ammount should be greater than zero");
								} catch (GreaterThanZeroException obj) {
									System.out.println(obj);
									// TODO: handle exception
								}
							}
							break;
						case 3: // for deposit
							System.out.println("Enter Money to deposite");
							int depositeMoney = Integer.parseInt(sc.readLine());
							if (depositeMoney > 0) {
								double updatedBalance = operation.deposite(depositeMoney, currentAccount.getBalance(),
										currentAccount.getcardNumber());
								if (updatedBalance != currentAccount.getBalance()) {
									currentAccount.setBalance(updatedBalance);
									transections.add("money deposite ammount : " + depositeMoney + "\tremaining bal : "
											+ updatedBalance);
								} else {
									try {
										throw new GreaterThanZeroException(
												"Transfer Money should be greater than zero");
									} catch (GreaterThanZeroException obj) {
										System.out.println(obj);
										// TODO: handle exception
									}

								}
							} else {
								try {
									throw new GreaterThanZeroException("Transfer Money should be greater than zero");
								} catch (GreaterThanZeroException obj) {
									System.out.println(obj);
									// TODO: handle exception
								}
							}
							break;
						case 4: // for transfer
							System.out.println("enter acc number to transfer money");
							int accNum = Integer.parseInt(sc.readLine());
							System.out.println("enter money to transfer");
							double amounttransfer = Double.parseDouble(sc.readLine());

							if (amounttransfer > 0) {
								double updatedBalaftertransfer = operation.transferMoney(amounttransfer,
										currentAccount.getBalance(), accNum, currentAccount.getcardNumber());
								if (updatedBalaftertransfer <= currentAccount.getBalance()) {
									currentAccount.setBalance(updatedBalaftertransfer);
									System.out.println("Amount of " + amounttransfer + " is transfered to " + accNum
											+ " sucessfully remaining bal is: " + updatedBalaftertransfer);
									transections.add(amounttransfer + " money Transefer to acc : " + accNum
											+ "remaining bal : " + updatedBalaftertransfer);
								} else {
									try {
										throw new InsufficientBalException(
												"Account balance is insufficient to transfer");
									} catch (InsufficientBalException obj) {
										System.out.println(obj);
									}
								}
							} else {
								try {
									throw new GreaterThanZeroException("Transfer Money should be greater than zero");
								} catch (GreaterThanZeroException obj) {
									System.out.println(obj);
									// TODO: handle exception
								}
							}

							break;

						case 5:// view balance
							boolean currentAccountBal = operation.viewBalance(currentAccount.getcardNumber());
							if (!currentAccountBal) {
								try {
									throw new AccountNotExistException(
											"account not exist. please enter valid account number");
								} catch (AccountNotExistException obj) {
									System.out.println(obj);

								}
							}
							break;

						case 6: // logout
							System.out.println("Thank you for using this ATM");
							ip = "LogOut";
							break;
						// System.exit(0);
						default:
							try {
								throw new WrongChoiceException("Wrong choice");
							} catch (WrongChoiceException wc) {
								System.out.println(wc);
							}
						}

					}
				} else
					System.out.println("Invalid Credentials !! please register");
				break;
			}
			case 3: // change password
				System.out.println("Enter card Number");
				int cardNumber = Integer.parseInt(sc.readLine());
				System.out.println("Enter new password");
				String newPass = sc.readLine();
				boolean res = acc.changePassword(cardNumber, newPass);
				if (res)
					System.out.println("password changed succesfully");
				break;

			case 4: // quit
				System.out.println("Thank you\n" + "Terminated !!");
				System.exit(0);

			default:
				try {
					throw new WrongChoiceException("Wrong Choice please select correct choice");
				} catch (WrongChoiceException wc) {
					System.out.println(wc);
				}
			}

		}
	}
}
