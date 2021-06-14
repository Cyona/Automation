package CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class ByCSSID extends LaunchingchromeBrowser {
	
	
	@Test
	public void search() {
		driver.get("https://amazon.in/");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("shirts",Keys.ENTER);
		
	}


}
