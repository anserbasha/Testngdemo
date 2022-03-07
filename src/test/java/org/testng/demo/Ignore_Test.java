package org.testng.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class Ignore_Test {
	
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
	@Test 
	private void searchMobile() {
		System.out.println("search mobile");
	}
	@Test
	private void searchLaptop() {
		System.out.println("search laptop");
	}
	@Test
	
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
