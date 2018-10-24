package Ex11;


public class Main {

	public static void main(String[] args) {
//comment to test another Class
//		double [] myarray = new double [100];
//		Ex11_704 testArray = new Ex11_704();
//		testArray.inputScores(myarray);
//		double sum = testArray.sumValues(myarray);
//		System.out.println(sum);
//		double avg = testArray.average(myarray);
//		System.out.printf("Avg is : %.3f \n" , avg);
//		testArray.displayScores(myarray);

		int [] myArray = new int [10];
		Ex11_705 testMyClass = new Ex11_705();
		
		testMyClass.inputNumbers(myArray);
		
		
 		testMyClass.printDistinct(myArray);
//	
 
 		System.out.println("number Of distinct numbers : "+ testMyClass.getDistinctNums());
//		
		
		
	}

}
