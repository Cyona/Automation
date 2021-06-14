package seleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;
import browsers.WebDriverManagerDemo;

public class FileUpload extends WebDriverManagerDemo{
	@Test
	public void fileUpload() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("File Upload")).click();
		String path=System.getProperty("user.dir")+"\\Capture.png";
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys(path);
		Thread.sleep(2000);
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(2000);

		}
}
