package Ex11;

import java.util.Scanner;

public class Ex11_708 {

	private int countInputs = 0;
	
	public void inputNums(int [] x) {
		
		Scanner readIn = new Scanner(System.in);
		System.out.println("Enter Numbers: ");

		for(int i  = 0 ; i < x.length; i++) {
		x[i] = readIn.nextInt();
		this.countInputs++;
		}
	}
	
	public void inputNums(double [] y) {
		Scanner readIn = new Scanner(System.in);
		System.out.println("Enter Numbers: ");
		for(int i  = 0 ; i < y.length; i++) {
			y[i] = readIn.nextDouble();
			this.countInputs++;
			}
	}
	
	
	public int average(int [] x)
	{
		int average = 0;
		int sum = 0; 
		
		for(int i = 0 ; i < x.length ; i++) {
			sum += x[i];
			
		}
		
		average = sum / this.countInputs;
		
		return average;
	}
	
	
	public double average(double [] x)
	{
		double average = 0;
		double sum = 0; 
		
		for(int i = 0 ; i < x.length ; i++) {
			sum += x[i];
			
		}
		
		average = sum / this.countInputs;
		
		return average;
	}
	
}
