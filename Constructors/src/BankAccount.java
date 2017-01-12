
public class BankAccount {
	
	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	
	public BankAccount(){
		System.out.println("Default / empty constructor called");
	}
	
	public BankAccount(String accountNumber, double balance,
			String customerName, String email, String phoneNo) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	private String phoneNo;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public void depositFunds(double depositAmt){
		System.out.println("Amount to deposit--->"+depositAmt);
		this.balance+=depositAmt;
		System.out.println("Total Balance is--->"+getBalance());
	}
	
	public void withdrawAmount(double withdrawalAmt){
		System.out.println("Amount to withdraw--->"+withdrawalAmt);
		if(this.getBalance()<withdrawalAmt){
			System.out.println("Insufficient funds");
		}else{
			this.balance-=withdrawalAmt;
			System.out.println("Total Balance is--->"+getBalance());
		}
	}

}
