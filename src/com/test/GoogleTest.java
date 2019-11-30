package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver1;
	@BeforeMethod

	public void beforeMethod() {
		System.out.println("BeforeMethod is executed");
		System.setProperty("webdriver.chrome.driver",
				"E:\\Shiv@1008\\SeleniumBackEnd\\chromedriver_win32\\chromedriver.exe");

		 driver1 = new ChromeDriver();
		
		
		

		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();

		driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver1.get("https://google.com/");

	}

	@Test

	public void test1() {
		System.out.println("Test 1 is executed");
		
		System.out.println(driver1.getTitle());

	}
	
	@Test

	public void test2() {
		System.out.println("Test 2 is executed");
		
	boolean b=	driver1.findElement(By.name("btnK")).isEnabled();
	System.out.println(b);
	

	}
	
	@Test

	public void test3() {
		System.out.println("Test 3 is executed");
		
	boolean b=	driver1.findElement(By.linkText("Gm ail")).isDisplayed();
	System.out.println(b);
	

	}
	@AfterMethod

	public void afterMethod() {
		System.out.println("AfterMethod is executed");
		driver1.quit();

	}
	
	
	
	
	
	
	
	
	
	
	
	

}
