package com.testng_features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_annotation {

	@BeforeMethod
	private void sign_in() {
		System.out.println("Sign_in");

	}
	@BeforeClass
	private void geturl() {
		System.out.println("Geturl");
		
	}
	@BeforeTest
	private void browser_launch() {
		System.out.println("Browser_Launch");
	}
	
	@BeforeSuite
	private void set_property() {
		System.out.println("Set Property");

	}
	
	@Test
	private void men() {
	
		System.out.println("Men");
	}
	
	@Test
	private void women() {
	System.out.println("Women");
	}
	
	@Test
	private void child() {
		System.out.println("Child");
		
	}
	@AfterMethod
	private void sign_off() {
		System.out.println("Sign_off");
		
	}
	
	@AfterClass
	private void homepage() {
		System.out.println("Home_page");
		
	}
	
	@AfterTest
	private void close() {
		System.out.println("Close");

	}
	
	@AfterSuite
	private void deletecookies() {
		System.out.println("Delete Cookies");
	}
}