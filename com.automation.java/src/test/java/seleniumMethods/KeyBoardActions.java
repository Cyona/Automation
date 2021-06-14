package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {
	
	//@Test
	public void actionsAndAction() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		WebElement ele=driver.findElement(By.xpath("(//a[@class='desktop-main'])[1]"));
		Actions act=new Actions(driver);
		//act.moveToElement(ele).perform();
		
		Action action=act.moveToElement(ele).build();
		action.perform();
		driver.findElement(By.xpath("(//a[@class='desktop-categoryLink'])[1]")).click();

}
	
	//@Test
	public void keyboardActions() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.SPACE).perform();
		Thread.sleep(3000);

		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(3000);

		act.sendKeys(Keys.ENTER).perform();		
		Thread.sleep(3000);


		
	}
	
	//@Test
	public void keyboardCompare() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		
		WebElement input1=driver.findElement(By.id("inputText1"));
		WebElement input2=driver.findElement(By.id("inputText2"));

		input1.sendKeys("Hello Selenium");
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		act.sendKeys(Keys.TAB);
		act.perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		Thread.sleep(4000);	
		
		
		
	}
	
	@Test
	public void toolTip() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(0);
		WebElement ele=driver.findElement(By.id("age"));
		String tool=ele.getAttribute("title");
		System.out.println(tool);
	}
	
}
