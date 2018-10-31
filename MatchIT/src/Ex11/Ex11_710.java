package Ex11;

import java.util.Scanner;

public class Ex11_710 {

	public void inputNums(double [] x) {
		Scanner readIn = new Scanner(System.in);
		System.out.println("Enter Numbers:");
		for(int  i = 0 ; i < x.length ; i++ ) {
			x[i] = readIn.nextDouble();
		}
	}
	
	public int indexOfMin(double [] x) {
		double min = x[0];
		int indexOfmin = 0;
		for (int i = 0 ; i <x.length ; i++) {
			if (x[i] < min ) {
				min = x[i];
	
				indexOfmin = i;
				
			}
		}
	
		
		return indexOfmin;
	
		
	}
}
