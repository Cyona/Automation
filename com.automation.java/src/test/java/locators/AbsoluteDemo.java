package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class AbsoluteDemo extends LaunchingchromeBrowser {

	@Test
	public void search() {
		driver.get("https://www.google.com/");
	//	driver.findElement(By.xpath("/html/body/div[4]/div[3]/form/div/div/div/div/div[2]/input")).sendKeys("selenium",Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div/div/div/div[2]/input")).sendKeys("Selenium jobs",Keys.ENTER);

	}
}
