package com.test;

import org.testng.annotations.Test;

public class TestNGFeature {
	
	@Test(groups="Basic")
	public void loginTest() {
		System.out.println("login test");
		int i=9/0;
		System.out.println(i);
		
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePage() {
		System.out.println("home pge test");
		
	}
	@Test(priority=1,groups="Basic")
	public void urlLaunch() {
		System.out.println("url launch test");
		
	}
}
