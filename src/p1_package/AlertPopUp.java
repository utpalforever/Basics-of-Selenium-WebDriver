package p1_package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Shiv@1008\\SeleniumBackEnd\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();

		driver1.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver1.findElement(By.name("proceed")).click();

		Alert alert = driver1.switchTo().alert();// switch control on the alert

		Thread.sleep(5000);
		String s1 = alert.getText();// get the text from the alert

		if (s1.equals("Please enter a valid user name"))
			System.out.println("Correct");
		else
			System.out.println("Incorrect");

		System.out.println(s1);
		alert.accept();// click on OK button
		// alert.dismiss(); click on Cancel button

	}
}