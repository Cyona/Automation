package seleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollFunctions  {
	
	//@Test
	public void scrollFunc() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().fullscreen();
		WebElement ele=driver.findElement(By.linkText("Contact Us"));
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
      js.executeScript("arguments[0].scrollIntoView(true);",ele); //"arguments[0]" means first index of page starting at 0.
      js.executeScript("window.scrollBy(0,400)");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	//returns the complete height of the body i.e web page.
        js.executeScript("arguments[0].style.border='4px solid red'", ele);


		Thread.sleep(5000);
		ele.click();
		
	}
	
	//@Test
	public void javaScript() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().fullscreen();
		WebElement ele=driver.findElement(By.xpath("//div[@class='header-logo']"));
		WebElement ele1=driver.findElement(By.xpath("(//a[@class='news-title'])[1]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	
		js.executeScript("arguments[0].scrollIntoView(true);", ele1);
		js.executeScript("arguments[0].style.border='4px solid red'", ele1);
		Thread.sleep(5000);
		driver.quit();

	}
	
	@Test
	public void js() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");

		WebElement ele=driver.findElement(By.xpath("//div[@class='header-logo']"));
		WebElement ele1=driver.findElement(By.xpath("//a[@class='ico-register']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title=js.executeScript("return document.title").toString();
		System.out.println(title);
		js.executeScript("alert('"  +title+  "')");
		Alert alert=driver.switchTo().alert();
		alert.accept();
		//js.executeScript("history.go(0)");
		Thread.sleep(2000);

		//js.executeScript("arguments[0].click;", ele1);
		//ele1.click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom='150%'");
		
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		js.executeScript("window.scrollBy(0,100)");
		js.executeAsyncScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		js.executeScript("history.go(0)");
		js.executeScript("return document.title").toString();
		js.executeScript("arguments[0].click();",ele);
		js.executeScript("alert('"+title+"')");
		js.executeScript("arguments[0].style.border='4px solid red'",ele);
		js.executeScript("document.body.style.zoom='150%'");
		
		

		
		
		//driver.quit();
	}

}
