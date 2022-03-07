package org.testng.demo;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Assert_Class {

	@Test
	private void assertConcept() {
		String actual = "anser";
		String expected = "Anser";
		
		//Hard Assert
		//Assert.assertEquals(actual,expected);
		//Assert.assertNull(actual);
		//Assert.assertNotNull(actual);
		//Assert.assertTrue(1==2);
		//Assert.assertSame(actual,expected);
		
		//soft assert
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual,expected);
		sa.assertAll();  // it will show us where the exception is.
		
	}
	
}
