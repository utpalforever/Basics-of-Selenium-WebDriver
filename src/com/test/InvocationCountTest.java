package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount=10)
	public void test() {
		System.out.println("test");
	}
}
