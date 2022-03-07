package org.testng.demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority_Test {
	@BeforeMethod
	private void login() {
		System.out.println("login");
	}
	@Test (priority = 1)
	private void searchMobile() {
		System.out.println("search mobile");
	}
	@Test (priority = 4)
	private void searchLaptop() {
		System.out.println("search laptop");
	}
	@Test (priority = 2)
	
	private void searchToothbrush() {
		System.out.println("search toothbrush");
	}
	@Test (priority = 3)
	private void searchFurniture() {
		System.out.println("search furniture");
	}
	@AfterMethod
	private void verify() {
		System.out.println("verify homepage");
	}
}
