package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class UsingText extends LaunchingchromeBrowser {

	@Test
	public void search() {
		driver.get("https://www.myntra.com/login/password");
		WebElement ele=driver.findElement(By.xpath("//div[text()='Login to your account']"));
		System.out.println(ele.isDisplayed());
		if(ele.isDisplayed()) {
			System.out.println(ele.getText());
		}
		Assert.assertEquals(ele.getText(), "Login  your account");
	}
}
