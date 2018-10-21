package Lab01;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {

//		Scanner readIn = new Scanner(System.in);
//
//		System.out.println("Enter X value: ");
//		int numX = readIn.nextInt();
//
//		System.out.println("Enter Y value: ");
//		int numY = readIn.nextInt();
//
//		System.out.println("Enter N Value: ");
//		int numN = readIn.nextInt();
//		long finalResult = 0;
//		long sum;
//		long total;
//		for (int i = 0; i <= numN; i++) {
//
//			total = i * numN;
//			
//			 finalResult = calculateXvalue(numX, numN) * calculateXvalue(numY, numN);
//			
//		}
//		System.out.println(finalResult);

		long x1 = calculateBionimal(3, 0);
		long x2 = calculateBionimal(3, 1);
		long x3 =calculateBionimal(3, 2);
		long x4 =calculateBionimal(3, 3);
		
		System.out.println(x1 + " " + " "+  x2 +" "+ x3 +"  "+ x4);
		
	}

	private static long calculateYvalue(int y, int n) {

		int a = 0;
		for (int i = 1; i <= n; i++) {
			a = y * n;

		}

		return a;
	}

	private static long calculateXvalue(int x, int n) {
		int b = 0;
		for (int i = 1; i <= n; i++) {
			b = x * n;
			n--;
		}

		return b;

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

}
