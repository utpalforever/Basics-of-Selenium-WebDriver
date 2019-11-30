package p1_package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicGoogleSearch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Shiv@1008\\SeleniumBackEnd\\chromedriver_win32\\chromedriver.exe");

//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("window-size=1400,800");
//		options.addArguments("headless");
		
		//WebDriver driver1 = new ChromeDriver(options);
		WebDriver driver1 = new ChromeDriver();

		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();

		driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver1.get("https://www.google.com/");
		driver1.findElement(By.name("q")).sendKeys("define stacks");

		List<WebElement> li = driver1
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		
		// single slash or double slash will work ONLY.
		System.out.println(li.size());

		for (int i = 0; i <= li.size() - 1; i++) {
			System.out.println(li.get(i).getText());

		}

		System.out.println("-----------------------");
		System.out.println("-----------------------");

		for (int i = 0; i <= li.size() - 1; i++) {

			if (li.get(i).getText().contains("define stack pointer")) {
				System.out.println(li.get(i).getText() + " clicked");
				li.get(i).click();
				break;

			}

		}

	}

}
