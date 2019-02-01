
public class Converter {

	private double inputValue;

	public void setInputValue(double i) {
		inputValue = i;
	}
	
	public double poundsToKilograms() {
		return this.inputValue * 0.45359237;
	}

	public double kilogramsToPounds() {
		return this.inputValue * 2.20462262185;
	}

	public double centimetersToInches() {
	
		return this.inputValue / 2.54;
	}

	public double inchesToCentimeters() {
	
		return this.inputValue * 2.54;
	}

	public double celsiusToFahrenHeit() {
		
		return this.inputValue * 1.8 + 32;
	}

	public double fahrenheitToCelsius() {
		
		return (this.inputValue - 32) / 1.8;
	}
	
	

}
