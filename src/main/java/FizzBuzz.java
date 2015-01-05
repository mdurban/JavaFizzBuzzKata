import java.util.HashMap;
import java.util.Map;


public class FizzBuzz {
	
		
	private static Map<Integer, String> map1 = new HashMap<>();
	private static Map<Integer, String> map2 = new HashMap<>();
	private static Map<Integer, String> map3 = new HashMap<>();

	static {
		map1.put(0, "Fizz");
		map2.put(0, "Buzz");
		map3.put(0, "FizzBuzz");
	}

	public static String print(int intToPrint) {
			StringBuilder sb = new StringBuilder();
			int modThree = intToPrint % 3;
			int modFive = intToPrint % 5;

			sb.append(map1.getOrDefault(modThree, map2.getOrDefault(modFive, Integer.toString(intToPrint))));
			sb = new StringBuilder(map3.getOrDefault(modThree + modFive, sb.toString()));

			return sb.toString();
	}


//	public static String print(int i) {
//		if ((isDivisibleByThree(i) && isDivisibleByFive(i)) || (containsThree(i) && containsFive(i))) {
//			return "FizzBuzz";
//		} else if (isDivisibleByThree(i) || containsThree(i)) {
//			return "Fizz";
//		} else if (isDivisibleByFive(i) || containsFive(i)) {
//			return "Buzz";
//		} else {
//			return Integer.toString(i);
//		}
//	}

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
