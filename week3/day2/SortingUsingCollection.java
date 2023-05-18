package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {

		List<String> companyList = new ArrayList<String>();

		companyList.add("Google");
		companyList.add("Microsoft");
		companyList.add("TestLeaf");
		companyList.add("Maverick");

		int listLength = companyList.size();
		System.out.println("Length of Company list is " + listLength);

		Collections.sort(companyList);

		for (int i = companyList.size() - 1; i >= 0; i--) {
			System.out.println(companyList.get(i));
		}

	}

}
