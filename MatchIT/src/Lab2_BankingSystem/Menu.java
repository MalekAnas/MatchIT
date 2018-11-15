package Lab2_BankingSystem;

import java.util.Scanner;

public class Menu {

	Scanner readIn = new Scanner(System.in);
	Bank bank = new Bank();
	boolean exit;

	public static void main(String[] args) {

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
		System.out.println("|          Welcom to Malek's Bank App          |");
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
			//makeAdeposite();
			break;
		case 3: 
			//makeAwithdraw();
			break;
		case 4:
			//listAccountBalance();
			break;
		default: 
			System.out.println("Unknown error happend");
			break;
			
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}

	private void createAccount() {

		double initalBalance;
		String name;
		String personalSecNum;
		String accountType;
		
		//Select the type of account
	
		boolean savingVaild = false;
		
		//still testing
		System.out.println();
	}

}
