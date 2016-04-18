package testNgOpenTaps;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DeleteLead extends TestWrapper {

	@Test(description="Delete Lead", groups="sanity"  , dependsOnGroups="smoke")
	public void DeleteLeads() {
		clickByLinkText("Create Lead");
		clickByLinkText("Find Leads");
		enterTextByXpath("(//input[@name='firstName'])[3] ", "AAA"); 
		clickByXpath("(//button[@class='x-btn-text'])[7]"); // find lead
		clickByLinkText("10005"); // click the link by lead id
		clickByLinkText("Delete");
		
	}

	@AfterMethod
	public void VerifyDeletedLead() {
		System.out.println("Verified deleted Lead");
	}

}
