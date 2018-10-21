package Ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	//1.
	System.out.println("Hello");
	System.out.println("Malek Al Harani!");

	//2.
	System.out.println(74+36);
	
	//3.
	System.out.println(50.0/3.0);
	
	//4.
	System.out.println("a. " + (-5+8*6));
	System.out.println("b. " + ((55+9)%9));
	System.out.println("c. " + (20 + -3  * 5  / 8));
	System.out.println("d. " + (5+15/3*2-8%3));
	
	
	//5.
	
	Scanner reader = new Scanner(System.in);
//	
////	System.out.println("Input first Number: ");
////	int num1 = reader.nextInt();
////	System.out.println("Input Second Number: ");
////	int num2 = reader.nextInt();
////	int sum = num1*num2;
////	System.out.println(num1 + " x " + num2 + " ="+ sum );
////	reader.close();
	
	//6.
//	System.out.println("           Welcome to my calculator!"	);
//	System.out.println(" Please choose the operation: (input should be 1,2,3,4,5)");
//	System.out.println("1. Addition:");
//	System.out.println("2. Subtract:");
//	System.out.println("3. Multiply:");
//	System.out.println("4. Devidation:");
//	System.out.println("5. Reminder:");
//	
//	System.out.print("operation :");
//	int operation = reader.nextInt();
//	
//	System.out.println("Input first Number: ");
//	int num1 = reader.nextInt();
//	System.out.println("Input second Number: ");
//	int num2 = reader.nextInt();
//	
//	
//	switch (operation)
//	{
//	case 1:
//		
//	
//		int sum = num1 + num2;
//		System.out.printf("%d + %d = %d", num1, num2 , sum);
//		break;
//	case 2:
//		
//		 sum = num1 - num2;
//		 System.out.printf("%d - %d = %d", num1, num2 , sum);
//		 break;
//		
//	case 3:
//		
//	
//		 sum = num1 * num2;
//		 System.out.printf("%d * %d = %d", num1, num2 , sum);
//		 break;
//		
//		
//	case 4:
//	
//	
//		 sum = num1 / num2;
//		 System.out.printf("%d / %d = %d", num1, num2 , sum);
//		 break;
//	case 5:
//		
//	
//		 sum = num1 % num2;
//		 System.out.printf("%d % %d = %d", num1, num2 , sum);
//		 break;
//		 default:
//			 System.out.println("please Enter a vaild choice!");
//			 break;
//			 
//			 
//			 
	
			
	
	
			 
			 
		
//	}
	//7.
	System.out.println("Enter the number: ");
	int number = reader.nextInt();
	
	for(int i=0; i<=10; i++) {
		int sum = number*i;
		System.out.println(number + " x " +  i + " = "+ sum);
	}
	
	
	double product = ((25.5 * 3.5 -3.5 * 3.5) / (40.5 -4.5)) ;
	System.out.println(product);
	product = 4.0 * (1 -(1.0/3) + (1.0/5) -(1.0/7) + (1.0/9) -(1.0/11));
	
	System.out.println(product);
	}
}


