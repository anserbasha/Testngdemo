package org.testng.demo;

import org.testng.annotations.*;


public class Simple_Annotations {
	
	@BeforeSuite
	private void setUp() {
		System.out.println("setup");
	}
	
	@BeforeTest
	private void browserLaunch() {
		System.out.println("browser launch");
	}

	@BeforeClass
	private void url() {
		System.out.println("url");
	}
	
	@BeforeMethod
	private void login() {
		System.out.println("login");
	}
	@Test (enabled = false)  // ignore test
	private void searchMobile() {
		System.out.println("search mobile");
	}
	@Test
	private void searchLaptop() {
		System.out.println("search laptop");
	}
	@Test
	@Ignore
	private void searchToothbrush() {
		System.out.println("toothbrush");
	}
	@Test
	private void searchFurniture() {
		System.out.println("furniture");
	}
	@AfterMethod
	private void verify() {
		System.out.println("verify homepage");
	}
	@AfterClass
	private void logout() {
		System.out.println("logout");
	}
	@AfterTest
	private void browserClose() {
		System.out.println("browser close");
	}
	@AfterSuite
	private void deleteCookies() {
		System.out.println("cookies deleted");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


