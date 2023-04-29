package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int number = 47;
		boolean isPrime = true;

		for (int i = 2; i < number - 1; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("The number " + number + " is a prime number");
		} else {
			System.out.println("The number " + number + " is not a prime number");
		}
	}

}
