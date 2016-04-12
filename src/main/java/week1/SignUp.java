package week1;

import java.awt.Checkbox;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import javafx.scene.control.RadioButton;

public class SignUp {

	public static void main(String[] args) {
		
		        // To Launch browser
				FirefoxDriver driver = new FirefoxDriver();
			    
			/*	// To maximize the window
				driver.manage().window().maximize();*/
			
				// To launch the salesforcedeveloper
				driver.get("https://developer.salesforce.com/signup?d=70130000000td6N");
				
				//Enter first name
				driver.findElementById("first_name").sendKeys("Akilandeshwari");	
				
				//Enter last name
				driver.findElementByName("user[last_name]").sendKeys("AkilMurali");
				
				//Enter email
				driver.findElementById("email").sendKeys("aaaaa@gmail.com");
	
				//Enter role
				Select Role = new Select(driver.findElementById("job_role"));
				Role.selectByIndex(1);
				//driver.findElementById("job_role").sendKeys("Developer");
				
				//Enter company
				driver.findElementById("company").sendKeys("TCS"); 
				
				// Enter country
				Select Country = new Select(driver.findElementByName("user[country]"));
				Country.selectByIndex(5);
				//driver.findElementByName("user[country]").sendKeys("IN");
				
				// Enter Postal code
				driver.findElementById("postal_code").sendKeys("620102");
				
				// Enter username
				driver.findElementById("username").sendKeys("a.m.akilandeshwari@gmail.com");
				
				// check agreement
				driver.findElementById("eula").click();
				
				// Submit
				driver.findElementById("submit_btn").click();
	
	}

}
