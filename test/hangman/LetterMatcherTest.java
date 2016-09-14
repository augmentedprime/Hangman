package hangman;

import static org.junit.Assert.*;

import org.junit.Test;

public class LetterMatcherTest {

	LetterMatcher letterMatcher = new LetterMatcher();
	
	
	@Test
	public void letterInGivenWord() {
		boolean test = letterMatcher.match("b", "bitchhole");
		assertTrue(test);
	}
	
	@Test
	public void lastLetterInGivenWord() {
		boolean test = letterMatcher.match("e", "bitchhole");
		assertTrue(test);
	}
	
	@Test
	public void letterNotInGivenWord() {
		boolean test = letterMatcher.match("b", "itchhole");
		assertFalse(test);
	}
	
	@Test
	public void moreThanaSingleLetterGiven() {
		boolean test = letterMatcher.match("bi", "bitchhole");
		assertFalse(test);
	}
	
	@Test
	public void twoLettersAtEndOfWord(){
		boolean test = letterMatcher.match("le", "bitchhole");
		assertFalse(test);
	}
	
	@Test
	public void letterGivenEmptyString() {
		boolean test = letterMatcher.match("", "Matt's Dick");
		assertFalse(test);
	}
}
