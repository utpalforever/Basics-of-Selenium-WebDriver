package p1_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Shiv@1008\\SeleniumBackEnd\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();

		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();

		driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver1.get("https://www.facebook.com/");
		WebElement loginBtn = driver1.findElement(By.id("loginbutton"));
		flash(loginBtn, driver1);

	}

	
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js= ((JavascriptExecutor) driver);
		String bgcolor=element.getCssValue("backgroundColor");
		for(int i=0; i<=100;i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgcolor, element, driver);
		}
		
	}
	public static void changeColor(String color, WebElement element,  WebDriver driver) {
		JavascriptExecutor js= ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor= ' "+color+"'", element);
	
try {
	Thread.sleep(20);
}
catch(InterruptedException e) {

	
}
}
}