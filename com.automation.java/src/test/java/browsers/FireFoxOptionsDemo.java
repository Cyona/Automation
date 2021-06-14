package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxOptionsDemo {
	WebDriver driver;

	@BeforeTest
	public void launchbrowser() {

		FirefoxOptions options = new FirefoxOptions();
		// options.setProfile(new FirefoxProfile());
		options.addPreference("dom.webnotifications.enabled", false);

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver(options);

	}

	@Test
	public void browserPopup() throws InterruptedException {
		driver.get("https://www.icicibank.com/");
		driver.findElement(By.id("login-btn")).click();
		Thread.sleep(1000);
	}

	@AfterTest
	public void close() {
		driver.quit();
	}
}