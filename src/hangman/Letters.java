package hangman;

import java.util.Set;


public class Letters {

	public static String drawLetters(Set<String> letters, String correct){
		
		String result = ""; 
		
		for (int i=0; i<correct.length(); i++){
			//for (Character c : correct){
	
			String currentLetter = correct.substring(i,i+1);

			if (currentLetter.equals(" ")) {
				result+= " ";

			} else if (letters.contains(currentLetter)) {
				result+= currentLetter;

			} else result += "_";
		}
		System.out.println(result);
		return result;
	}	
}
