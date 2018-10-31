package Ex11;

import java.util.Scanner;

public class Ex11_709 {
	public void inputNums(double [] x) {
		Scanner readIn = new Scanner(System.in);
		System.out.println("Enter Numbers:");
		for(int  i = 0 ; i < x.length ; i++ ) {
			x[i] = readIn.nextDouble();
		}
	}

	public double min(double [] x) {
		double min = x[0];
		
		for (int i = 0 ; i <x.length ; i++) {
			if (x[i] < min ) {
				min = x[i];
			}
		}
	
		
		return min;
	
		
	}
}
