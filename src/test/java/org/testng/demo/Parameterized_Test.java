package org.testng.demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	
	@Test
	@Parameters ({"empName","empId"})
	
	private void credentials(String empName,int empId) {
		System.out.println(empName);
		System.out.println(empId);
	}
	@Test
	@Parameters ({"stdName","stdId"})
	
	private void details(@Optional ("billu")String stdName,int stdId) {
		System.out.println(stdName);
		System.out.println(stdId);
	}
}
