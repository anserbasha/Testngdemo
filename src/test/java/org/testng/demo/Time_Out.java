package org.testng.demo;

import org.testng.annotations.Test;

public class Time_Out {

	@Test (timeOut = 3000)
	private void searchMobile() throws Exception {
		Thread.sleep(5000);
		System.out.println("search mobile");
	}
	@Test
	private void searchLaptop() {
		System.out.println("search laptop");
	}
}
