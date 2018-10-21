package Lab01;

import java.util.Scanner;

public class Lab1_1 {

	public static void main(String[] args) {
			// here is the ex 01
		
		
		
		Scanner readIn = new Scanner(System.in);
		System.out.println("Enter the base: ");
		int base = readIn.nextInt(); 
		System.out.println("Enter the base: ");
		int power = readIn.nextInt(); 
		readIn.close();
		int result = powerSum(base, power); 
		System.out.println("the result is :" + result);

	}

	public static int powerSum(int x, int n) {

		int sum = 1;
		int total = 0;

		for (int i = 1; i <= n; i++) {

			if (x < 0)
				break;
			sum = x * sum;
			total = total + sum;
		}
		return total;

	}

}
