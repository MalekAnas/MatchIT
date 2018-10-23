package Ex03;

import java.util.Scanner;

import javafx.beans.property.ReadOnlyIntegerWrapper;


public class Main {

	public static void main(String[] args) {

		/* Here is Ex01
		 * 
		 * Faninical application/ compund values
		 * 
		 * this exercise will be needed in 5.3 with 
		 * changing the algorithm to make it have a for loop.
		 */
		
		/*
		double annualInterestRate = 0.05;
		double monthlyInterestRate = annualInterestRate / 12;
		System.out.println("Enter the monthly saving amount: ");
		Scanner readIn = new Scanner(System.in);
		double monthlySavingAmount = readIn.nextDouble();
		
		double subTotal = monthlySavingAmount * (1 + monthlyInterestRate);
		subTotal = (monthlySavingAmount + subTotal) * (1 + monthlyInterestRate);
		subTotal = (monthlySavingAmount + subTotal) * (1 + monthlyInterestRate);
		subTotal = (monthlySavingAmount + subTotal) * (1 + monthlyInterestRate);
		subTotal = (monthlySavingAmount + subTotal) * (1 + monthlyInterestRate);
		subTotal = (monthlySavingAmount + subTotal) * (1 + monthlyInterestRate);
		
		 
		 
		 
		double total = subTotal;
		System.out.printf("After the Sixth month tha value of the account will be : %.2f$ ",total);
		 */
		 
		
		
		/* Here is Ex02
		 * 
		 * Health application/ computing BMI
		 */
		
		/*
		Scanner readIn = new Scanner(System.in);
		
		System.out.println("Enter whieght in pounds: ");
		double wheightPounds = readIn.nextDouble();
		System.out.println("Enter height in Inches: ");
		double heightInches = readIn.nextDouble();
		
		double weightKg = wheightPounds * 0.45359237;
		double heightMeters = heightInches * 0.0254;
		
		double bmiValue = weightKg  / Math.pow(heightMeters, 2) ; 
		
		System.out.printf("BMI value is %.4f : ", bmiValue);
		*/
		
		
		/* Here is Ex03
		 * Geometry distance of two points
		 */
		
		/*
		Scanner readIn = new Scanner(System.in);
		
		double x1, x2, y1, y2;
		System.out.println("Enter X1 and Y1: ");
		x1 = readIn.nextDouble();
		y1 = readIn.nextDouble();
		
		System.out.println("Enter X2 and Y2: ");
		x2 = readIn.nextDouble();
		y2 = readIn.nextDouble();
		double distance = Math.pow((Math.pow((x2-x1), 2)+ Math.pow((y2-y1), 2)), 0.5);
		System.out.printf("The distance between two points is %.4f : "+ distance);
		*/
		
		
		/*
		 * Here is Ex04
		 * Geometry Area of a hexagon
		 */
		
		/*
		Scanner  readIn = new Scanner(System.in);
		System.out.println("Enter the side : ");
		
		double side = readIn.nextDouble();
		
		double area =( (3* Math.pow(3, 0.5))/2) * Math.pow(side ,2);
		
		System.out.printf("The area of the hexagon is: %.4f ", area);
		*/
		
		
		/* Here is Ex04
		 * Sience: wind-Chill temperature 
		 */
		
		double ta;
		
		
		
	}
	 
	
	
	

}
