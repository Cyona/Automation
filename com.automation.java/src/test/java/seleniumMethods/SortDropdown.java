package seleniumMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class SortDropdown extends LaunchingchromeBrowser {
	
	@Test
	public void dropDown() {
		driver.get("https://www.wikipedia.org/");
		List<WebElement> lang=driver.findElements(By.xpath("//select[@id='searchLanguage']//option"));
		//Select sel=new Select(driver.findElement(By.xpath("//select[@id='searchLanguage']")));
		//List<WebElement> opt=sel.getOptions();

		System.out.println(lang.size());
		List<String> empty=new ArrayList<String>();

		for(WebElement ele:lang) {
			empty.add(ele.getText());
		//	System.out.println(ele.getText());
		}
		System.out.println("Before sorting"+empty);
		Collections.sort(empty);
		System.out.println("After sorting"+empty);
		
		

	}

}
