package com.teste;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AssertTest {
	
	@Test
	public void testAssertArrayEquals() {
		byte[] esperado = "teste".getBytes();
		byte[] atual = "teste".getBytes();
		assertArrayEquals(esperado, atual);
	}
	
	@Test
	public void testAssertEquals() {
		assertEquals("text", "text");
	}
	
	@Test
	public void testAssertFalse() {
		assertFalse(false);
	}
	
	@Test
	public void testAssertNotNull() {
		assertNotNull(new Object());
	}
}
