package testNgOpenTaps;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CreateLead extends TestWrapper {
	@Test(description = "Created Lead", groups = "smoke")
	public void CreateLeads() throws IOException {
		clickByLinkText("Create Lead");
		// driver.findElement(By.linkText("Create Lead")).click();
		enterTextById("createLeadForm_companyName", "TCS");
		enterTextById("createLeadForm_firstName", "Akila");
		enterTextById("createLeadForm_lastName", "Akilmurali");
		selectByText("createLeadForm_dataSourceId", "Direct Mail");
		selectByText("createLeadForm_marketingCampaignId", "Affiliate Sites");
		enterTextById("createLeadForm_primaryEmail", "akila.a@gmail.com");
		enterTextById("createLeadForm_primaryPhoneNumber", "7871552414");
		clickByName("submitButton");
	}

	@AfterMethod
	public void VerifycreatedLead() {
		getText("viewLead_companyName_sp");
	}
}
