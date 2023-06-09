package atmDao;

public class AccountDetails {
	private int userId;
	private String password ;
	private String AcoountHolderName;
	private double AccountNumber;
	private String bankName;
	private String branchName;
	private String cityName;
	private double mobileNumber;
	private double balance;
	
	public int getUserId() {
		return userId;
	}
	public String getPassword() {
		return password;
	}
	public String getCityName() {
		return cityName;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getAddress() {
		return cityName;
	}
	public void setAddress(String address) {
		this.cityName = address;
	}
	public double getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(double mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAcoountHolderName() {
		return AcoountHolderName;
	}
	public void setAcoountHolderName(String acoountHolderName) {
		AcoountHolderName = acoountHolderName;
	}
	public double getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(double accountNumber) {
		AccountNumber = accountNumber;
	}
	
	
	public AccountDetails(int userId, String password, String acoountHolderName, double accountNumber, String bankName,
			String branchName, String cityName, double mobileNumber, double balance) {
		super();
		this.userId = userId;
		this.password = password;
		AcoountHolderName = acoountHolderName;
		AccountNumber = accountNumber;
		this.bankName = bankName;
		this.branchName = branchName;
		this.cityName = cityName;
		this.mobileNumber = mobileNumber;
		this.balance = balance;
	}
	
	public AccountDetails() {
		
	}
	
	
	
	
	
	
	
	
}
