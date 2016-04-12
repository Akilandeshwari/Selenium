package week1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {

		// To Launch browser
		FirefoxDriver driver = new FirefoxDriver();
	    
	/*	// To maximize the window
		driver.manage().window().maximize();*/
	
		// To Launch the Salesforcedeveloper application
		
		driver.get("https://developer.salesforce.com");
		
		// Click Login Button
		driver.findElementById("login-button").click();
		
		// Enter Username
		driver.findElementById("username").sendKeys("a.m.akilandeshwari@gmail.com");
			
		// Enter Password
		driver.findElementById("password").sendKeys("password1234");
		
		// Login
		driver.findElementById("Login").click();
		
	}

}
