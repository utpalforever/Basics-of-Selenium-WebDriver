package p1_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableCocept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Shiv@1008\\SeleniumBackEnd\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://freecrm.com/");
		
		driver.findElement(By.xpath("//a[contains(@class, 'btn btn-primary btn-xs-2 btn-shadow')]")).click();
		driver.findElement(By.name("email")).sendKeys("utpalforever@gmail.com");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		driver.navigate().refresh();
		String beforePath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
		String afterPath="]/td[2]";
		
		for(int i=1; i<=5;i++) {
			String xpath=beforePath+i+afterPath;
			String textName=driver.findElement(By.xpath(xpath)).getText();
			
			if(textName.contains("utpal shivam")) {
				driver.findElement(By.xpath(xpath)).click();
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
