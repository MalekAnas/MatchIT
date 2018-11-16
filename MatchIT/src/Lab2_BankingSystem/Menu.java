package Lab2_BankingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	Scanner readIn = new Scanner(System.in);
	Bank bank = new Bank();
	boolean exit;

	public static void main(String[] args) {

		Menu menu = new Menu();

		menu.runMenu();

	}

	public void runMenu() {
		printHeader();
		while (!exit) {
			printMenu();
			int choice = getInput();
			doAnAction(choice);
		}
	}

	private void printHeader() {

		System.out.println("+----------------------------------------------+");
		System.out.println("|         Welcom to Malek's Bank System        |");
		System.out.println("+----------------------------------------------+");

	}

	private void printMenu() {

		System.out.println(" Please make a choice:");
		System.out.println("1) New Account. ");
		System.out.println("2) Make a deposit. ");
		System.out.println("3) Make a withdraw. ");
		System.out.println("4) List account information. ");
		System.out.println("0) Exit. ");
	}

	private int getInput() {

		int choice = -1;
		do {
			System.out.println("Enter your choice: ");
			try {
				choice = Integer.parseInt(readIn.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("Invaild choice, choice should be number!");
			}
			if (choice < 0 || choice > 4) {
				System.out.println("Choice is not vaild, choose 1, 2, 3 or 4, and 0 to exit!");
			}
		} while (choice < 0 || choice > 4);
		return choice;

	}

	private void doAnAction(int choice) {

		switch (choice) {

		case 0:
			System.out.println("Program finished, Thank you!");
			System.exit(0);
			break;
		case 1:
			createAccount();
			break;
		case 2:
			makeAdeposite();
			break;
		case 3:
			// makeAwithdraw();
			break;
		case 4:
			// listAccountBalance();
			break;
		default:
			System.out.println("Unknown error happend");
			break;

		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

	private void createAccount() {

		double initalBalance = 0;
		String name = "";
		String personalSecNum = "";
		String accountType = "";
		boolean vaild = false;

		// Select the type of account
		while (!vaild) {
			System.out.println("Enter an account type (Saving or Checking): ");
			accountType = readIn.nextLine();
			if (accountType.equalsIgnoreCase("checking") || accountType.equalsIgnoreCase("Saving")) {
				vaild = true;

			} else {
				System.out.println("Account type selection faild, enter checking or saving!");

			}
		}

		System.out.println("Enter Account holder name: ");
		name = readIn.nextLine();
		System.out.println("Enter your personal security number: ");
		personalSecNum = readIn.nextLine();

		vaild = false;
		while (!vaild) {
			System.out.println("Enter your initial balance:");
			try {
				initalBalance = Double.parseDouble(readIn.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Obs! Balance should be a number!");
			}

			if (accountType.equalsIgnoreCase("checking")) {
				if (initalBalance < 100) {
					System.out.println("checking account needs 100 pounds to be opened.");
				} else
					vaild = true;
			}

			if (accountType.equalsIgnoreCase("saving")) {
				if (initalBalance < 10) {
					System.out.println("saving account needs 10 pounds to be opened.");
				} else
					vaild = true;
			}

		}

		Account account;
		if (accountType.equalsIgnoreCase("checking")) {
			account = new Checking(initalBalance);
		} else {
			account = new Savings(initalBalance);
		}

		Customer customer = new Customer(name, personalSecNum, account);
		bank.addCustomer(customer);

	}
	
	
	
	
	
	
	
	
	
	
	

	private void makeAdeposite() {
		int account = chooseAccount();
		System.out.println("Enter the amount of the deposit: ");
	
		double depositAmount =0;
		try {
			depositAmount = Double.parseDouble(readIn.nextLine());
			
			
		} catch (NumberFormatException e) {
			depositAmount = 0;
		}
		
		bank.getCusomer(account).getAccount().deposit(depositAmount);
	}

	private int chooseAccount() {
		
		ArrayList<Customer> customers = bank.getCustomers();
		System.out.println("Select the acocunt: ");
		for (Customer customer : customers) {
			System.out.println(customer  );
		}
		return 0;
	}

}
