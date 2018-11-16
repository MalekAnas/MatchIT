package Lab2_BankingSystem;

public class Connections {
	
	Account account;
	Customer customer;
	
	
	Connections(Account account , Customer customer){
		this.account = account;
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Connections [account=" + account + ", customer=" + customer + "]";
	}

	
}
