package org.testng.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IretryClass {

	
	@Test (retryAnalyzer=MainRetry.class)
	private void user() {
		Assert.assertEquals('A','a');
	}
	@Test
	private void user1() {
		Assert.assertEquals('B','b');
	}
}
