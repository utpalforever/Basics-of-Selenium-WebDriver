package p1_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisiblity {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Shiv@1008\\SeleniumBackEnd\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();

		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();

		driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		//isDisplayed
		
		driver1.get("https://www.facebook.com/");
		
		System.out.println(driver1.findElement(By.id("loginbutton")).isDisplayed());
		
		//isEnabled
		
		System.out.println(driver1.findElement(By.id("loginbutton")).isEnabled());
		
		//isSelected
		
		System.out.println(driver1.findElement(By.name("sex")).isSelected());
		

	}

}
