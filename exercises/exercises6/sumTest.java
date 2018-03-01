package exercises6;

import static org.junit.Assert.*;

import org.junit.Test;

import roundtables.Sum;

public class sumTest {

	@Test
	public void test() {
		assertEquals(0,Sum.sum(0));
		assertEquals(1,Sum.sum(1));
		assertEquals(3,Sum.sum(2));
		
		// Gauss's finding
		for (int n = 0; n < 10000; n++) {
			int ans = n*(n+1)/2;
			assertEquals(ans,Sum.sum(n));
		}
	}
	

}
