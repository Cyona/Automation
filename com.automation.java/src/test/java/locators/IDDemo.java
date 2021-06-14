package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;

import browsers.LaunchingchromeBrowser;

public class IDDemo extends LaunchingchromeBrowser {
	
	@Test
	public void search() {
		driver.get("https://amazon.in/");
	//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shirts",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
		
	}

}
