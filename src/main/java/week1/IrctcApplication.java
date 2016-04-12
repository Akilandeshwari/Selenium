/**
 * 
 */
package week1;

import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Akila
 *
 */
public class IrctcApplication {

	public static void main(String[] args) {
		// To Launch browser
		FirefoxDriver driver = new FirefoxDriver();
		/*	
		// To maximize the window
		driver.manage().window().maximize(); */
	
		// To launch the irctc app
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		// To Get the title
		System.out.println(driver.getTitle());
		
		// Enter the username
		driver.findElementById("usernameId").sendKeys("akil_1992");
		
		//Enter the Password
		driver.findElementByName("j_password").sendKeys("daddy24565");
		  
	
	}

}
