package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {

		String name = "Sanmati";
		char[] nameArray = name.toCharArray();
		Set<Character> nameSet = new HashSet<>();
		List<Character> nameList = new ArrayList<>();

		for (int i = 0; i < nameArray.length; i++) {
			nameSet.add(nameArray[i]);
		}

		nameList.addAll(nameSet);

		for (Character alpha : nameList) {
			System.out.print(alpha);
		}

	}

}
