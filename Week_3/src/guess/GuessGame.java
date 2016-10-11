package guess;

public class GuessGame {

	GuessNumber g;

	public void StartGame() {

		g = new GuessNumber();

		int guessG = 0;

		boolean gCorrect = false;
		
		int target = (int) (Math.random() * 1000);
		System.out.println("Number between 0 and 999");
		int numofGuess = 0;
		while (true) {
			System.out.println("Number to guess is " + target);

			g.guess();

			guessG = g.number;
			System.out.println("You guessed " + guessG);

			numofGuess++;
			if (guessG == target) {
				gCorrect = true;
			}
			if (gCorrect) {
				System.out.println("We have a winner");
				System.out.println("It took you " + numofGuess + " guesses.");
				break;
			}

		}
	}

}
