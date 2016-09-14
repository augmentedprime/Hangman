package hangman;

import java.util.Scanner;

public class AcceptLetter {
	Scanner user = new Scanner(System.in);
	
	public void getLetter(AppState appState){
		System.out.println("Guess a letter");
		String userInput = user.nextLine();
		appState.addGuess(userInput);
		if (LetterMatcher.match(userInput, appState.getWord())){
			//do nothing
		} else {
			appState.decCount();
		}
	}
}
