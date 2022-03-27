package com.testng_features;

import org.testng.annotations.Test;

public class Invocation_count {

	
	
	
	@Test()
	private void browserlaunch() {
		System.out.println("BROWSER LAUNCH");

	}
	@Test
	private void geturl() {
		System.out.println("GETURL");

	}
	@Test(invocationCount = 3)
	private void refresh() {
		System.out.println("REFRESH");

	}
}
