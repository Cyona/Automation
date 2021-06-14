package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchingFirefoxBrowser {
	public WebDriver driver;

	@BeforeTest
	public void launchBrowser() {

		String path = System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		driver = new FirefoxDriver();
	}

	@Test
	public void login() {
		driver.get("https://google.com");

	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}