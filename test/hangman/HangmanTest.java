package hangman;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class HangmanTest {

	
	
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
		
		String actual = Hangman.hangmanStringFor(0);
		
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
		
		String actual = Hangman.hangmanStringFor(1);
		
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
		
		String actual = Hangman.hangmanStringFor(2);
		
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
		
		String actual = Hangman.hangmanStringFor(3);
		
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
		String actual = Hangman.hangmanStringFor(4);
		
		assertThat(actual, is(equalTo(expected)));
	}
	
	@Test(expected = RuntimeException.class)
	public void exceptionThrownWithInvalidInput() {
		Hangman.hangmanStringFor(30);
	}
}