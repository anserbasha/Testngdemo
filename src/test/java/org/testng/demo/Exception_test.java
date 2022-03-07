package org.testng.demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exception_test {
	
	@BeforeSuite
	private void setUp() {
		System.out.println("setup");
	}
	
	@Test (expectedExceptions = ArithmeticException.class)
	private void arithmeticOperation() {
		int a = 1;
		int b = 0;
		int c = a/b;
		System.out.println(c);
	}
	@Test
	private void searchFurniture() {
		System.out.println("furniture");
	}
	@AfterSuite
	private void deleteCookies() {
		System.out.println("cookies deleted");
	}

}
