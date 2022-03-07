package org.testng.demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency {

	@Test
	 //@Ignore  (if ignore annotation used it will throw an exception)
	private void firstTest() {
		System.out.println("first test");
	}
	@Test (dependsOnMethods = "firstTest")
	private void secondTest() {
		System.out.println("second test");
	}
	@Test
	private void thridTest() {
		System.out.println("third test");
	}
}
