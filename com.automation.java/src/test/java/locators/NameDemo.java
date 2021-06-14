package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class NameDemo extends LaunchingchromeBrowser {
	
	@Test
	public void search() {
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium jobs",Keys.ENTER);
	}

}