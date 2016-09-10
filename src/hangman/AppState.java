package hangman;

import java.util.Set;

public class AppState {
	
	private final int initialCount = 4;
	private int hangmanCount;
	private String word;
	private Set<String> guesses;
	
	
	
	
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


	
	
	public AppState(String word, Set<String> guesses){
		this.word = word;
		this.guesses = guesses;
		this.hangmanCount = this.initialCount;
	}
}
