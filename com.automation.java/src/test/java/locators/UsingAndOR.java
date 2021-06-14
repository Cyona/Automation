package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class UsingAndOR extends LaunchingchromeBrowser{
	
	@Test
	public void login() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("Cyona");
		driver.findElement(By.xpath("//input[@type='text' and @name='firstname' or @id='u_f_b_s4']")).sendKeys("Baretto");
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

	}

}
