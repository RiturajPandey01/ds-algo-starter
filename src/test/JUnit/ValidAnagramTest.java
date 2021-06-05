package array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidAnagramTest {

	@Test
	void test() {
		assertEquals(true,ValidAnagram.isAnagram(null, null));
		assertEquals(true,ValidAnagram.isAnagram("art", "rat"));
		assertEquals(false,ValidAnagram.isAnagram("art", "rot"));
		assertEquals(false,ValidAnagram.isAnagram("art", "ratt"));
		assertEquals(true,ValidAnagram.isAnagram("aaa", "aaa"));
	}

}
