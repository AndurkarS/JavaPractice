
public class Main {

	public static void main(String[] args) {
		BankAccount acct1 = new BankAccount();
		acct1.setAccountNumber("123456");
		acct1.setBalance(10000.00);
		acct1.setCustomerName("Shrirang");
		acct1.setEmail("abc@gmail.com");
		acct1.setPhoneNo("1234567890");
		
		acct1.depositFunds(10000.00);
		acct1.withdrawAmount(10000.00);
		
		BankAccount acct2 = new BankAccount("765432", 20000.0, "Shrirang", "abc@gmail.com", "123456");
		acct2.depositFunds(10000.00);
		acct2.withdrawAmount(10000.00);
		System.out.println(acct2.getAccountNumber());
		System.out.println(acct2.getCustomerName());
		
		VipCustomer cust1 = new VipCustomer();
		System.out.println(cust1.getCustomerName());
		System.out.println(cust1.getCreditLimit());
		System.out.println(cust1.getEmail());
		
		VipCustomer cust2 = new VipCustomer("Shrirang", 30000.00);
		System.out.println(cust2.getCustomerName());
		System.out.println(cust2.getCreditLimit());
		System.out.println(cust2.getEmail());
		
		VipCustomer cust3 = new VipCustomer("Shrirang", 20000.00, "abc@gmail.com");
		System.out.println(cust3.getCustomerName());
		System.out.println(cust3.getCreditLimit());
		System.out.println(cust3.getEmail());
		
	}

}
