package Lab2_BankingSystem;

import java.util.ArrayList;

public class Bank {

	ArrayList<Customer> customers = new ArrayList<>();
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	 Customer getCusomer(int account) {
		return customers.get(account);
	}


	






}

