package p1_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitConcept {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Shiv@1008\\SeleniumBackEnd\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();

		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();

		driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver1.get("https://www.amazon.in/");
		
		//clickOn(driver1, driver1.findElement(By.xpath("//a[contains(text(),'Best Sellers')]")),20);//explicitly wait for the link Best Sellers to come within 20 secs
		
		clickOn(driver1, driver1.findElement(By.className("nav-inpu")),20);//explicitly wait for login button but locator is wrong to see the Exception
		
		
		
		
	}

	public static void clickOn(WebDriver driver1 , WebElement locator, int timeout ) {
		new WebDriverWait (driver1, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
}

}

















