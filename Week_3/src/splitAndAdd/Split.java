package splitAndAdd;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Split {
	
	public static void main(String[] args) {
		
		int numbers = 123123123;
		
		String numberString = Integer.toString(numbers);
		
		int[] num = new int[numberString.length()];

	    for (int i = 0; i < numberString.length(); i++){
	        num[i] = numberString.charAt(i) - '0';
	        int sum = IntStream.of(num).sum();
	        System.out.println(sum);
	    }
	}
}