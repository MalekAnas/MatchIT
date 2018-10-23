package Ex11;

import java.util.Scanner;

public class Ex11_703 {

	/*
	 * Count Occerences of number
	 * 
	 * 
	 * 
	 * 
	 */

	public int[] CountOccOFNums = new int[100];

	public Ex11_703() {
	}

	public Ex11_703(int[] countOccOFNums) {
		this.CountOccOFNums = countOccOFNums;
	}

	public void displayOccurences(int[] x) {
		System.out.printf("Integers %s Occurences\n", "     ");

		for (int i = 0; i <= x.length - 1; i++) {
			if (x[i] > 1) {
				
				System.out.printf("%d %s %d times \n", i, "           ", x[i]);
				
			}
			else if (x[i] == 1) {
				System.out.printf("%d %s %d time \n", i, "           ", x[i]);

			}
		}
	}

	public void inputNumber(int[] x) {

		Scanner readIn = new Scanner(System.in);
		System.out.println("Enter an integer, input 0 to finish : ");
		int value = readIn.nextInt();

		while (value > 0 && value < 100) {

			x[value]++;
			System.out.println("Enter Integer: ");
			value = readIn.nextInt();

		}

	}

}
