package Lab2_BankingSystem;

public class Checking extends Account{


	private static String accountType = "checking";
	
	
	Checking(double initialBalance){
		super();
		this.setBalance(initialBalance);
		this.chekInterest();
	}


	@Override
	public String toString() {
		return "Account type: " + accountType +" Account\n" + "Account Number : " +this.getAccountNumber()+ " \n" + "Balance : "+ this.getBalance() +
		 "\n" + "Interest rate :" + this.getInterest() + " % \n";
	}
	
	
	

}
