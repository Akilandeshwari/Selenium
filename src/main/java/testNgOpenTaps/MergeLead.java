package testNgOpenTaps;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MergeLead extends TestWrapper {
	@Test(enabled = false, description = "Merged Lead", groups = "sanity", dependsOnGroups = "smoke")
	public void MergeLeads() {
		clickByLinkText("Create Lead");
		clickByLinkText("Merge Leads");
		enterTextById("ComboBox_partyIdFrom", "10008");
		enterTextById("ComboBox_partyIdTo", "10009");
		clickByLinkText("Merge");
		acceptAlert();
	}

	@AfterMethod
	public void VerifyMergedLead() {
		getText("viewLead_companyName_sp");
	}
}
