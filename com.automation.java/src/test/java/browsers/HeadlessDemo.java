package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessDemo {
	public WebDriver driver;


	@BeforeTest
	public void launchBrowser() {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--headless"); // execution on server side without opening browserd
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(op);
}
	
	@Test
	public void login() {
		driver.get("https:google.com");
		System.out.println(driver.getTitle());
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();}
}