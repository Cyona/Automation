package seleniumMethods;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class AutoSuggestandCalendar extends LaunchingchromeBrowser {

	@Test
	public void autoSuggestandCalendar() throws InterruptedException {
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Bangalore");
		Thread.sleep(1000);
		List<WebElement> srcCity = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
		// String pickupCity="Majestic, Bangalore";
		System.out.println(srcCity.size());
	//	alertAccept();

		for (WebElement ele : srcCity) {
			//String pickup = ele.getText();
			Thread.sleep(1000);
			if (ele.getText().equals("Majestic, Bangalore")) {
				ele.click();
				break;
			}
		}
		driver.findElement(By.id("dest")).sendKeys("Goa");
		Thread.sleep(1000);
		List<WebElement> destCity = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
		Thread.sleep(1000);

		for (WebElement ele1 : destCity) {
			String drop = ele1.getText();
			Thread.sleep(1000);
			if (drop.equals("Madgaon, Goa")) {
				ele1.click();
				break;
			}
		}
	//	alertAccept();

		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		Thread.sleep(1000);
		List<WebElement> cal = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));

		for(WebElement ele2:cal) {
			if(ele2.getText().equals("Apr 2021")) {
				driver.findElement(By.xpath("//td[@class='next']")).click();
				break;
			}
		}
		
		Thread.sleep(2000);
		List<WebElement> nxtcal = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
		
		for(WebElement ele3:nxtcal) {
			if(ele3.getText().equals("22")) {
				ele3.click();
				break;
			}
		}
		
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(5000);

	}
	
	public void alertAccept() {
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
	}

}
