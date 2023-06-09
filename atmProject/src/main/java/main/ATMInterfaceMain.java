package main;
/*
 * All copyright* reserved to user onkar katewal*/

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Service.ATMOPerationImpl;
import atmDao.AccountDetails;
import atmException.ExistingUserException;
import atmException.GreaterThanZeroException;
import atmException.InsufficientBalException;
import atmException.WrongChoiceException;
import atmRepo.AccountOperationRepo;

public class ATMInterfaceMain {
	public static void main(String[] args) throws WrongChoiceException, ClassNotFoundException, SQLException {

		// BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("         Welcome to BOI ATMs         ");
			System.out.println("           Select Choice           ");
			System.out.println("1 : register  2: Log in   3: quit");
			int choice = sc.nextInt();

			switch (choice) { // 1st switch for account operation like register,login,quit.
			case 1: //register
				System.out.println("Enter unique user Id");
				int uniqueId = sc.nextInt();
				System.out.println("Enter your password");
				String uniquePass = sc.next();

				AccountOperationRepo acc = new AccountOperationRepo();
				try {
					if (acc.isValidRegisteration(uniqueId)) {
						// Registering user into system
						System.out.println("enter account holder name");
						String accholderName = sc.next();
						System.out.println("enter account Number");
						Double accNum = sc.nextDouble();
						System.out.println("enter bank name");
						String bankName = sc.next();
						System.out.println("enter branch name");
						String branchName = sc.next();
						System.out.println("enter city name");
						String cityName = sc.next();
						System.out.println("enter mobile number");
						double mobNum = sc.nextDouble();
						System.out.println("enter balance");
						double balance = sc.nextDouble();
						AccountDetails details = new AccountDetails(uniqueId, uniquePass, accholderName, accNum,
								bankName, branchName, cityName, mobNum, balance);

						acc.addAccount(details);
						System.out.println("Registeration Scuccrssfull");
					} else
						throw new ExistingUserException("Userr already Exist");
				} catch (ExistingUserException e) {
					System.out.println(e);

				}
				break;
			case 2: { //log in
				AccountOperationRepo currentUser = new AccountOperationRepo();
				System.out.println("Enter user ID and pass");
				System.out.print("user id :");
				int userId = sc.nextInt();
				System.out.print("\n pass :");
				String userPass = sc.next();

				if (currentUser.isValidLogIn(userId, userPass)) { //
					AccountOperationRepo account = new AccountOperationRepo();
					AccountDetails details = account.getAccountDdetails(userId);

					List<String> transections = new ArrayList<>(); // list for saving vadlid transections
					ATMOPerationImpl operation = new ATMOPerationImpl();
					System.out.println("Welcome to ATM Service");
					while (true) {
						System.out.println("please select :\n" + "1 : Transection history \n" + "2 : withdraw \n"
								+ "3 : Deposit\n" + "4 : transefer\n" + "5 : Quit");

						// Scanner sc = new Scanner(System.in);
						// System.out.println("heyy");
						int operationChoice = sc.nextInt();
						// TODO Auto-generated method stub
						// ATMOPerationImpl operation = new ATMOPerationImpl();

						switch (operationChoice) { // 2sitch for the atm Operation like withdraw,deposite,etc,
						case 1: //for transection history
							if (transections.size() > 0)
								operation.transectionHistory(transections);
							else
								System.out.println("No transection found");
							break;
						case 2: //for withdraw
							System.out.println("Enter Money to wihdraw");
							int withdrawAmount = sc.nextInt();
							if (withdrawAmount > 0) {
								double updatedBal = operation.withdraw(withdrawAmount, details.getBalance());
								if (updatedBal != details.getBalance()) {
									details.setBalance(updatedBal);
									System.out.println("sucessull Acc bal is : " + details.getBalance());
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
						case 3: //for deposite
							System.out.println("Enter Money to deposite");
							int depositeMoney = sc.nextInt();
							if (depositeMoney > 0) {
								double updatedBalance = operation.deposite(depositeMoney, details.getBalance());
								if (updatedBalance != details.getBalance()) {
									details.setBalance(updatedBalance);
									System.out.println("sucessull Acc bal is : " + details.getBalance());
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
						case 4: //for transfer
							System.out.println("enter acc number to transfer money");
							int accNum = sc.nextInt();
							System.out.println("enter money to transfer");
							double amounttransfer = sc.nextDouble();
							double updatedBalaftertransfer = operation.transferMoney(amounttransfer,
									details.getBalance());
							if (amounttransfer > 0) {
								if (updatedBalaftertransfer != details.getBalance()) {
									details.setBalance(updatedBalaftertransfer);
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
						case 5: //quit
							System.out.println("Thank you for using this ATM");
							System.exit(0);
						default:
							try {
								throw new WrongChoiceException("Wrong choice");
							} catch (WrongChoiceException wc) {
								System.out.println(wc);
							}
						}
						// sc.close();
					}
				} else
					System.out.println("Invalid Credentials !! please register");
				break;
			}
			case 3: //quit
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
