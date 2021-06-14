package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdditionalMethods {
	
	
	@Test
	public void browserTab() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String tab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.linkText("Gmail")).sendKeys(tab);
		

	}
	
	
	

		
}
