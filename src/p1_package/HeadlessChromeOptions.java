package p1_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeOptions {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
				"E:\\Shiv@1008\\SeleniumBackEnd\\chromedriver_win32\\chromedriver.exe");

//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("window-size=1400,800");
//		options.addArguments("headless");
//		
		WebDriver driver1 = new ChromeDriver();

		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();

		driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver1.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		System.out.println(driver1.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			

	}

}
