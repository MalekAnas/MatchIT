package Lab02_BankingSystem;

public class CheckAccount implements IbankAccount {

	private long accountNo;
	private double balance;

	private boolean isVaild = false;
	
	
	
	
	
	
	
	
	
	
	public long getAccountNo() {
		return accountNo;
	}

	public double getBalance() {
		return balance;
	}

	void calculateCharges() {
	}

	void calculateInterest() {

	}

	@Override
	public double returnBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}

	@Override
	public void updateBalance() {

		
	}

}
