package com.testng_features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_class_retry {

	
	@Test(retryAnalyzer =Retry_Analyser.class)
	private void game1() {
		String actual="Cricket";
		String expected="Cricket";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(retryAnalyzer =Retry_Analyser.class)
	private void game2() {
		
		String actual="Cricket";
		String expected="cricket";
		Assert.assertEquals(actual, expected);
	}
}
