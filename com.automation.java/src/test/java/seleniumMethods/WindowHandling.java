package seleniumMethods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class WindowHandling extends LaunchingchromeBrowser {
	

//@Test
	public void windowhandling() throws InterruptedException {

		driver.get("http://demo.automationtesting.in/Windows.html");
		//String win=driver.getWindowHandle();
		//System.out.println(win);
		driver.findElement(By.linkText("click")).click();
		Thread.sleep(3000);
		Set<String>windowhandle=driver.getWindowHandles();
		//System.out.println(windowhandle);
		Iterator<String>itr=windowhandle.iterator();
		String parentwin=itr.next();
		System.out.println(parentwin);
		
		String childwin=itr.next();
		System.out.println(childwin);
		driver.switchTo().window(childwin);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentwin);
		System.out.println(driver.getTitle());
		

		Thread.sleep(3000);

		

	}
	
	@Test
	public void windowhandling1() throws InterruptedException {


		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.linkText("click")).click();
		String win1 = driver.getWindowHandle();
		System.out.println(win1);
		String title = driver.getTitle();
		System.out.println("Home Page Title: " + title);

		Set<String> win2 = driver.getWindowHandles();
		System.out.println(win2);
		Iterator<String> i1 = win2.iterator();

		
		String firstwindow = i1.next(); // window id of the main window
		System.out.println("first window is"+firstwindow);

		String SecondWindow = i1.next();
		System.out.println("Second window is"+SecondWindow);

		driver.switchTo().window(SecondWindow);
	
		String title2 = driver.getTitle();
		System.out.println("Second window title: " + title2);
		driver.close();
		driver.switchTo().window(firstwindow);
		System.out.println("first window title "+driver.getTitle());
		Thread.sleep(3000);
		
		

	}


}
