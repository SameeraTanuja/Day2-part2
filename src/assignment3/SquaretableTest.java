package assignment3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquaretableTest {

	@Test
	void testCheckSquaretable() {
		assertEquals(false,Squaretable.CheckSquaretable('a'));
		assertEquals(true,Squaretable.CheckSquaretable(2));
		
//		fail("Not yet implemented");
	}

}
