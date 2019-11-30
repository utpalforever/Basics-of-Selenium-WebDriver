package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGbasics {

	@BeforeSuite

	public void beforeSuite() {
		System.out.println("BeforeSuite is executed");

	}

	@BeforeTest

	public void beforeTest() {
		System.out.println("BeforeTest is executed");

	}

	@BeforeClass

	public void beforeClass() {

		System.out.println("BeforeClass is executed");
	}
	
	@BeforeMethod

	public void beforeMethod() {
		System.out.println("BeforeMethod is executed");

	}

	@Test

	public void test1() {
		System.out.println("Test 1 is executed");

	}
	@Test(priority=3)
	public void test2() {
		System.out.println("Test 2 is executed");

	}
	@Test
	public void test3() {
		System.out.println("Test 3 is executed");

	}
	@AfterMethod

//	public void afterMethod1() {
//		System.out.println("AfterMethod 2 is executed");
//
//	}
	public void afterMethod() {
		System.out.println("AfterMethod is executed");

	}
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass is executed");

	}
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest is executed");

	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite is executed");

	}
}













