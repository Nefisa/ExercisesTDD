
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void calculatorAdditionTest() {
		
		assertEquals(5, Calculator.addition(3,2));
	}
	
	@Test
	public void calculatorSubtractionTest() {
		
		assertEquals(5, Calculator.subtract(10,5));
	}
	
	@Test
	public void calculatorMultiplicationTest() {
		
		assertEquals(10, Calculator.multiplication(5,2));
	}
	
	@Test
	public void calculatorDivisionTest() {
		
		assertEquals(10, Calculator.division(20,2));
	}
	
	@Test(expected = ArithmeticException.class)
	public void calculatorDivisionWhenZeroIsDivisorTest() {
		Calculator.division(5,0);
		}

}
