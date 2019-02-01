
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringExerciseTest {
	

	@Test
	public void lengthOfStringExerciseTest() {
		
		assertEquals(4, StringExercise.lengthOfStringExercise("Blue"));
	}
	
	@Test
	public void charachtersOnEvenPositionsTest() {
		
		assertEquals("u", StringExercise.charactersOnEvenPositions("Blue"));
	}
	
	@Test
	public void charactersOnOddPositionsTest() {
		
		assertEquals("le", StringExercise.charactersOnOddPositions("blue"));
	}
	
	@Test
	public void upperCaseCharactersTest() {
		
		assertEquals(2, StringExercise.upperCaseCharacters("Blue Ballon"));
	}
	
	@Test
	public void lowerCaseCharactersTest() {
		
		assertEquals(8, StringExercise.lowerCaseCharacters("Blue Ballon"));
	}
	
	@Test
	public void alphabeticCharactersTest() {
		
		assertEquals("bluE", StringExercise.alphabeticCharacters("blu# -- 7E"));
	}

}
