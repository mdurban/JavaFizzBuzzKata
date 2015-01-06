import java.util.HashMap;
import java.util.Map;


public class FizzBuzz {
	
	private static Map<Integer, String> divisbleByThreeMap = new HashMap<>();
	private static Map<Integer, String> divisbleByFiveMap = new HashMap<>();
	private static Map<Integer, String> divisbleByThreeAndFiveMap = new HashMap<>();
	
	static {
		divisbleByThreeMap.put(0, "Fizz");
		divisbleByFiveMap.put(0, "Buzz");
		divisbleByThreeAndFiveMap.put(0, "FizzBuzz");
	}

	public static String print(int intToPrint) {
		StringBuilder sb = new StringBuilder();
		int modThree = intToPrint % 3;
		int modFive = intToPrint % 5;

		sb.append(getStringTransformation(intToPrint, modThree, modFive));
		sb = new StringBuilder(getFizzBuzzOrOriginalString(sb, modThree, modFive));

		return sb.toString();
	}

	private static String getStringTransformation(int intToPrint, int modThree, int modFive) {
		String divByFiveTransformation = divisbleByFiveMap.getOrDefault(modFive, Integer.toString(intToPrint));
		
		return divisbleByThreeMap.getOrDefault(modThree, divByFiveTransformation);
	}

	private static String getFizzBuzzOrOriginalString(StringBuilder sb, int modThree, int modFive) {
		return divisbleByThreeAndFiveMap.getOrDefault(modThree + modFive, sb.toString());
	}
}
