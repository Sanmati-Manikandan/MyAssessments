package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "PayPal India";
		char[] charArray = text.toCharArray();
		Set<Character> charSet = new LinkedHashSet<>();
		Set<Character> dupCharSet = new LinkedHashSet<>();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != ' ') {
				boolean add = charSet.add(charArray[i]);
				if (!add) {
					dupCharSet.add(charArray[i]);
				}
			}
		}

		System.out.println(charSet);
		System.out.println(dupCharSet);

	}

}
