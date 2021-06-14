package seleniumMethods;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {
	
		public WebDriver driver;
		@Test
		public void fileUpload() throws InterruptedException {
			
			String path="C:\\Users\\baretc\\Documents";
			HashMap<String,Object> pref=new HashMap<String,Object>();
			pref.put("download.default_directory",path);
			ChromeOptions op=new ChromeOptions();
			op.setExperimentalOption("prefs", pref);
			//op.addArguments("--disable-extensions");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(op);
	
			driver.get("https://the-internet.herokuapp.com/");
			driver.findElement(By.linkText("File Download")).click();
			driver.findElement(By.linkText("Capture.png")).click();
			Thread.sleep(3000);
		//	driver.quit();

			}
		@Test
		public void fileUploadFirefox() throws InterruptedException {
			
			String path = System.getProperty("user.dir") + "\\Files";

			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "image/png, application/pdf");//to automatically download the files of the selected mime-types
			profile.setPreference("browser.download.folderList",2); //tells it not to use default Downloads directory
			profile.setPreference("browser.download.dir",path); //sets the directory for downloads
			profile.setPreference("pdfjs.disabled", true);
	
			FirefoxOptions options=new FirefoxOptions();
			options.setProfile(profile);

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(options);
	
			driver.get("https://the-internet.herokuapp.com/");
			driver.findElement(By.linkText("File Download")).click();
			driver.findElement(By.linkText("Capture.png")).click();
			Thread.sleep(3000);
		//	driver.quit();

			}



}
