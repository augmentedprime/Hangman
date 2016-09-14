package hangman;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;


public class LettersTest {

	Set<String> alreadyGuessed = new HashSet<String>();


	@Test
	public void fake(){
		alreadyGuessed.add("I");
		alreadyGuessed.add("m");
		alreadyGuessed.add("f");
		alreadyGuessed.add("t");
		

		String answer = Letters.drawLetters(alreadyGuessed, "I am the best");
		assertThat(answer, is(equalTo("I _m t__ ___t")));
	}
}
