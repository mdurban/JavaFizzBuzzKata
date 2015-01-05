import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTests {

	@Test
	public void FizzBuzzShoulReturnNumberWhenOnePassedIn() {
		assertEquals("1", FizzBuzz.print(1));
	}
	
	@Test
	public void FizzBuzzShoulReturnFizzWhenDivisbleByThree() {
		assertEquals("Fizz", FizzBuzz.print(9));
	}
	
	@Test
	public void FizzBuzzShoulReturnBuzzWhenDivisbleByFive() {
		assertEquals("Buzz", FizzBuzz.print(25));
	}
	
	@Test
	public void FizzBuzzShoulReturnFizzBuzzWhenDivisbleByThreeAndFive() {
		assertEquals("FizzBuzz", FizzBuzz.print(30));
	}
	
	@Test
	public void FizzBuzzShoulReturnCorrectlyWhen100NumbersPassedIn() {
		for(int i = 1; i < 100; i++) {
			System.out.println(FizzBuzz.print(i));
		}
	}
	
}
