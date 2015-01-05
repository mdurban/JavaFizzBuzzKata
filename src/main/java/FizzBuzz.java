import java.util.HashMap;
import java.util.Map;


public class FizzBuzz {

	public static String print(int intToPrint) {
		StringBuilder sb = new StringBuilder();
		int modThree = intToPrint % 3;
		int modFive = intToPrint % 5;

		sb.append(getStringTransformation(intToPrint, modThree, modFive));
		sb = new StringBuilder(getFizzBuzzOrOriginalString(sb, modThree, modFive));

		return sb.toString();
	}

	private static String getStringTransformation(int intToPrint, int modThree, int modFive) {
		Map<Integer, String> divByThreeMap = new HashMap<>();
		Map<Integer, String> divByFiveMap = new HashMap<>();
		divByThreeMap.put(0, "Fizz");
		divByFiveMap.put(0, "Buzz");
		
		String divByFiveTransformation = divByFiveMap.getOrDefault(modFive, Integer.toString(intToPrint));
		return divByThreeMap.getOrDefault(modThree, divByFiveTransformation);
	}

	private static String getFizzBuzzOrOriginalString(StringBuilder sb, int modThree, int modFive) {
		Map<Integer, String> divByThreeAndFiveMap = new HashMap<>();
		divByThreeAndFiveMap.put(0, "FizzBuzz");
		return divByThreeAndFiveMap.getOrDefault(modThree + modFive, sb.toString());
	}
}
