package p1_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasics {

	public static void main(String[] args) {

	/*	// Firefox Driver launch
		System.setProperty("webdriver.gecko.driver","E:\\Shiv@1008\\SeleniumBackEnd\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.google.com");

		String title = driver1.getTitle();
		System.out.println(title);

		// if (title == "Google")
			if(title.equals("Google"))
			System.out.println("Correct Title");
		else
			System.out.println("Wrong Title");

		String currentUrl = driver1.getCurrentUrl();
		System.out.println(currentUrl);

		System.out.println("---------------------------");
		System.out.println("---------------------------");
		
		String pageSource= driver1.getPageSource();
		System.out.println(pageSource);
		
		driver1.close();
		driver1.quit(); */

		// Chrome Driver launch

		
		  System.setProperty("webdriver.chrome.driver","E:\\Shiv@1008\\SeleniumBackEnd\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver2=new ChromeDriver(); driver2.get("https://www.gmail.com");
		  driver2.close();
		

	}

}
