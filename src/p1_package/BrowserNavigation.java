package p1_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Shiv@1008\\SeleniumBackEnd\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();

		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();

		driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		//driver1.get("https://www.makemytrip.com/");
		
		driver1.get("https://www.amazon.in/");

		driver1.navigate().to("https://www.amazon.in/");
		driver1.navigate().back();

		Thread.sleep(2000);
		driver1.navigate().forward();

		driver1.navigate().back();
		driver1.navigate().refresh();

	}

}
