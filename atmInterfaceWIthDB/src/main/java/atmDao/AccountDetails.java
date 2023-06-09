package atmDao;

public class AccountDetails {
	private int cardNumber;
	private String password ;
	private String AccountHolderName;
	private String bankName;
	private String branchName;
	private String cityName;
	private double mobileNumber;
	private double balance;
	
	
	public int getcardNumber() {
		return cardNumber;
	}


	public String getPassword() {
		return password;
	}


	public String getAccountHolderName() {
		return AccountHolderName;
	}


	public String getBankName() {
		return bankName;
	}


	public String getBranchName() {
		return branchName;
	}


	public String getCityName() {
		return cityName;
	}


	public double getMobileNumber() {
		return mobileNumber;
	}


	public double getBalance() {
		return balance;
	}


	public void setCardNumber(int accountNumber) {
		this.cardNumber = accountNumber;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public void setMobileNumber(double mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	

	public AccountDetails(int accountNumber, String password, String accountHolderName, String bankName,
			String branchName, String cityName, double mobileNumber, double balance) {
		super();
		this.cardNumber = accountNumber;
		this.password = password;
		AccountHolderName = accountHolderName;
		this.bankName = bankName;
		this.branchName = branchName;
		this.cityName = cityName;
		this.mobileNumber = mobileNumber;
		this.balance = balance;
	}


	public AccountDetails() {
		
	}
	
	
	
	
	
	
	
	
}
