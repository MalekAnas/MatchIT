package Lab01;

import java.util.Scanner;

public class Lab1_3 {

	
	public static void main(String[] args) {
		
		
		
		
		

		Scanner  readIn = new Scanner(System.in);
		
		
		
		System.out.println("Enter a, b and n values: ");
		double a = readIn.nextInt();
		
		double b = readIn.nextInt();

		int    n = readIn.nextInt();
		
		readIn.close();
		
		double deltaX = (b - a) / n;
		double total = calculateTotal(a, b, n, deltaX);
		System.out.println(total);

	}
	
	
	
	

	public static double calculateXi(int i, double deltaX, double a) {

		double x = 0;
		
		x = a + (i * deltaX);

		return x;

	}
	public static double calculateYi(int i, double deltaX, double xi) {
		
		
		double y = 0;
		
		y = 1.0 / (1 + xi);
		if (i%2==0) {
			y = 2 * y;
			
		}
		else if (i%2 != 0 ){
			
			y= 4*y;
		}
		
		return y;
		
	}
	
	public static double calculateTotal(double a, double b , int n, double deltaX) {

		double y = 0;
		double sum = 0;
		

		
		double y0  = 1.0 / (1+calculateXi(0, deltaX, a));
		double yn  = 1.0 / (1+calculateXi(n, deltaX, a));
		
		System.out.println(y0 + "   " + yn);
		
		
		for (int i = 1; i <= n-1; i++ ) {
			
			y = y+calculateYi(i, deltaX, calculateXi(i, deltaX, a));
		
			
			
			
		}
		
		double total= y0 + yn + y;

		double delta = deltaX/3;
		return total* delta;

	}
}
