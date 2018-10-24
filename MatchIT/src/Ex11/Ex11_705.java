package Ex11;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11_705 {

	private int distinctNums = 0; // feild to define the number of disinct numbers

	public int getDistinctNums() {
		return distinctNums;
	}

	public void inputNumbers(int[] x) {
		Scanner readIn = new Scanner(System.in);

		System.out.println("Enter 10 Numbers: ");

		for (int i = 0; i < x.length; i++) {
			int number = readIn.nextInt();
			x[i] = number;

		}
	}

	public void printDistinct(int x[]) {
		// First sort the array so that
		// all occurrences become consecutive
		Arrays.sort(x); //
		
		// Traverse the sorted array
		for (int i = 0; i < x.length; i++) {
			distinctNums++;
			// Move the index ahead while
			// there are duplicates
			while (i < x.length - 1 && x[i] == x[i + 1])
				i++;

			// print last occurrence of
			// the current element
			System.out.print(x[i] + " ");
		}
	}
}
