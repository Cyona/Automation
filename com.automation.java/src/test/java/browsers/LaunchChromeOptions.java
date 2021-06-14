package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeOptions  {
	protected WebDriver driver;

	
	@BeforeTest
	public void launchBrowser() {
		ChromeOptions op = new ChromeOptions(); //customizing chrome driver sessions
		op.addArguments("--disable-notifications");
		op.addArguments("--incognito");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(op);


	}
	//@Test
	public void browserPopup() throws InterruptedException {
		driver.get("https://www.icicibank.com/");
		driver.findElement(By.id("login-btn")).click();
		Thread.sleep(1000);
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}


}
