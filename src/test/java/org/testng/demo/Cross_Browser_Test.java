package org.testng.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Cross_Browser_Test {

	@Test
	private void chromeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anser\\eclipse-workspace\\testngdemo\\drivertestng\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	
	@Test
	private void ieDriver() {
		System.setProperty("webdriver.ie.driver","C:\\Users\\anser\\eclipse-workspace\\testngdemo\\drivertestng\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.flipkart.com/");
	}
}
