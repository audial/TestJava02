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
//	        System.out.println(num[i]);
	        int sum = IntStream.of(num).sum();
	        System.out.println(sum);
	    }
	    
	    

	    /*for (int i : num) {
	        System.out.println(i);
	    }*/
		
//		char[] chars = numberString.toCharArray();
//		
//		for(char characters : chars){
			
		
			/*String newone = Integer.toString(characters);
			System.out.println(newone);
			int twone = Integer.parseInt(newone);
			for(int i = 0 ; i > twone; i++){
				twone += i;
				System.out.println(twone);*/
			}
		}
		
		
		
		
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter some numbers");
		String StringOfNumbers = sc.nextLine();
		System.out.println(StringOfNumbers);
		String[] SplitStrings = StringOfNumbers.split(":");
	    System.out.println(SplitStrings);*/
	
