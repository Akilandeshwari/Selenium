package week1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcRegistration {

	public static void main(String[] args) {
		// To Launch browser
		//FirefoxDriver driver = new FirefoxDriver();
	    
	/*	// To maximize the window
		driver.manage().window().maximize();*/
		// sets the property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch chrome
		ChromeDriver driver = new ChromeDriver();
	
		// To launch the Irctc
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		// Implicitly wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Enter Username
		try {
			driver.findElementById("userRegistrationForm:userName:").sendKeys("akila_1992");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Enter Password
		driver.findElementById("userRegistrationForm:password").sendKeys("daddy24565");
		
		// Confirm Password
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("daddy24565");
		
		// Security Question
		Select St = new Select(driver.findElementById("userRegistrationForm:securityQ"));
		St.selectByIndex(2);
		
		//Security answer
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("vsrmhss");
		
		//Preferred Language
		Select Pl = new Select(driver.findElementById("userRegistrationForm:prelan"));
		Pl.selectByIndex(1);
		
		// First name
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Akilandeshwari");

		//Middle name
		driver.findElementById("userRegistrationForm:middleName").sendKeys("AM");
		
		//Last name
		driver.findElementById("userRegistrationForm:lastName").sendKeys("AkilMurali");
		
		//Gender
		driver.findElementById("userRegistrationForm:gender:1").sendKeys("Female");
		
		//Marital Status
		driver.findElementById("userRegistrationForm:maritalStatus:1").sendKeys("Unmarried");
				
		//DOB
		Select Day = new Select(driver.findElementById("userRegistrationForm:dobDay"));
		Day.selectByIndex(1);
		Select Month = new Select(driver.findElementById("userRegistrationForm:dobMonth"));
		Month.selectByIndex(2);
		Select Year = new Select(driver.findElementById("userRegistrationForm:dateOfBirth"));
		Year.selectByIndex(2);
		
		//Occupation
		Select Oc = new Select(driver.findElementById("userRegistrationForm:occupation"));
		Oc.selectByIndex(2);
				
		//Aadhar no
		driver.findElementById("userRegistrationForm:uidno").sendKeys("78145688");
		
		// pan card
		driver.findElementById("userRegistrationForm:idno").sendKeys("BAKPA4528G");
		
		//Email
		driver.findElementById("userRegistrationForm:email").sendKeys("a.m.akilandeshwari@gmail.com");
		
		//mobile
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9087821088");
		
		//Nationality
		Select N = new Select(driver.findElementById("userRegistrationForm:nationalityId"));
		N.selectByIndex(1);
		
		// Flat no
		driver.findElementById("userRegistrationForm:address").sendKeys("23");
		
		//Street
		driver.findElementById("userRegistrationForm:street").sendKeys("VOC Street");
		
		//Area
		driver.findElementById("userRegistrationForm:area").sendKeys("chennai");
		
		//Country
		Select C = new Select(driver.findElementById("userRegistrationForm:countries"));		
		C.selectByIndex(106);
		
		//Pincode
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600032");
		
		//State
		driver.findElementById("userRegistrationForm:statesName").sendKeys("TamilNadu");
		
		//City 
		WebElement mySelectElm = driver.findElementById("userRegistrationForm:cityName"); 
		Select mySelect= new Select(mySelectElm);
		List<WebElement> options = mySelect.getOptions();
		for (WebElement option : options) {
		    System.out.println(option.getText()); //Prints "Option", followed by "Not Option"
		}
		//Post office 
		
		WebElement mySelectElement = driver.findElementById("userRegistrationForm:postofficeName"); 
		Select mySlct= new Select(mySelectElement);
		List<WebElement> optionsList = mySlct.getOptions();
		for (WebElement option : optionsList) {
		    System.out.println(option.getText()); //Prints "Option", followed by "Not Option"
		}
		
		// phone
		driver.findElementById("userRegistrationForm:landline").sendKeys("04312782224");
		
		// copy residence to office address
		
		driver.findElementById("userRegistrationForm:resAndOff:0").sendKeys("Yes");
		
		//Irctc newsletters
		driver.findElementById("userRegistrationForm:newsletter:1").sendKeys("No");
		
		//Commercial promotions
		driver.findElementById("userRegistrationForm:commercialpromo:1").sendKeys("No");
		
		//Inform through phone
		driver.findElementById("userRegistrationForm:irctcsbicard:1").sendKeys("No");
		
	}

}
