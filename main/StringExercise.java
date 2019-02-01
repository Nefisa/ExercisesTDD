
public class StringExercise {

	public static int lengthOfStringExercise(String stringInputInput) {
		
		return stringInputInput.length();
	}

	public static String charactersOnEvenPositions(String stringInput) {
		String s = "";
		for(int i = 1; i < stringInput.length(); i++) {
			if (i % 2 == 0)
				s += stringInput.charAt(i);
		}
		return s;
	}

	public static String charactersOnOddPositions(String stringInput) {
		String s = "";
		for(int i = 1; i < stringInput.length(); i++) {
			if (i % 2 != 0)
				s += stringInput.charAt(i);
		}
		return s;
	}

	public static int upperCaseCharacters(String stringInput) {
		int count = 0;
		for(int i = 0; i < stringInput.length(); i++) {
			if (Character.isUpperCase(stringInput.charAt(i)))
					count ++;
		}
		return count;
	}

	public static int lowerCaseCharacters(String stringInput) {
		
		int count = 0;
		for(int i = 0; i < stringInput.length(); i++) {
			if (Character.isLowerCase(stringInput.charAt(i)))
					count ++;
		}
		return count;
	
	}

	public static String alphabeticCharacters(String stringInput) {
		String s = "";
		for(int i = 0; i < stringInput.length(); i++) {
			if (Character.isAlphabetic(stringInput.charAt(i)))
				s += stringInput.charAt(i);
		}
		return s;
	}
}
