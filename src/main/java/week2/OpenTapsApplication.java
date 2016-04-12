package week2;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenTapsApplication extends Wrapper  {
	@Test
	public  void OpenTaps() {
		/*// launch browser
		FirefoxDriver driver = new FirefoxDriver();
		
		// to maximize
		driver.manage().window().maximize();
		
		// implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// To launch the url
		driver.get("http://demo1.opentaps.org/opentaps/control/main");
		*/
		
		launchApplication("chrome","http://demo1.opentaps.org/opentaps/control/main" );
		
		/*// Get the title
		System.out.println(driver.getTitle());*/
		
		/*// Enter the username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		// Enter the pwd
		driver.findElementById("password").sendKeys("crmsfa");*/
		enterTextById("username", "DemoSalesManager");
		enterTextById("password", "crmsfa");
		
		/*// Login
		driver.findElementByClassName("decorativeSubmit").click();
		*/
		clickByClassName("decorativeSubmit");
		/*//Logout 
		driver.findElementById("logout").click();
		*/
		//verifyTitle();
		clickById("logout");
	
	}
	
}
