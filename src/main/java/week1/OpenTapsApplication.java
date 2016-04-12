package week1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenTapsApplication {
	public static void main(String[] args) {
		// launch browser
		FirefoxDriver driver = new FirefoxDriver();
		
		/*// to maximize
		driver.manage().window().maximize();*/
		
		// implicitly wait
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// To launch the url
		driver.get("http://demo1.opentaps.org/opentaps/control/main");
		
		// Get the title
		System.out.println(driver.getTitle());
		
		// Enter the username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		// Enter the pwd
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		// Login
		driver.findElementByClassName("decorativeSubmit").click();
		
		// Go to crmsfa 
		driver.findElementByLinkText("CRM/SFA").click();
		
		// Go to create lead
		driver.findElementByLinkText("Create Lead").click();
		
		// Enter company name - Create Lead
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		
		/*// Enter Parent account - Create Lead
		driver.findElementById("createLeadForm_parentPartyId").sendKeys("AAA");
		*/
		// Enter First Name - Create Lead
		driver.findElementById("createLeadForm_firstName").sendKeys("Akilandeshwari");

		// Enter Last Name - Create Lead
		driver.findElementById("createLeadForm_lastName").sendKeys("AkilMurali");
		
		// Click submit button
		driver.findElementByName("submitButton").click();
		
		/*// Enter Source - Create Lead
		driver.findElementById("createLeadForm_dataSourceId").sendKeys("Direct Mail");
		
		// Enter Marketing campaign - Create Lead
		driver.findElementById("createLeadForm_marketingCampaignId").sendKeys("Car and Driver"); 
		
		// Enter First name Local - Create Lead
		driver.findElementByName("firstNameLocal").sendKeys("Akila");
		
		// Enter Last name Local - Create Lead
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("AM");
		
		// Enter Salutation - Create Lead 
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Ms");
		
		// Enter DOB - Create Lead
		driver.findElementById("createLeadForm_birthDate").sendKeys("03/21/16");
		
		// Enter Title - Create Lead
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Open Taps");
		
		//Enter Department - Create Lead
		driver.findElementById("createLeadForm_departmentName").sendKeys("IT");
		
		//Enter Annual Revenue - Create Lead
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("ten lakh");
		
		//Enter Preferred currency - Create Lead
		driver.findElementById("createLeadForm_currencyUomId").sendKeys("BBD - Barbados Dollar");
		
		//Enter Industry - Create Lead
		driver.findElementById("createLeadForm_industryEnumId").sendKeys("Computer Software");
		
		//Enter no of employees - Create Lead
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		
		//Enter Ownership - Create Lead
		driver.findElementById("ownershipEnumId").sendKeys("Corporation");
		
		//Enter SIC code - Create Lead
		driver.findElementById("createLeadForm_sicCode").sendKeys("12345");
		
		//Enter Ticker symbol - Create Lead
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("$");
		
		// Logout using Xpath
		driver.findElementByXPath("//*[@id='logout']/input").click();
		
		//Logout 
		driver.findElementById("logout").click();
		
		//Close
		driver.quit();*/
		
	
	}
	
}
