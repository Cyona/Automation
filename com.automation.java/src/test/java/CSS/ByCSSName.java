package CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChromeOptions;
import browsers.LaunchingchromeBrowser;

public class ByCSSName extends LaunchChromeOptions {
	
	@Test
	public void search() throws InterruptedException {
		driver.get("https://www.icicibank.com/");
		driver.findElement(By.cssSelector(".ic-btn")).click();
		Thread.sleep(1000);
	}


}
