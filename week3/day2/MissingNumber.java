package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {

		int[] data = { 10, 5, 3, 4, 2, 1, 6, 9, 7, 5, 4, 2 };
		Set<Integer> dataSet = new TreeSet<>();

		for (int i = 0; i < data.length; i++) {
			dataSet.add(data[i]);
		}

		List<Integer> dataList = new ArrayList<>(dataSet);

		if (dataList.get(0) != 1) {
			System.out.println("The Missing Number is 1");
		} else {
			for (int i = 0; i < dataList.size() - 1; i++) {
				if (dataList.get(i) + 1 != dataList.get(i + 1)) {
					System.out.println("The Missing Number is " + (dataList.get(i) + 1));
					break;
				}
			}
		}
	}

}
