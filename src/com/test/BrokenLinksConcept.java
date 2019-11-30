package com.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksConcept {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Shiv@1008\\SeleniumBackEnd\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();

		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();

		driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver1.get("https://freecrm.com/");

		driver1.findElement(By.xpath("//a[contains(@class,'btn btn-primary ')]")).click();
		driver1.findElement(By.name("email")).sendKeys("utpalforever@gmail.com");
		driver1.findElement(By.name("password")).sendKeys("test@123");
		driver1.findElement(By.xpath("//div[contains(@class,'ui fluid large blue submit button')]")).click();
		Thread.sleep(2000);

		// find "a" and "img" tags
		// links will have herf attribute

		List<WebElement> list = driver1.findElements(By.tagName("a"));
		list.addAll(driver1.findElements(By.tagName("img")));

		System.out.println("Size of full links and images links " + list.size());

		List<WebElement> activelinks = new ArrayList<WebElement>();
		
		//iterate list  and exclude all the links/images which does not have any href attribute defined

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getAttribute("href"));

			if (list.get(i).getAttribute("href") != null && (list.get(i).getAttribute("href").contains("javascript"))) {
				activelinks.add(list.get(i));

			}

		}

		// get the size of active links
		System.out.println("size of active links is " + activelinks.size());

		// check herf url with HttpURLConnection API

		//200--Ok
		//404--not found
		//500--internal error
		//400--bad request
		for (int j = 0; j < activelinks.size(); j++) {

			HttpURLConnection connection = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href"))
					.openConnection();
			connection.connect();

			String response = connection.getResponseMessage();//ok
			connection.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href"+"   "+response));

			
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}

}
