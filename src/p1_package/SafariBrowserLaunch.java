package p1_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariBrowserLaunch {

	public static void main(String[] args) {

		
		//System.setProperty("webdriver.safari.driver", "E:\\Shiv@1008\\SeleniumBackEnd.SafariSetup.exe");\\not needed
		WebDriver driver=new SafariDriver();
		
		driver.get("https://www.google.com");
		
	}

}
