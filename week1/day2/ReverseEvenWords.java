package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] arr = test.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				char[] charArray = arr[i].toCharArray();
				arr[i] = "";
				for (int j = charArray.length - 1; j >= 0; j--) {
					arr[i] += charArray[j];
				}
			}
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(" ");
			}
		}
	}

}
