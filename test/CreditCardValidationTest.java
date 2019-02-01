import static org.junit.Assert.*;

import org.junit.Test;

public class CreditCardValidationTest {

	@Test
	public void sumOfDoubleEvenPlaceTest() {

		assertEquals(37, CreditCardValidation.sumOfDoubleEvenPlace(4388576018402626L));
	}

	@Test
	public void getDigitTest() {

		assertEquals(3, CreditCardValidation.getDigit(12));
	}

	@Test
	public void sumOfOddPlaceTest() {

		assertEquals(38, CreditCardValidation.sumOfOddPlace(4388576018402626L));
	}

	@Test
	public void prefixMatchedTest() {

		assertTrue(CreditCardValidation.prefixMatched(4388576018402626L, 4));
	}

	@Test
	public void getSizeTest() {

		assertEquals(16, CreditCardValidation.getSize(4388576018402626L));
	}

	@Test
	public void getPrefixTest() {

		assertEquals(4388, CreditCardValidation.getPrefix(4388576018402626L, 4));
	}

	@Test
	public void getPrefixReturnsNumberOfDigitsIsLessThanK() {

		assertEquals(4388, CreditCardValidation.getPrefix(4388L, 14));
	}
	
	@Test
	public void isValidTest() {
		
		assertTrue(CreditCardValidation.isValid(4388576018410707L));
	}

}
