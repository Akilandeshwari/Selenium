package week4;

import java.io.IOException;

import org.junit.Test;

public class EditContact extends Wrapper {
	@Test
	public void EditContacts() throws IOException {
		launchApplication("chrome", "http://demo1.opentaps.org/opentaps/control/main");
		enterTextById("username", "DemoSalesManager");
		enterTextById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLinkText("CRM/SFA");
		clickByLinkText("Create Contact");
		clickByLinkText("Find Contacts");
		enterTextByXpath("(//input[@name='firstName'])[3] ","Akila");
		clickByLinkText("Find Contacts");
		clickByXpath("(//button[@class='x-btn-text'])[7]");
		clickByLinkText("10002");
		clickByLinkText("Edit");
		selectByText("addMarketingCampaignForm_marketingCampaignId", "Catalog Generating Marketing Campaigns");
		clickByXpath("(//input[@name='submitButton'])[2]");
		clickByXpath("(//input[@name='submitButton'])[1]");
		verifyText("viewContact_marketingCampaigns_sp","Catalog Generating Marketing Campaigns");
		

	}
}
