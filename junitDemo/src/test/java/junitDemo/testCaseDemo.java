package junitDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCaseDemo {
	Calculator c = new  Calculator();
	@Test
	public void addtest() {
		//fail("Not yet implemented");
		assertEquals(8, c.calculate(5, 2));
	}

}
