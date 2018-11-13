package Lab2_BankingSystem;

import java.util.ArrayList;

public class Customer{

	String name;
	String address;
	ArrayList<BankAccount> CustomerAccounts = new ArrayList<>();
	
	
	
	
	
	
	
	
	public Customer(String name, String address, ArrayList<BankAccount> customerAccounts) {
		this.name = name;
		this.address = address;
		CustomerAccounts = customerAccounts;
	}
	
	
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	private void setName(String name) {
		this.name = name;
	}
	private void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	
	
	
}
