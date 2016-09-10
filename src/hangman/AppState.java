package hangman;

import java.util.Set;

public class AppState {
	
	private final int initialCount = 4;
	private int hangmanCount;
	private String word;
	private Set<String> guesses;
	
	public AppState(String word, Set<String> guesses){
		this.word = word;
		this.guesses = guesses;
		this.hangmanCount = this.initialCount;
	}
}
