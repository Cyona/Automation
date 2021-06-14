package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class BuiltInMethods extends LaunchingchromeBrowser {
	
	@Test
	public void builtIns() {
		driver.get("https://www.google.com/");
		driver.manage().window().fullscreen();
		
		String title=driver.getTitle();
		System.out.println("Title is" +title);
		
		driver.findElement(By.name("q")).sendKeys("Selenium jobs",Keys.ENTER);
		String url=driver.getCurrentUrl();
		System.out.println("Current url is is" +url);
		
		String pagesource=driver.getPageSource();
	//	System.out.println("Page source is"+pagesource);
		
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();

	}

}
