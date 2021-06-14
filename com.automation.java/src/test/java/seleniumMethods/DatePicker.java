package seleniumMethods;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	
	public WebDriver driver;


		@Test
		public void datePicker() {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.redbus.in/");
			driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
			
			String year="2021";
			String month="July";
			String day="8";
			
			while(true) {
			String daymonth=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			//System.out.println(daymonth);
			String m= daymonth.split(" ")[0];
			String y= daymonth.split(" ")[1];
			//System.out.println(m);
			//System.out.println(y);
			if(m.equalsIgnoreCase(month)&& y.equals(year)) 
					break;
			
				else
					driver.findElement(By.xpath("//td[@class='next']")).click();
				
			}
			List<WebElement>dates= driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
			for(WebElement ele:dates) {
				if(ele.getText().equals(day)) {
					ele.click();
				}
				
				
			}
			driver.findElement(By.xpath("//button[@id='search_btn']")).click();
			
		}

			
		
	

}
