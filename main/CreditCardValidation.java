
public class CreditCardValidation {

	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		number /= 10;
		while (number != 0) {
			if (number % 10 * 2 > 9)
				sum += getDigit((int) (number % 10 * 2));
			else
				sum += number % 10 * 2;
			number /= 100;
		}
		return sum;
	}

	public static int getDigit(int number) {

		return number / 10 + number % 10;
	}

	public static int sumOfOddPlace(long number) {
		int sum = 0;
		while (number != 0) {
			sum += number % 10;
			number /= 100;
		}
		return sum;
	}

	public static boolean prefixMatched(long number, int d) {
		if (d >= 4 && d <= 6) {

			String s = Long.toString(number);
			String sub = s.substring(0, 1);
			int i = Integer.valueOf(sub);
			if (i == d)
				return true;
			else
				return false;

		} else
			return false;

	}

	public static int getSize(long number) {
		String s = Long.toString(number);
		return s.length();
	}

	public static int getPrefix(long number, int k) {

		String s = Long.toString(number);
		if (s.length() > k) {
			String sub = s.substring(0, k);
			return Integer.valueOf(sub);
		} else
			return Integer.valueOf(s);
	}

	public static boolean isValid(long number) {

		int d = getPrefix(number, 1);
		if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0 && prefixMatched(number, d)
				&& (getSize(number) >= 13 && getSize(number) <= 16))
			return true;
		else
			return false;
	}

}
