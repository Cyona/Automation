package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class UingStartsWith extends LaunchingchromeBrowser {

	@Test
	public void search() {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[starts-with(@class,'gLFyf')]")).sendKeys("java selenium",Keys.ENTER);
}
	
}