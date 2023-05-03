package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in  java week1";

		String[] stringArray = text.split(" ");
		for (int i = 0; i < stringArray.length; i++) {
			for (int j = i + 1; j < stringArray.length; j++) {
				if (stringArray[i].equals(stringArray[j])) {
					stringArray[j] = "";
				}
			}
		}
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i]);
			if (i < stringArray.length - 1 && stringArray[i] != "") {
				System.out.print(" ");
			}
		}
	}

}
