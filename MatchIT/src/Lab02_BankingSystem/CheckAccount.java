package Lab02_BankingSystem;

public class CheckAccount implements IbankAccount {

	long accountNo;
	double balance;

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
		return 0;
	}

	@Override
	public void updateBalance() {
		// TODO Auto-generated method stub

	}

}
