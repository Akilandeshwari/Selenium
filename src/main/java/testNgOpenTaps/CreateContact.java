package testNgOpenTaps;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CreateContact extends TestWrapper {
	@Test(description = "Created Contact", groups = "smoke")
	public void CreateContacts() throws IOException {
		clickByLinkText("Create Contact");
		enterTextById("firstNameField", "Akila");
		enterTextById("lastNameField", "A");
		clickByName("submitButton");
		System.out.println("Contact created");
	}

	@AfterMethod
	public void VerifyCreatedContact() {
		getText("viewContact_fullName_sp");
	}
}