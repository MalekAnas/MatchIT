package Ex11;

import java.util.Random;

public class Ex11_707 {
	
	
	
	public static int getRandomNumberInRange(int min, int max) {

//		if (min >= max) {
//			throw new IllegalArgumentException("max must be greater than min");
//		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	
	public static void countingNumbers(int [] countingArray , int [] xArray) {
		//sort counting
		for(int i : xArray)
		{
			countingArray[i]++;
		}
		
		
		//display the counts
		
		for (int i = 0; i < countingArray.length ; i++)
		{
			
			System.out.println();
			
			 System.out.println("" + i + " occurs " + countingArray[i] + " times");
		}
		
		
		
		
		
		
	}
}

