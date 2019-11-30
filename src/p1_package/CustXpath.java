package p1_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CustXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Shiv@1008\\SeleniumBackEnd\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();

		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();

		driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver1.get("https://community.ebay.com/t5/Half-com/bd-p/21000000002");
		//driver1.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Book");
		//Actions action =new Actions(driver1);
		//action.moveToElement(driver1.findElement(By.id("gh-cat"))).build().perform();
		//Select select = new Select(driver1.findElement(By.id("gh-cat")));
		//select.selectByVisibleText("Books");
		//driver1.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();

		driver1.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Book");
		driver1.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
