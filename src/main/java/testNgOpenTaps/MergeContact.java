package testNgOpenTaps;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MergeContact extends TestWrapper {
	@Test(description = "Merged Contact", groups = "sanity", dependsOnGroups = "smoke")
	public void MergeContacts() {
		clickByLinkText("Create Contact");
		clickByLinkText("Merge Contacts");
		enterTextById("ComboBox_partyIdFrom", "10010");
		enterTextById("ComboBox_partyIdTo", "10011");
		clickByLinkText("Merge");
		acceptAlert();
		System.out.println("Contact merged");
	}

	@AfterMethod
	public void VerifyMergedContact() {
		getText("viewLead_companyName_sp");
	}
}
