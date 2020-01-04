package p1_package;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WebdriverBasics {

	public static void main(String[] args) {

		/*
		 * // Firefox Driver launch System.setProperty("webdriver.gecko.driver",
		 * "E:\\Shiv@1008\\SeleniumBackEnd\\geckodriver-v0.26.0-win64\\geckodriver.exe")
		 * ; WebDriver driver1 = new FirefoxDriver();
		 * driver1.get("https://www.google.com");
		 * 
		 * String title = driver1.getTitle(); System.out.println(title);
		 * 
		 * // if (title == "Google") if(title.equals("Google"))
		 * System.out.println("Correct Title"); else System.out.println("Wrong Title");
		 * 
		 * String currentUrl = driver1.getCurrentUrl(); System.out.println(currentUrl);
		 * 
		 * System.out.println("---------------------------");
		 * System.out.println("---------------------------");
		 * 
		 * String pageSource= driver1.getPageSource(); System.out.println(pageSource);
		 * 
		 * driver1.close(); driver1.quit();
		 */

		// Chrome Driver launch

		System.setProperty("webdriver.chrome.driver",
				"E:\\Shiv@1008\\SeleniumBackEnd\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.FPdoLc.tfB0Bf > center > input.RNmpXc")).click();

//		String newTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
//		driver.findElement(By.linkText("Gmail")).sendKeys(newTab);

		driver.close();

		// driver.get("https://facebook.com");

	}

}
