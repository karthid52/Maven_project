package com.testng_features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class I_Annotation_Transformer {
	

	@Test
	private void game1() {
		String actual="Cricket";
		String expected="Cricket";
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	private void game2() {
		
		String actual="Cricket";
		String expected="cricket";
		Assert.assertEquals(actual, expected);
	}

}

