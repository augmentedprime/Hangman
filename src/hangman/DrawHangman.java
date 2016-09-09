package hangman;

public class DrawHangman {

	public String draw(int tries) {

		String expected = null;

		switch (tries) {
		case 0 : expected = 
				"___________\n" +
						" |         |\n" +
						" |         O    \n" +
						" |        /|\\\n" +
						" |        / \\\n" +
						" |  ___________\n" +
						" |  |         |\n" +
						"_|__|_________|\n";
		break;
		case 1 : expected =
				"___________\n" +
						" |         |\n" +
						" |         O    \n" +
						" |        /|\\\n" +
						" |            \n" +
						" |  ___________\n" +
						" |  |         |\n" +
						"_|__|_________|\n";
		break;
		case 2 : expected = 
				"___________\n" +
						" |         |\n" +
						" |         O\n" +
						" |         |\n" +
						" |\n" +
						" |  ___________\n" +
						" |  |         |\n" +
						"_|__|_________|\n";
		break;
		case 3 : expected = 
				"___________\n" +
						" |         |\n" +
						" |         O\n" +
						" |\n" +
						" |\n" +
						" |  ___________\n" +
						" |  |         |\n" +
						"_|__|_________|\n";
		break;
		case 4 : expected = 
				"___________\n" +
						" |         |\n" +
						" |\n" +
						" |\n" +
						" |\n" +
						" |  ___________\n" +
						" |  |         |\n" +
						"_|__|_________|\n";
		break;
		default : throw new RuntimeException("Number too big (like Matt's dick(dick))");
		}

		System.out.println(expected);
		return expected;
	}
}