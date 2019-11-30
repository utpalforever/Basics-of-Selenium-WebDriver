package p1_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Shiv@1008\\SeleniumBackEnd\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();

		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();

		driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver1.get("https://jqueryui.com/droppable/");

		driver1.switchTo().frame(0);
		Actions action = new Actions(driver1);
		Thread.sleep(4000);

		action.clickAndHold(driver1.findElement(By.xpath("//*[@id=\"draggable\"]/p")))
				.moveToElement(driver1.findElement(By.xpath("//*[@id=\"droppable\"]/p"))).release().build().perform();

	}

}
