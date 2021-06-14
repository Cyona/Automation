package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class PartialLinkText extends LaunchingchromeBrowser {

	@Test
	public void search() {
		driver.get("https://www.google.com/");
		driver.manage().window().fullscreen();
		driver.findElement(By.partialLinkText("Ima")).click();
		driver.findElement(By.name("q")).sendKeys("india",Keys.ENTER);
	}


}
