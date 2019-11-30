package p1_package;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUpHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Shiv@1008\\SeleniumBackEnd\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();

		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();

		driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver1.get("http://popuptest.com/");
		driver1.findElement(By.linkText("Come & Go Test")).click();

		Set<String> handler = driver1.getWindowHandles();

		Iterator<String> it = handler.iterator();

		String parentWindowID = it.next();

		String childWindowID = it.next();

		System.out.println("Parent Window ID" + parentWindowID);
		System.out.println("Child Window ID" + childWindowID);

		driver1.switchTo().window(childWindowID);
		String childWindowTitle = driver1.getTitle();

		System.out.println("Child Window Title" + childWindowTitle);

		driver1.switchTo().window(parentWindowID);

		String parentWindowTitle = driver1.getTitle();

		System.out.println("Parent Window Title" + parentWindowTitle);

	}

}
