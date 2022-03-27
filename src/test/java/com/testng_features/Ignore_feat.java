package com.testng_features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_feat {
	@Test(priority=-1)
	private void sslc() {
		System.out.println("SSLC");

	}
	@Test(priority=0)
	private void hsc() {
		System.out.println("HSC");
	}
	@Test(priority=1)
	private void college() {
		System.out.println("COLLEGE");

	}
	@Test(priority=2)
	private void job() {
		System.out.println("JOB");

	}
	@Test(enabled =false)
	private void books() {
		System.out.println("BOOKS");

	}
	@Ignore 
	@Test
	private void insta() {
		System.out.println("INSTGRAM");

	}
	@Test(priority=3)
	private void facebook() {
		System.out.println("FACEBOOK");

	}
	

}
