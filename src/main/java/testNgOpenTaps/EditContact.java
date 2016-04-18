package testNgOpenTaps;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class EditContact extends TestWrapper {

	@Test(description = "Edit Contact", groups = "sanity", dependsOnGroups = "smoke")
	public void EditContacts() throws IOException {
		clickByLinkText("Create Contact");
		clickByLinkText("Find Contacts");
		enterTextByXpath("(//input[@name='firstName'])[3] ", "Akila");
		clickByLinkText("Find Contacts");
		clickByXpath("(//button[@class='x-btn-text'])[7]");
		clickByLinkText("10006");
		clickByLinkText("Edit");
		selectByText("addMarketingCampaignForm_marketingCampaignId", "Catalog Generating Marketing Campaigns");
		clickByXpath("(//input[@name='submitButton'])[2]");
		clickByXpath("(//input[@name='submitButton'])[1]");
	}

	@AfterMethod
	public void VerifyEditedContact() {
		getText("viewContact_marketingCampaigns_sp");

	}

}
