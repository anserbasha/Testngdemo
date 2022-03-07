package org.testng.demo;

import org.testng.annotations.*;


public class Data_Provider {
                           //method name  
	@Test (dataProvider = "testData")
	private void info(String empName,int empId) {
	
		System.out.println("Employee name is "+empName);
		System.out.println("Employee id is "+empId);
		
	}
	@DataProvider
	private Object[][] testData(){
		return new Object[][]{
		{"hari",123},
		{"clinton",343},
		{"jaya",333}
	
};
}
}
