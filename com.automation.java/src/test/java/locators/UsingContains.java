package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class UsingContains extends LaunchingchromeBrowser{
	
	@Test
	public void login() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
		Thread.sleep(1000);
		
	}

	}
