package hangman;

import java.util.HashSet;
import java.util.Set;

public class AppState {
	
	private final int initialCount = 4;
	private int hangmanCount;
	private String word;
	private Set<String> guesses;
	
	
	public void decCount(){
		hangmanCount--;
	}
	
	public void addGuess(String x) {
		guesses.add(x);
	}
	
	public int getHangmanCount() {
		return hangmanCount;
	}

	public void setHangmanCount(int hangmanCount) {
		this.hangmanCount = hangmanCount;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Set<String> getGuesses() {
		return guesses;
	}

	public void setGuesses(Set<String> guesses) {
		this.guesses = guesses;
	}

	public int getInitialCount() {
		return initialCount;
	}


	
	
	public AppState(){
		this.word = "";
		this.guesses = new HashSet<String>();
		this.hangmanCount = this.initialCount;
	}
}
