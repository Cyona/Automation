package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChromeOptions;
import browsers.LaunchingchromeBrowser;

public class ClassName extends LaunchChromeOptions {
	
	@Test
	public void search() {
		driver.get("https://www.icicibank.com/");
		driver.findElement(By.className("ic-btn")).click();
	}

}
