
public class FizzBuzz {

	public static String print(int i) {
		if ((isDivisibleByThree(i) && isDivisibleByFive(i)) || (containsThree(i) && containsFive(i))) {
			return "FizzBuzz";
		} else if (isDivisibleByThree(i) || containsThree(i)) {
			return "Fizz";
		} else if (isDivisibleByFive(i) || containsFive(i)) {
			return "Buzz";
		} else {
			return Integer.toString(i);
		}
	}

	private static boolean isDivisibleByFive(int i) {
		return i % 5 == 0;
	}

	private static boolean isDivisibleByThree(int i) {
		return i % 3 == 0;
	}
	
	private static boolean containsThree(int i) {
		return (i / 10 == 3 || i % 10 == 3);
	}
	
	private static boolean containsFive(int i) {
		return (i / 10 == 5 || i % 10 == 5);
	}

}
