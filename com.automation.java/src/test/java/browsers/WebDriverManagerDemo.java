package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerDemo {
	public WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		//WebDriverManager.edgedriver().setup();
		//driver=new EdgeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//driver=new FirefoxDriver();
	}
	

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}