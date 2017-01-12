
public class VipCustomer {
	
	private String customerName;
	private double creditLimit;
	private String email;
	
	public VipCustomer(){
		this("DefaultName",0.0,"DefaultEmail");
	}
	
	public VipCustomer(String customerName,double creditLimit){
		this(customerName,creditLimit,"DefaultEmail");
	}
	
	public VipCustomer(String customerName, double creditLimit, String email) {
		super();
		this.customerName = customerName;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	public String getCustomerName() {
		return customerName;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getEmail() {
		return email;
	}
	

}
