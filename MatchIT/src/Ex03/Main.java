package Ex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Here is Ex01
		 * 
		 * Faninical application/ compund values
		 * 
		 * this exercise will be needed in 5.3 with changing the algorithm to make it
		 * have a for loop.
		 */

		/*
		 * double annualInterestRate = 0.05; double monthlyInterestRate =
		 * annualInterestRate / 12;
		 * System.out.println("Enter the monthly saving amount: "); Scanner readIn = new
		 * Scanner(System.in); double monthlySavingAmount = readIn.nextDouble();
		 * 
		 * double subTotal = monthlySavingAmount * (1 + monthlyInterestRate); subTotal =
		 * (monthlySavingAmount + subTotal) * (1 + monthlyInterestRate); subTotal =
		 * (monthlySavingAmount + subTotal) * (1 + monthlyInterestRate); subTotal =
		 * (monthlySavingAmount + subTotal) * (1 + monthlyInterestRate); subTotal =
		 * (monthlySavingAmount + subTotal) * (1 + monthlyInterestRate); subTotal =
		 * (monthlySavingAmount + subTotal) * (1 + monthlyInterestRate);
		 * 
		 * 
		 * 
		 * 
		 * double total = subTotal; System.out.
		 * printf("After the Sixth month tha value of the account will be : %.2f$ "
		 * ,total);
		 */

		/*
		 * Here is Ex02
		 * 
		 * Health application/ computing BMI
		 */

		/*
		 * Scanner readIn = new Scanner(System.in);
		 * 
		 * System.out.println("Enter whieght in pounds: "); double wheightPounds =
		 * readIn.nextDouble(); System.out.println("Enter height in Inches: "); double
		 * heightInches = readIn.nextDouble();
		 * 
		 * double weightKg = wheightPounds * 0.45359237; double heightMeters =
		 * heightInches * 0.0254;
		 * 
		 * double bmiValue = weightKg / Math.pow(heightMeters, 2) ;
		 * 
		 * System.out.printf("BMI value is %.4f : ", bmiValue);
		 */

		/*
		 * Here is Ex03 Geometry distance of two points
		 */

		/*
		 * Scanner readIn = new Scanner(System.in);
		 * 
		 * double x1, x2, y1, y2; System.out.println("Enter X1 and Y1: "); x1 =
		 * readIn.nextDouble(); y1 = readIn.nextDouble();
		 * 
		 * System.out.println("Enter X2 and Y2: "); x2 = readIn.nextDouble(); y2 =
		 * readIn.nextDouble(); double distance = Math.pow((Math.pow((x2-x1), 2)+
		 * Math.pow((y2-y1), 2)), 0.5);
		 * System.out.printf("The distance between two points is %.4f : "+ distance);
		 */

		/*
		 * Here is Ex04 Geometry Area of a hexagon
		 */

		/*
		 * Scanner readIn = new Scanner(System.in);
		 * System.out.println("Enter the side : ");
		 * 
		 * double side = readIn.nextDouble();
		 * 
		 * double area =( (3* Math.pow(3, 0.5))/2) * Math.pow(side ,2);
		 * 
		 * System.out.printf("The area of the hexagon is: %.4f ", area);
		 */

		/*
		 * Here is Ex04 Sience: wind-Chill temperature
		 */

//		double temperatureOutside; // should be more than -58f and less than 41f
//		double windSpeed; // should be more than 2 miles per hour
//		double windChillTemperature;
//		Scanner readIn = new Scanner(System.in);
//		System.out.println("Enter the temperature in fahrenheit between -58 f and 41 f: ");
//		temperatureOutside = readIn.nextDouble();
//		System.out.println("Enter the wind speed (>= 2) in miles per hour: ");
//		windSpeed = readIn.nextDouble();
//
//		boolean isItUsable = false;
//		if ((temperatureOutside < 41 || temperatureOutside > -58) || windSpeed >= 2) {
//			isItUsable = true;
//			//// the
//			//// formula//////////////////////////////////////////////////////////////////////////////////
//			windChillTemperature = 35.74 + 0.6215 * temperatureOutside - 35.75 * Math.pow(windSpeed, 0.16) + //
//					0.4275 * temperatureOutside * Math.pow(windSpeed, 0.16); //
//			/////////////////////////////////////////////////////////////////////////////////////////////////
//			System.out.println(windChillTemperature);
//		} else {
//			isItUsable = false;
//			System.out.println("Invaild input! ");
//		}
//	

		/*
		 * Print a table
		 */
//		int a , b = 2;
//		System.out.printf("Number a:          Number b:          Pow(a,b): \n");	
//		for(a = 1, b =2 ; a <= 5 ; a++, b++) {			
//			int c = (int) Math.pow(a, b);			
//			System.out.printf("%d                  %d                  %d \n", a,b,c);
//		}
//		

		/*
		 * Geometry area of a triangle
		 */

		// find the area of a triangle

//		double side1 = 0;
//		double side2 = 0;
//		double side3 = 0;
//		Scanner readIn = new Scanner(System.in);
//		// obtain three points for a triangle
//		System.out.println("Enter three points for a triangle : ");
//		double side1x = readIn.nextDouble();
//		double side1y = readIn.nextDouble();
//		double side2x = readIn.nextDouble();
//		double side2y = readIn.nextDouble();
//		double side3x = readIn.nextDouble();
//		double side3y = readIn.nextDouble();
//		// find length of sides of triangle
//		side1 = Math.pow(Math.pow((side2x - side1x), 2) + Math.pow((side2y - side1y), 2) , 0.5);
//		side2 = Math.pow(Math.pow((side3x - side2x), 2) + Math.pow((side3y - side2y), 2) , 0.5);
//		side3 = Math.pow(Math.pow((side1x - side3x), 2) + Math.pow((side1y - side3y), 2) , 0.5);
//		double s = (side1 + side2 + side3) / 2;
//		double area = Math.pow((s*(s-side1) * (s - side2 ) * (s- side3)) , 0.5);
//		System.out.printf("The area of the triangle is : %.1f " , area);

		
		
		
		/*
		 * Finanicial application: calculate interest
		 */
		
//		double balance = 0;
//		double interestRate = 0;		
//		Scanner readIn = new Scanner(System.in);		
//		System.out.println("Enter the balance and interest rate (e.g , 3 for 3%) :");
//		balance = readIn.nextDouble();
//		interestRate = readIn.nextDouble() / 100;
//		double interest = balance *(interestRate/12);
//		System.out.printf("Ther interest is :  %.5f" , interest);
//		
		
		
		
		
		
		/*
		 * Financial application calculate future invesment value:
		 */
		
//		double invesmentValue = 0;
//		double annualInterest = 0;
//		int numberOfYears = 0;
//		double theFutureInvesment = 0;		
//		Scanner readIn = new Scanner(System.in);		
//		System.out.println("Enter Invesment amount: ");
//		invesmentValue = readIn.nextDouble();		
//		System.out.println("Enter annual interest rate in percentage: ");
//		annualInterest = readIn.nextDouble() / 100;		
//		System.out.println("Enter number of years: ");
//		numberOfYears  = readIn.nextInt();				
//		theFutureInvesment = invesmentValue * Math.pow( (1 + (annualInterest / 12)) , (numberOfYears * 12)) ;		
//		System.out.printf("Accumulated value is : %.2f " , theFutureInvesment);
//		
		
		
		/*
		 * cost of driving
		 */
//		Scanner readIn = new Scanner(System.in);		
//		double drivingDistance;
//		double milesPerGalon;
//		double pricePerGalon;		
//		System.out.println("Enter the distance to drive: ");
//		drivingDistance = readIn.nextDouble();
//		System.out.println("Enter the miles per Gallon : ");
//		milesPerGalon = readIn.nextDouble();
//		System.out.println("Enter the price per Gallon : ");
//		pricePerGalon = readIn.nextDouble();				
//		double cost = (drivingDistance / milesPerGalon) * pricePerGalon;		
//		System.out.printf("The cost of driving : %.2f" , cost);
		
		
		
		/// end of Ex03
		
		
		
		
		
		
		
		
	}

}
