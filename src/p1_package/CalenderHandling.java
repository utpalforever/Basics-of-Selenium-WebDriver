package p1_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {

	public static void main(String[] args) throws InterruptedException {

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
		driver1.findElement(By.xpath("//*[@id=\"main-nav\"]/a[2]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
