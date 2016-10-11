package guess;

import java.util.Scanner;

public class GuessNumber {
	
	int number = 0;
	
	public void guess(){
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Pick a number between 0 and 999");
		number = sc.nextInt();*/
		number = (int)(Math.random()*1000);
	}

}