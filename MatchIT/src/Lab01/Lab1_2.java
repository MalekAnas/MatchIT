package Lab01;

import java.util.Scanner;

public class Lab1_2 {
	
	

	public static void main(String[] args) {

		Scanner  readIn = new Scanner(System.in);
		
		System.out.println("Enter X, Y and N values: ");
		int x = readIn.nextInt();
		
		int y = readIn.nextInt();

		int n = readIn.nextInt();

		readIn.close();
	
		
		long total = bionimalExp(n, x, y);
		
		System.out.println(total);
		
		
		
		
		
		
	}
	
	public static long factoriaLCalc(int x) {
		long factorial = 1;  
		
		
		for (int i = x; i >= 1; i--)
		{
			factorial = factorial* i;
		}
		return factorial;
	}
	
	//
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
		
		for(int i = 0; i<=n ; i++) {
			
			product += calculateBionimal(n, i)* Math.pow(x, n-i) * Math.pow(y, i);
		}
		return product;
		
		
		
	}

}
