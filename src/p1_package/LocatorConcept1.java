package p1_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Shiv@1008\\SeleniumBackEnd\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();

		driver1.get("https://www.facebook.com/");// to enter url after launching
//xpath

		// driver1.findElement(By.xpath("//*[@id=\"u_0_n\"]")).sendKeys("Jeffy");
		// driver1.findElement(By.xpath("//*[@id=\"u_0_p\"]")).sendKeys("Jerry");

//id

		// driver1.findElement(By.id("u_0_n")).sendKeys("Tom");
		// driver1.findElement(By.id("u_0_p")).sendKeys("Jerry");

//name		
		// driver1.findElement(By.name("firstname")).sendKeys("Tom");
		// driver1.findElement(By.name("lastname")).sendKeys("Jerry");

//linkText		 

		// driver1.findElement(By.linkText("Forgotten account?")).click();

//partialLinkText
		// driver1.findElement(By.partialLinkText("Forgotten")).click(); //not recommended

//cssSelector
		// driver1.findElement(By.cssSelector("#u_0_n")).sendKeys("Tom");

//className

        //driver1.findElement(By.className("      ")).sendKeys("Jeffy"); //not recommended	
		// driver1.close();

	}

}
