package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
	
	@Test(invocationTimeOut=2)
	public void infiniteLoop() {
		int i=1;
		while(i==5) {
			System.out.println(i);
			i++;
		}
	}

}
