package seleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class Checkboxes extends LaunchingchromeBrowser {

	@Test
	public void checkboxDemo() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Checkboxes")).click();
		Thread.sleep(2000);
		List<WebElement> li = driver.findElements(By.xpath("//form[@id='checkboxes']//input"));
		System.out.println(li.size());
		for (int i = 0; i < li.size(); i++) {
			if (li.get(i).isSelected()) {
				System.out.println("Already selected");
			} else

				li.get(i).click();
			Thread.sleep(2000);
		}

	}

}
