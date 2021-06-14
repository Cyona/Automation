package seleniumMethods;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkDemo {

	@Test
	public void brokenLinkTest() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://error404.atomseo.com/");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement ele:links) {
			//WebElement ele=links.get(i);
			String url=ele.getAttribute("href");
			//System.out.println(url);
			
			URL link=new URL(url);
			HttpURLConnection con=(HttpURLConnection) link.openConnection();
			Thread.sleep(3000);
			con.connect();
			int responsecode=con.getResponseCode();
			if (responsecode>400) {
				System.out.println(url+ "is a broken link");
			}
			else
			{
				System.out.println(url+ "is a valid link");
			}
			con.disconnect();
		}
	}
}
