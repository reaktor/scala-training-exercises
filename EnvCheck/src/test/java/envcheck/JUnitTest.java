package envcheck;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JUnitTest {
	@Test
	public void thisShouldCompileAndRun() {
		assertTrue(Math.random() < 2);
	}
}
