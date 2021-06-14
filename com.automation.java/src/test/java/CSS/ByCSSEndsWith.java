package CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class ByCSSEndsWith extends LaunchingchromeBrowser {

	@Test
	public void search() {
		driver.get("https://www.google.com/");
		//tagname[attribute$='value']
		driver.findElement(By.cssSelector("input[class$='gsfi']")).sendKeys("jobs",Keys.ENTER);
	}
	
}