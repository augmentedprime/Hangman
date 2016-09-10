package hangman;

import java.util.Set;


public class PrintBoard {
	
	public void printGame(int stateCount, Set<String> stateGuess, String stateCorrect){
		
		
		System.out.println(Hangman.hangmanStringFor(stateCount));
		System.out.println(Letters.drawLetters(stateGuess, stateCorrect));
		
	}
}
