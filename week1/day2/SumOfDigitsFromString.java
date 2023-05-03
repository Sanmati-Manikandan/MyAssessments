package week1.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum = 0;
		char[] charArray = text.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (Character.isDigit(charArray[i])) {
				sum += Character.getNumericValue(charArray[i]);
			}
		}
		System.out.println("The sum of all the digits in string is " + sum);
	}

}
