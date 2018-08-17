package com.nissan.training.jenkdemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test
	public void testadd() {
		Calc c = new Calc();
		assertEquals(5,c.add(2, 3));
	}
	
	@Test
	public void testsub() {
		Calc c = new Calc();
		assertEquals(1,c.sub(3, 2));
	}
	@Test
	public void testmul() {
		Calc c = new Calc();
		assertEquals(6,c.mult(3, 2));
	}
}
