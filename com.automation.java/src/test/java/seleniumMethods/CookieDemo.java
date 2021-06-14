package seleniumMethods;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import browsers.LaunchingchromeBrowser;
import browsers.WebDriverManagerDemo;

public class CookieDemo extends WebDriverManagerDemo{
	
	@Test
	public void captureCookie() {
		driver.get("https://demo.nopcommerce.com/");
		Set<Cookie>cookie=driver.manage().getCookies();
		System.out.println(cookie.size());
		for(Cookie c:cookie) {
			System.out.println(c.getName()+"  "+c.getValue());
		}
		
		Cookie coo=new Cookie("MyCookie","cookie123");
		driver.manage().addCookie(coo);
		driver.manage().getCookies();
		cookie=driver.manage().getCookies();
		System.out.println(cookie.size());
		
	//	driver.manage().deleteCookie(coo);
		driver.manage().deleteCookieNamed("MyCookie");

		cookie=driver.manage().getCookies();
		System.out.println(cookie.size());
		driver.manage().deleteAllCookies();
	}

}
