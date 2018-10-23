package Ex11;

import java.util.Scanner;

public class Ex11_704 {
	public int numberOfScores=0;

	public int getNumberOfScores() {
		return numberOfScores;
	}

	public void displayScores(int [] x) {
		
		
		
		
		
		
		
		
		
	}








	public int[] myArray = new int[100];

	public void printArray(int[] x) {

		for (int i = 0; i <= x.length - 1; i++) {
			System.out.println(x[i]);
		}
	}

	
	
	
	
	
	public double average(int[] x) {

		double average = 0;
	

		
		int sum = sumValues(x);
		return average = sum / getNumberOfScores();

	}
	
	
	
	
	

	public int sumValues(int[] x) {
		int total = 0;

		for (int element : x) {
			total += element;
		}
		return total;
	}
	
	
	
	
	
	
	
	

	public void inputScores(int[] x) {

		int numberOfScores=0;
		Scanner readScore = new Scanner(System.in);

		System.out.println("Enter a score:");

		for (int i = 0; i < x.length; i++) {

			int score = readScore.nextInt();
			if (score >= 0) {
				
				this.numberOfScores++;
				x[i] = score;
			} else {
				
				
				break;
			}

		}

	}

}
