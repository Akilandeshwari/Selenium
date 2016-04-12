package week2;

import org.junit.Test;

public class CreateLead extends Wrapper{
	@Test
	public void CreateLeads() {
		launchApplication("chrome","http://demo1.opentaps.org/opentaps/control/main" );
		enterTextById("username", "DemoSalesManager");
		enterTextById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLinkText("CRM/SFA");
		clickByLinkText("Create Lead");
		enterTextById("createLeadForm_companyName", "TCS");
		enterTextById("createLeadForm_firstName", "Akila");
		enterTextById("createLeadForm_lastName", "AM");
		clickByName("submitButton");
		closeBrowser();
	}
}
