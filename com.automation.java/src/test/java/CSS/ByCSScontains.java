package CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class ByCSScontains extends LaunchingchromeBrowser{
	
	@Test
	public void login() throws InterruptedException {
		driver.get("https://www.google.com/");
		//tagname[attribute$='value']
		driver.findElement(By.cssSelector("input[class*='gLFy']")).sendKeys("linkedIn",Keys.ENTER);
		Thread.sleep(1000);
		
	}

	}
