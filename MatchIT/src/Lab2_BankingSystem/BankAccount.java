package Lab2_BankingSystem;

import java.util.ArrayList;

public class BankAccount {

	double balance;
	int accountNo;
	ArrayList<Customer> costumers = new ArrayList<>();
	
	




	public BankAccount(double balance, int accountNo, ArrayList<Customer> costumers) {
		this.balance = balance;
		this.accountNo = accountNo;
		this.costumers = costumers;
	}




	public double getBalance() {
		return balance;
	}




	public int getAccountNo() {
		return accountNo;
	}




	public double returnBalanc(){
		
		return this.balance;
	}
	
	
	private void updateBalance(double balance) {
		
		this.balance = balance;
	}
}
