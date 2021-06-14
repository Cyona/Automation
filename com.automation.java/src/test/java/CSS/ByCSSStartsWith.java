package CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class ByCSSStartsWith extends LaunchingchromeBrowser {

	@Test
	public void search() {
		driver.get("https://www.google.com/");
		//tagname[attribute^='value']
		driver.findElement(By.cssSelector("input[class^='gLFyf']")).sendKeys("jobs",Keys.ENTER);
	}
	
}