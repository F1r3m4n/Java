package com.fdm.model;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import org.junit.Test;

public class RegViewTest {

	

	@Test
	public void testScannerReturnsCorrectUsername() {
		String request1 = "n_lamprou";
		Scanner scanner = new Scanner(new ByteArrayInputStream(request1.getBytes()));		
		RegView rv = new RegView(scanner);
		assertEquals("n_lamprou", rv.getUsername());
	}
	
	@Test
	public void testScannerReturnsCorrectPassword() {
		String request2 = "12345678";
		Scanner scanner = new Scanner(new ByteArrayInputStream(request2.getBytes()));		
		RegView rv = new RegView(scanner);
		assertEquals("12345678", rv.getPassword());
	}
	
	@Test
	public void testScannerReturnsCorrectFirstname() {
		String request3 = "nick";
		Scanner scanner = new Scanner(new ByteArrayInputStream(request3.getBytes()));		
		RegView rv = new RegView(scanner);
		assertEquals("nick", rv.getFirstname());
	}
	
	@Test
	public void testScannerReturnsCorrectLastname() {
		String request4 = "lamprou";
		Scanner scanner = new Scanner(new ByteArrayInputStream(request4.getBytes()));		
		RegView rv = new RegView(scanner);
		assertEquals("lamprou", rv.getLastname());
	}

	@Test
	public void testRegView
}
