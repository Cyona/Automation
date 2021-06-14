package seleniumMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;

public class RadioButton extends LaunchingchromeBrowser {

	//@Test
	public void radio() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);

		WebElement ele = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		ele.click();
		Thread.sleep(1000);
		String gender = "Male";
		WebElement radio=driver.findElement(By.xpath("//label[text()='GENDER']".replace("GENDER", gender)));
				radio.click();
		Thread.sleep(3000);
	}

	@Test

	public void radioBtn() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);

		WebElement ele = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		ele.click();
		Thread.sleep(1000);
	//	String gender = "Male";
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		radio.get(0).click();
		Thread.sleep(3000);
		if (radio.get(1).isSelected()) {
			System.out.println("Is clicked");
		} else {
			radio.get(1).click();
		}
		
		/*to click all radio buttons
		for(int i=0;i<radio.size();i++) {
			
				radio.get(i).click();
				Thread.sleep(3000);
				//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			}*/
			
		}

	

}
