package Ex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Here is Ex 3.1 Finanicial application: compund value
		 */

		double savinAmount = 0;
		double annualyInterestRate = 0.05;
		double monthlyInterestTate = annualyInterestRate / 12;
		Scanner readIn = new Scanner(System.in);
		System.out.println("Enter saving amount: ");
		savinAmount = readIn.nextDouble();
		double subTotal = savinAmount * (1 + monthlyInterestTate);
		subTotal = (savinAmount + subTotal) * (1 + monthlyInterestTate);
		subTotal = (savinAmount + subTotal) * (1 + monthlyInterestTate);
		subTotal = (savinAmount + subTotal) * (1 + monthlyInterestTate);
		subTotal = (savinAmount + subTotal) * (1 + monthlyInterestTate);
		subTotal = (savinAmount + subTotal) * (1 + monthlyInterestTate);
		System.out.printf("The total value of the account after six months is : %. ", subTotal);
	}

}
