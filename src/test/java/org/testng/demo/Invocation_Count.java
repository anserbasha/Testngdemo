package org.testng.demo;

import org.testng.annotations.*;

public class Invocation_Count {
	
	@BeforeMethod
	private void logIn() {
		System.out.println("login successful");
	}
	
	@Test (invocationCount = 5)
	private void searchPen() {
		System.out.println("pens");
	}
	
	@Test (invocationCount = 2)
	private void searchPencil() {
		System.out.println("pencil");
	}
	@AfterMethod
	private void logOut() {
		System.out.println("logout successfull");
	}
	
	
}
