package testNgOpenTaps;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class EditLead extends TestWrapper {

	@Test(description = "Edit Lead", groups = "sanity") // ,
														// dependsOnGroups="smoke")
	public void EditLeads() throws IOException {
		clickByLinkText("Create Lead");
		clickByLinkText("Find Leads");
		enterTextByXpath("(//input[@name='firstName'])[3] ", "Akil");
		clickByXpath("(//button[@class='x-btn-text'])[7]"); // find lead
		clickByLinkText("10007"); // click the link by lead id
		clickByLinkText("Edit");

		selectByText("addDataSourceForm_dataSourceId", "Employee");
		clickByXpath("(//input[@name='submitButton'])[2]"); // to add
		selectByText("addMarketingCampaignForm_marketingCampaignId", "Automobile");
		clickByXpath("(//input[@name='submitButton'])[3]"); // to add marketing
															// campaign
		clickByXpath("(//input[@name='submitButton'])[1]"); // to update the
															// leads
	}

	@AfterMethod
	public void VerifyEditedLead() {
		getText("viewLead_dataSources_sp");
		getText("viewLead_marketingCampaigns_sp");
	}

}
