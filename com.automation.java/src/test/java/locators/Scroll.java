package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class Scroll extends LaunchingchromeBrowser{
	
	@Test
	public void search() throws InterruptedException {
		driver.get("https://www.moneycontrol.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		String marketname="Nifty 50";
		WebElement ele=driver.findElement(By.xpath("//table[@class='rhsglTbl']//a[contains(text(),'MARKET')]//following::td[1]".replace("MARKET", marketname)));
		System.out.println(ele.getText());
	}

}
