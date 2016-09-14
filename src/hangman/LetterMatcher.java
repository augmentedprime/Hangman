package hangman;

public class LetterMatcher {
	
	public static boolean match(String givenLetter, String givenWord){
		
		
		for (int i = 0; i<givenWord.length(); i++){
			if (givenLetter.equals(givenWord.substring(i, i+1))){
				return true;
			}
		}
		return false;
	}
}