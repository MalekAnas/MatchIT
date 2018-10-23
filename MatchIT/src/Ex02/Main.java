package Ex02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		
		/*
		 * 
		 * Here is the first ex.
		
		
		
		
		//////////////////////Here the code starts////////////////////
		 * 
		 * 
		 *  
		double degreeCil =0;
		double degreefih =0;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a degree in cilisus : ");
		degreeCil = reader.nextDouble();
		
		
		degreefih = (9.0 / 5.0) * (degreeCil) + 32;
		System.out.println(degreeCil + " cilisus is " + degreefih + "Fahrenheit.");
	*/
		
	
		
		
		
		
		
		
		/*
		 * Here is Ex 2.2 
		 
		
		//////////////////////the code starts here////////////////////////
		
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter the radius and the height of the cylinder : ");
		
		double radius = reader.nextDouble();
		double height  = reader.nextDouble();
		
		double area = radius * radius * Math.PI;
		double vol = area * height;
		
		
		System.out.printf("%s %s %.4f \n" , "area is :" , "  ", area);
		System.out.printf("%s %s %.2f \n" , "area is :" , "  ", vol );
	
	
		*/
		
		
		
		
		/*
		 * here is Ex 2.3
		 */
		/*
		double numberFeet;
		double numberMeter;
		System.out.println("Enter a value for feet:");
		
		Scanner readIn = new Scanner(System.in);
		
		numberFeet = readIn.nextDouble();
		
		numberMeter= numberFeet*0.305;
		System.out.print(numberFeet + " feet is  "+ numberMeter + " Meters: ");
		System.out.println(numberMeter);
		
		*/
		
		
		
		/*here is Ex 2.4
		 * 
		 */
		
		/*
		double numPounds; double numKiloGrams;
		System.out.println("Enter a value in Pounds: ");

		Scanner readIn = new Scanner(System.in);
		
		numPounds = readIn.nextDouble();
		
		numKiloGrams = numPounds * 0.454;
		System.out.println(numPounds + " pounds is : " + numKiloGrams+ " KiloGrams.");

		*/
		
		
		
		/* Here is Ex 2.5
		 * 
		 */
		
		/*
		double gratuityRate;
		double subTotal;
		
		Scanner readIn = new Scanner(System.in);
		System.out.println("Enter tne subtotal and a gratuity rate: ");
		subTotal = readIn.nextDouble();		
		gratuityRate= (readIn.nextDouble() /100);
		
		
		
		double gratuity = subTotal * gratuityRate;
		double total = gratuity + subTotal;
		
		System.out.println("The gratuity is "+ gratuity + " $, and total is " + total + "$.");
	*/
		
		
		
		/* 
		 * Here is Ex 2.6
		 */
		/*
		Scanner readIn = new Scanner (System.in);
		System.out.println("Enter an integer between 0 and 1000: ");
		int num = readIn.nextInt();
		
		int numones = num%10;
		num = num/10;

		
		int numTens = num%10;
		num = num/10;


		

		int numHund = num%10;
		int total = numones+numTens+numHund;
		
		System.out.println("The sum of the digits is : " + total);
		*/
		
		
		
		/*
		 * Here is Ex 2.7
		 * 
		 */
		
		
		/*
		Scanner readIn = new Scanner(System.in);
		long minutes ;
		System.out.println("Enter the number of minutes: ");
		minutes = readIn.nextLong();
		readIn.close();
		long years;
		long days;
		
		days = minutes / 1440;
		years = days /365;
		days = (minutes/ 1440) - (years * 365);
	    
	    System.out.println(minutes + " minutes is  " + years + " Years, and "+ days +" Days.");
	     */
		
		
		
		
		
		/* Here is Ex 2.8
		 * 
		 * 
		 */
		
		/*
		Scanner readIn = new Scanner(System.in);
		long time = System.currentTimeMillis() ;
		System.out.println("Enter the time zone offset to GMT: ");
		
		int offsetChange = readIn.nextInt();
		int hour; int minute; int second;
		
		 second = (int) (time / 1000) % 60 ;
		 minute = (int) ((time / (1000*60)) % 60);
		 hour   = (int) ((time / (1000*60*60)) % 24);
		
		System.out.printf("%S is %2d : %2d : %2d \n", "The Current GMT time is " , hour, minute, second);
		
		System.out.printf("%S is %2d : %2d : %2d \n", "The Current time in the entered time zone is: " , hour + offsetChange, minute, second);
		*/
		
		
		
		
		
		
		
		
		
		
		
		/* 
		 * Here is Ex 2.9
		 */
		 
		/*
		Scanner readIn = new Scanner(System.in);
		System.out.println("Enter the v0 , v1 and t  : ");
		double v0 = readIn.nextDouble();
		double v1 = readIn.nextDouble();
		double t = readIn.nextDouble();
		double a = (v1 - v0 ) / t;
		System.out.println(a);
		*/
		
		
		
		
		
	
		/*Here is Ex 2.10
		 * 
		 */
	
		/*
		 *
		Scanner readIn = new Scanner(System.in);
		System.out.println("Enter the amount of the water in kiloGrams: ");
		double amountOfWaterKg =readIn.nextDouble();
		System.out.println("Enter the initinal temprature : ");
		double initinalTemp = readIn.nextDouble();
		System.out.println("Enter the initinal temprature : ");
		double finalTemp = readIn.nextDouble();

		
		double energyNeeded ;
		energyNeeded = amountOfWaterKg * (finalTemp - initinalTemp) * 4184;
		System.out.println("The energy needed is : "+ energyNeeded);
		
		 */

		/*
		double vSpeed = 0; double speedWhenTakingOff = 0;
		Scanner readIn =  new Scanner(System.in);
		System.out.println("Enter speed and acceleration: ");
		vSpeed = readIn.nextDouble();
		speedWhenTakingOff = readIn.nextDouble();
		
		double length = (Math.pow(vSpeed, 2) / (2 * speedWhenTakingOff));
		System.out.printf("The mininmum runway length for this airplan iS : %.3f", length);
		
		*/
		
		
		
	
	}

}
