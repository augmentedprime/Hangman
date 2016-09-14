package hangman;

import static org.junit.Assert.*;

import org.junit.Test;

@SuppressWarnings("unused")
public class GameFlowTest {

	GameFlow gameFlow = new GameFlow();
	
	
	@Test
	public void test() {
		String result = (gameFlow.playGame());	
		System.out.println(result);
	}

}
