package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class Preceding extends LaunchingchromeBrowser{
	
	@Test
	public void search() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/tables");
		String name="fbach@yahoo.com";
		WebElement ele=driver.findElement(By.xpath("//table[@id='table1']//td[text()='NAME']//preceding::td[1]".replace("NAME",name)));
		System.out.println(ele.getText());
		Thread.sleep(3000);
	}

}
