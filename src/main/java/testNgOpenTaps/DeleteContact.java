package testNgOpenTaps;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DeleteContact extends TestWrapper {

	@Test(description="Delete Contact", groups="sanity", dependsOnGroups="smoke")
	public void DeleteContacts() {
		clickByLinkText("Create Contact");
		clickByLinkText("Find Contacts");
		enterTextByXpath("(//input[@name='firstName'])[3] ","AAA");
		clickByLinkText("Find Contacts");
		clickByXpath("(//button[@class='x-btn-text'])[7]");
		clickByLinkText("10004");
		clickByLinkText("Deactivate Contact");
		acceptAlert();
		}

	@AfterMethod
	public void VerifyDeletedContact() {
		System.out.println("Verified deleted Contact");
	}

}
