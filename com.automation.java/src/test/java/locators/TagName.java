package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;
import browsers.WebDriverManagerDemo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TagName extends WebDriverManagerDemo {

	@Test
	public void search() {
		driver.get("https://www.google.com/");
		driver.manage().window().fullscreen();
		List<WebElement>ele=driver.findElements(By.tagName("a"));
		System.out.println(ele.size());
		
		for(WebElement links:ele) {
			System.out.println(links.getText()+" "+links.getAttribute("href"));
			
		}

	}

}
