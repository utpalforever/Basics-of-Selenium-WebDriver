package p1_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Shiv@1008\\SeleniumBackEnd\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();

		driver1.get("http://html.com/input-type-file/");
		driver1.findElement(By.name("fileupload")).sendKeys("E:\\Shiv@1008\\SeleniumBackEnd\\test1.txt");
		

	}

}
