package week3;

import org.junit.Test;

public class CreateContact extends Wrapper {
	@Test
	public void CreateContacts() {
		launchApplication("firefox", "http://demo1.opentaps.org/opentaps/control/main");
		enterTextById("username", "DemoSalesManager");
		enterTextById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLinkText("CRM/SFA");
		clickByLinkText("Create Contact");
		enterTextById("firstNameField", "Akila");
		enterTextById("lastNameField", "AM");
		clickByName("submitButton");
		closeBrowser();
	}
}