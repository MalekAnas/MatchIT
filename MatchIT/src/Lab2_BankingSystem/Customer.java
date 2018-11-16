package Lab2_BankingSystem;

public class Customer {
	
	String name;
	String personalSecNum;
	Account account;

	public Customer(String name, String personalSecNum, Account account) {
		
		this.name = name;
		this.personalSecNum = personalSecNum;
		this.account = account;
	}

	
	
	
	



	Account getAccount() {
		return account;
	}








	@Override
	public String toString() {
		return "\n                       <Customer information>\n" +
			   "Name : " + name + "\n" + "Personal Security Number: " + personalSecNum + "\n" + account;
		
	}
	
	
	
	

}
