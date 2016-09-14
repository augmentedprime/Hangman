package hangman;

public class GameFlow {
	
	
	AcceptWord acceptWord = new AcceptWord();
	AppState appState = new AppState();
	PrintBoard printBoard = new PrintBoard();
	AcceptLetter acceptLetter = new AcceptLetter();
	
	
	
	public String playGame(){
		//set the word
		acceptWord.getWord(appState);
		
		while (appState.getHangmanCount() < 5){
			
		//print out current hangman/letters
		printBoard.printGame(appState.getHangmanCount(), appState.getGuesses(), appState.getWord());
		
		//make sure player still has guesses and hasn't gotten all correct letters
		if (appState.getWord().equals(
				Letters.drawLetters(appState.getGuesses(), appState.getWord()))){
			return "you win";
		}
		else if (appState.getHangmanCount() == 0) {
			return "you lose";
		}
		
		//accept a guess
		acceptLetter.getLetter(appState);
		
		//loop
		}
		return "butt stuff";
	}
}
