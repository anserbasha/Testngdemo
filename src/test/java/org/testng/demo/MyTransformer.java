package org.testng.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTransformer {

	@Test
	private void userone() {
		Assert.assertEquals('A','a');
		
	}
	@Test
	private void usertwo() {
		Assert.assertEquals('B','b');
	}
}
