package p1_package;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShotConcept {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Shiv@1008\\SeleniumBackEnd\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();

		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();

		driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver1.get("https://www.amazon.in/");
		
		// Take screenshot and store as a file format
		
		File src=((TakesScreenshot) driver1).getScreenshotAs(OutputType.FILE);  
		
		//Store the screenshot at the location using copyFile() //below line should work according to the video
		
	 FileUtils.copyFile(src, new File("E:\\Shiv@1008\\SeleniumBackEnd\\scrnShot.png"));
		

	}

	
	
	
	
	
	
	
	
	
	
	
}
