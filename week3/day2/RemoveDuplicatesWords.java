package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		String[] textArray = text.split(" ");
		Set<String> textSet = new LinkedHashSet<>();

		for (int i = 0; i < textArray.length; i++) {
			boolean add = textSet.add(textArray[i]);
			if (add) {
				System.out.print(textArray[i]);
				if (i < textArray.length - 1) {
					System.out.print(" ");
				}
			}
		}

	}

}
