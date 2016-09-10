package hangman;

import java.util.Scanner;

public class AcceptWord {
	Scanner user = new Scanner(System.in);

	public String getWord(){
		System.out.println("Pick a word");
		String word = user.nextLine();
		System.out.println("Your word is " + word + ".");
		return word;
	}
}
