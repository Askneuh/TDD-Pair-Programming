package exemple;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import exemple.Main2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main2Test {
	@BeforeAll
	static void TestInit() {
		int i = 2;
	}

	@Test
	void TestIntToString() {
		Main2 main2 = new Main2();
		int i = 2;
		assertEquals(main2.intToString(i), "2");
	}
}
