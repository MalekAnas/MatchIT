package Lab01;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {

//		// here is the ex 01
//		// here we define the Scanner obj
//		Scanner readIn = new Scanner(System.in);
//		System.out.println("Enter the base: ");
//		int base = readIn.nextInt(); // the base number
//		System.out.println("Enter the base: ");
//		int power = readIn.nextInt(); // the power
//		readIn.close();
//		int result = powerSum(base, power); // callin the method which calculate
//		// the power of x to the power n and
//		// calculate the summition of all products.
//		System.out.println("the result is :" + result);

		
		
		long x= bionimalExp(3, 5, 2);
		System.out.println(x);
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
	
	
	public static long factoriaLCalc(int x) {
		long factorial = 1;
		for (int i = x; i >= 1; i--)
		{
			factorial = factorial* i;
		}
		return factorial;
	}
	
	
	public static long calculateBionimal(int n, int k) {

		if (k > n - k) {
			k = n - k;
		}

		long b = 1;

		for (int i = 1, m = n; i <= k; i++, m--) {

			b = b * m / i;

		}
		return b;
	}
	
	
	public static long bionimalExp(int n, int x, int y) {
		
		long product = 0;
		
		for(int k = 0; k<=n ; k++) {
			
			product += calculateBionimal(n, k)* Math.pow(x, n-k) * Math.pow(y, k);
		}
		return product;
		
		
		
	}
	
}
