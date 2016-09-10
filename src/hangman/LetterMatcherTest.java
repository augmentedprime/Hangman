package hangman;

import static org.junit.Assert.*;

import org.junit.Test;

public class LetterMatcherTest {

	LetterMatcher gay = new LetterMatcher();
	
	
	@Test
	public void letterInGivenWord() {
		boolean test = gay.match("b", "bitchhole");
		assertTrue(test);
	}
	
	@Test
	public void lastLetterInGivenWord() {
		boolean test = gay.match("e", "bitchhole");
		assertTrue(test);
	}
	
	@Test
	public void letterNotInGivenWord() {
		boolean test = gay.match("b", "itchhole");
		assertFalse(test);
	}
	
	@Test
	public void moreThanaSingleLetterGiven() {
		boolean test = gay.match("bi", "bitchhole");
		assertFalse(test);
	}
	
	@Test
	public void twoLettersAtEndOfWord(){
		boolean test = gay.match("le", "bitchhole");
		assertFalse(test);
	}
	
	@Test
	public void letterGivenEmptyString() {
		boolean test = gay.match("", "Matt's Dick");
		assertFalse(test);
	}
}
