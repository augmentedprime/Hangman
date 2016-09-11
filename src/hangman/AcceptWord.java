package hangman;

import java.util.Scanner;

public class AcceptWord {
	Scanner user = new Scanner(System.in);

	public void getWord(AppState appState){
		System.out.println("Pick a word");
		String userInput = user.nextLine();
		appState.setWord(userInput);
		System.out.println("Your word is " + appState.getWord() + ".");
	}
}
