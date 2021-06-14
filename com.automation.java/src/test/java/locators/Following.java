package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;
import browsers.WebDriverManagerDemo;

public class Following extends WebDriverManagerDemo{
	
	@Test
	public void search() {
		driver.get("https://www.moneycontrol.com/");
		//WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'DRREDDY')]//following::td[1]/span[contains(text(),'5,098.00')]"));
		String marketname="Nifty 50";
		WebElement ele=driver.findElement(By.xpath("//table[@class='rhsglTbl']//a[contains(text(),'MARKET')]//following::td[1]".replace("MARKET", marketname)));
		System.out.println(ele.getText());
	}

}
