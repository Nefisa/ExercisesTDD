import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConverterTest {

	final double delta = 0.00001;
	final int inputValue = 1;
	private Converter converter;

	@Before
	public void before() {
		converter = new Converter();
		converter.setInputValue(inputValue);
	}

	@Test
	public void conversionPoundsToKilogramsTest() {

		
		Assert.assertEquals(0.45359237, converter.poundsToKilograms(), delta);
	}

	@Test
	public void conversionKilogramsToPoundsTest() {

		Assert.assertEquals(2.20462262185, converter.kilogramsToPounds(), delta);

	}
	
	@Test
	public void converstionCentimetersToInchesTest() {
		
		Assert.assertEquals( 0.3937007874, converter.centimetersToInches(), delta);
		
	}
	
	@Test 
	public void converstionInchesToCentimetersTest() {
		
		Assert.assertEquals(2.54, converter.inchesToCentimeters(), delta);
	}
	
	@Test
	public void converstionCelsiusToFahrenheitTest() {
		
		Assert.assertEquals(33.8, converter.celsiusToFahrenHeit(), delta);
	}
	
	@Test
	public void conversionFahrenheitToCelsiusTest() {
		
		Assert.assertEquals(-17.2222222 , converter.fahrenheitToCelsius(), delta);
	}
}