package p1_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarJS {

	public static void dateSelectJS(WebDriver driver, WebElement element, String dateVal) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','" + dateVal + "');", element);

	}
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Shiv@1008\\SeleniumBackEnd\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();

		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();

		driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver1.get("https://www.spicejet.com/");

		WebElement date = driver1.findElement(By.className("ui-datepicker-trigger"));

		String dateVal = "Tue, Nov 19 2019";
		dateSelectJS(driver1, date, dateVal);
	

	}

	

}
