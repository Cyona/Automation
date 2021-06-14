package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;
import browsers.WebDriverManagerDemo;

public class FrameHandling extends WebDriverManagerDemo {
	
	//@Test
	public void frame() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.findElement(By.linkText("iFrame")).click();
		Thread.sleep(1000);
		
		driver.switchTo().frame("mce_0_ifr");
		WebElement ele=driver.findElement(By.id("tinymce"));
		ele.clear();
		ele.sendKeys("hello all");
		Thread.sleep(1000);
		
		
	}
	@Test
	public void nestedFrame() throws InterruptedException {
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		WebElement element=driver.findElement(By.name("packageListFrame"));
		driver.switchTo().frame(element);   //webelement
		//driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		Thread.sleep(1000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame"); //name
		driver.findElement(By.linkText("Alert")).click();
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		WebElement ele=driver.findElement(By.xpath("//h2[text()='Interface Alert']"));
		System.out.println(ele.getText());
		Thread.sleep(1000);


	}
}
