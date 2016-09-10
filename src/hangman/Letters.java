package hangman;

public class Letters {
	
	public void drawLetters(String letters, String correct){
		for (int i=0; i<correct.length(); i++){
			if (true){
				System.out.println(correct.substring(i,i+1));
			} else System.out.println("_");
		}
	}
}