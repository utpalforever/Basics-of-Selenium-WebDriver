package p1_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Prep\\Automation\\src\\p1_package\\config.properties");

		prop.load(fis);
		String name = prop.getProperty("name");
		System.out.println(name);

		String browser = prop.getProperty("browser");

		if (browser.equals("chrome")) {

			// chrome
			System.setProperty("webdriver.chrome.driver",
					"E:\\Shiv@1008\\SeleniumBackEnd\\chromedriver_win32\\chromedriver.exe");
			   driver = new ChromeDriver();
		}

		else if (browser.equals("FF")) {

			// firefox
			System.setProperty("webdriver.gecko.driver",
					"E:\\Shiv@1008\\SeleniumBackEnd\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			   driver = new FirefoxDriver();

		}
		
		driver.get(prop.getProperty("url"));

	}
}