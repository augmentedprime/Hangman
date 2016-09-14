package hangman;

import java.util.Scanner;

public class AcceptLetter {
	Scanner user = new Scanner(System.in);
	LetterMatcher letterMatcher = new LetterMatcher();
	
	public void getLetter(AppState appState){
		System.out.println("Guess a letter");
		String userInput = user.nextLine();
		appState.addGuess(userInput);
		if (letterMatcher.match(userInput, appState.getWord())){
			//do nothing
		} else {
			appState.decCount();
		}
	}
}
