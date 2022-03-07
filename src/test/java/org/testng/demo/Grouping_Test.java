package org.testng.demo;

import org.testng.annotations.*;

public class Grouping_Test {

	@Test (groups = "company details")
	private void empId() {
		System.out.println("123");
		
	}
	@Test (groups = "company details")
	private void empName() {
		System.out.println("anser");
		
	}
	@Test (groups = "personal details")
	private void Address() {
		System.out.println("No 14 chennai");
		
	}
	@Test (groups = "personal details")
	private void personalNum() {
		System.out.println("123456");
		
	}
	@Test (groups = "bank details")
	private void IfscCode() {
		System.out.println("156");
		
	}
	@Test (groups = "bank details")
	private void AccountNum() {
		System.out.println("654789");
		
	}
}
