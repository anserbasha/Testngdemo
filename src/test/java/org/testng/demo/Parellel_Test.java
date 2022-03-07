package org.testng.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parellel_Test {

//	public WebDriver driver;
	
	/* if I run this class it will execute one by one browser. but I want to execute it parallel for that I
	convert it into xml file ant gives in <test thread-count=5 parallel="methods" name="Test" */
	
	@Test
	private void flipkart() {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anser\\eclipse-workspace\\testngdemo\\drivertestng\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		
	}
	
	@Test
	private void amazon() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anser\\eclipse-workspace\\testngdemo\\drivertestng\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
	}
}
