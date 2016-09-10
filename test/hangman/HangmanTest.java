package hangman;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class HangmanTest {

	
	Hangman hangman = new Hangman();
	
	@Test
	public void noTriesLeft() {
		String expected = 
				"___________\n" +
				" |         |\n" +
				" |         O    \n" +
				" |        /|\\\n" +
				" |        / \\\n" +
				" |  ___________\n" +
				" |  |         |\n" +
				"_|__|_________|\n";
		
		String actual = hangman.hangmanStringFor(0);
		
		assertThat(actual, is(equalTo(expected)));
	}
	
	@Test
	public void oneTriesLeft() {
		String expected = 
				"___________\n" +
				" |         |\n" +
				" |         O    \n" +
				" |        /|\\\n" +
				" |            \n" +
				" |  ___________\n" +
				" |  |         |\n" +
				"_|__|_________|\n";
		
		String actual = hangman.hangmanStringFor(1);
		
		assertThat(actual, is(equalTo(expected)));
	}
	
	@Test
	public void twoTriesLeft() {
		String expected = 
				"___________\n" +
				" |         |\n" +
				" |         O\n" +
				" |         |\n" +
				" |\n" +
				" |  ___________\n" +
				" |  |         |\n" +
				"_|__|_________|\n";
		
		String actual = hangman.hangmanStringFor(2);
		
		assertThat(actual, is(equalTo(expected)));
	}
	
	@Test
	public void threeTriesLeft() {
		String expected =
				"___________\n" +
				" |         |\n" +
				" |         O\n" +
				" |\n" +
				" |\n" +
				" |  ___________\n" +
				" |  |         |\n" +
				"_|__|_________|\n";
		
		String actual = hangman.hangmanStringFor(3);
		
		assertThat(actual, is(equalTo(expected)));
	}
	
	@Test
	public void fourTriesLeft() {
		String expected = 
				"___________\n" +
				" |         |\n" +
				" |\n" +
				" |\n" +
				" |\n" +
				" |  ___________\n" +
				" |  |         |\n" +
				"_|__|_________|\n";
		String actual = hangman.hangmanStringFor(4);
		
		assertThat(actual, is(equalTo(expected)));
	}
	
	@Test(expected = RuntimeException.class)
	public void exceptionThrownWithInvalidInput() {
		hangman.hangmanStringFor(30);
	}
}