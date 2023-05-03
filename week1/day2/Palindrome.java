package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String str = "Madam";
		String revStr = "";
		char[] charArray = str.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			revStr += charArray[i];
		}
		if (str.equalsIgnoreCase(revStr)) {
			System.out.println("The given String " + str + " is a Palindrome");
		} else {
			System.out.println("The given String " + str + " is not a Palindrome");
		}
	}

}
