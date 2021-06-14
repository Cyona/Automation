package seleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class ActionDemo extends LaunchingchromeBrowser{
	
	@Test
	public void mouseHover() throws InterruptedException {
		driver.get("https://www.myntra.com/");
		WebElement tgt=driver.findElement(By.xpath("//a[@class='desktop-main' and text()='Women']"));
		String dress="Ethnic Wear";
		WebElement tgt1=driver.findElement(By.xpath("//a[text()='DressName']".replace("DressName", dress)));
		mouseHover(driver,tgt);
		Thread.sleep(2000);
		actionClick(driver, tgt1);
		Thread.sleep(2000);

	}
	
	public void mouseHover(WebDriver driver,WebElement target) {
		Actions act =new Actions(driver);
		act.moveToElement(target).build().perform();
		
		
	}
	
	@Test
	public void dragAndDrop() throws InterruptedException {
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement src=driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		Thread.sleep(2000);

		WebElement tgt=driver.findElement(By.id("amt7"));
		
		dragAndDrop(driver,src,tgt);
		Thread.sleep(2000);
	}
	
	public void actionClick(WebDriver driver,WebElement target) {
		Actions act =new Actions(driver);
		act.click(target).build().perform();

	}
	public void dragAndDrop(WebDriver driver,WebElement source,WebElement dest) {
		Actions act =new Actions(driver);
		act.dragAndDrop(source, dest).build().perform();

	}
}
