package Ex11;

public class Main {

	public static void main(String[] args) {

		int [] myarray = new int [5];
		Ex11_704 testArray = new Ex11_704( );
		
		testArray.inputScores(myarray);
		int sum = testArray.sumValues(myarray);
		
	
		System.out.println(sum);
	
		double avg = testArray.average(myarray);
		System.out.println("Abg is :" + avg);
		
		
		
		
	}
	

}
