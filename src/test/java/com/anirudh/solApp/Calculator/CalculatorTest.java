package com.anirudh.solApp.Calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		double result = c.add(5, 10);
		assertEquals(15, result, 0);
	}	
	
	
}
