package seleniumMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotDemo {

//	@Test
	public void pageScreenshot() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"\\Screenshot\\homepage22.png";
		File dest=new File(path);
		FileUtils.copyFile(source,dest);
	}
	
	@Test
public void specificScreenshot() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		WebElement ele=driver.findElement(By.xpath("//div[@class='category-grid home-page-category-grid']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
	//	js.executeScript("arguments[0].scrollIntoView(true);", ele);

		File source=ele.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"\\Screenshot\\homepage121.png";
		File dest=new File(path);
		FileUtils.copyFile(source,dest);
	}
}
