package Ex11;

import java.util.Scanner;

public class Ex11_704 {
	
	
	private double numberOfScores = 0;
	public int aboveTheAvg = 0;
	public int underTheAvg = 0;
	
	
	

	public double getNumberOfScores() {
		return numberOfScores;
	}

	public void displayScores(double [] x) {

		for (int i = 0; i <= getNumberOfScores()-1; i++) {

			if (x[i] >= average(x)) {
				this.aboveTheAvg++;
				
			} else if (x[i] < average(x) ) {

				this.underTheAvg++;
			}

		}
		System.out.println("Above or equal the avg: " + aboveTheAvg);
		System.out.println("Under the avg: " +underTheAvg);

	}

	public double [] myArray = new double [100];

	public void printArray(double[] x) {

		for (int i = 0; i <= x.length -1; i++) {
			System.out.println(x[i]);
		}
	}

	public double average(double [] x) {

		double average = 0;

		double sum = sumValues(x);
		return average = sum / getNumberOfScores();

	}

	public double sumValues(double[] x) {
		double total = 0;

		for (double element : x) {
			total += element;
		}
		return total;
	}

	public void inputScores(double [] x) {

		Scanner readScore = new Scanner(System.in);

		System.out.println("Enter a score:");

		for (int i = 0; i < x.length -1 ; i++) {

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
