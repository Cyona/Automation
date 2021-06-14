package selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocationAndSize {

	

	@Test
	public void multipleWin() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		System.out.println(ele.getLocation());
		System.out.println(ele.getLocation().getX());
		System.out.println(ele.getLocation().getY());
		
		System.out.println(ele.getRect().getX());
		System.out.println(ele.getRect().getY());
		
		System.out.println(ele.getSize());
		System.out.println(ele.getSize().getHeight());
		System.out.println(ele.getSize().getWidth());
		
		System.out.println(ele.getRect().getDimension().getWidth());
		System.out.println(ele.getRect().getDimension().getHeight());

	
}
}
