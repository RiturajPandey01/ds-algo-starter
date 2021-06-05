package array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstUniqueCharTest {

	@Test
	void test() {
		assertEquals(-1,FirstUniqueChar.firstUniqueChar(null));
		assertEquals(1,FirstUniqueChar.firstUniqueChar("room"));
		assertEquals(2,FirstUniqueChar.firstUniqueChar("barber"));
		assertEquals(-1,FirstUniqueChar.firstUniqueChar("aabbcc"));
	}

}
