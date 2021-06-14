package seleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class AlertsDemo extends LaunchingchromeBrowser {
	
//	@Test
	public void alert() throws InterruptedException {
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement btn=driver.findElement(By.xpath("//input[@value='Sign in']"));
		btn.click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		driver.findElement(By.cssSelector("#login1")).sendKeys("cyona.baretto@gmail.com");
		driver.findElement(By.cssSelector("input[name='passwd']")).sendKeys("Password123");
		btn.click();
		
		Thread.sleep(1000);
	}
	

	@Test
	public void alertTypes() throws InterruptedException {
	
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		alertAccept();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		alertDismiss();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		System.out.println(getText());
		sendText("selenium");
		Thread.sleep(2000);

		alertAccept();
		Thread.sleep(2000);
	}
	
	
	public void alertAccept() {
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	public void alertDismiss() {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
	
	public String getText() {
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		return text;
	}
	public void sendText(String txt) {
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(txt);
		
	}
}
