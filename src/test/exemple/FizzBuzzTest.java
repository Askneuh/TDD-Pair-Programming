package exemple;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
	@BeforeAll
	static void TestInit() {
		int i = 2;
	}

	@Test
	void TestIntToString() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		int i = 2;
		assertEquals(fizzBuzz.intToString(i), "2");
	}
	
	@Test
	void TestIntLimits() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertThrows(Exception, fizzBuzz.intToString(101));
		assertThrows(Exception, fizzBuzz.intToString(0));
		assertDoesNotThrow(fizzBuzz.intToString(50));
	}
}
