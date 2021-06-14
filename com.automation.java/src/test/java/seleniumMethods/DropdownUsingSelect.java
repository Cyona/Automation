package seleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class DropdownUsingSelect extends LaunchingchromeBrowser{
	
	@Test
	public void dropDown() throws InterruptedException {
		driver.get("https://www.wikipedia.org/");
		WebElement lang=driver.findElement(By.xpath("//select[@id='searchLanguage']"));
		Thread.sleep(1000);
		byVisibleText(lang,"Asturianu");
		Thread.sleep(1000);
		byIndex(lang,5);
		Thread.sleep(1000);
		byValue(lang,"ast");
		Thread.sleep(1000);

		
	}
	
	public void byVisibleText(WebElement ele,String txt) {
		Select sel=new Select(ele);
		sel.selectByVisibleText(txt);
		
	}
	public void byIndex(WebElement ele2,int index) {
		Select sel=new Select(ele2);
		sel.selectByIndex(index);
		
	}
	public void byValue(WebElement ele3,String value) {
		Select sel=new Select(ele3);
		sel.selectByValue(value);
		
	}

}
