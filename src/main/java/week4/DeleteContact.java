package week4;

import java.io.IOException;

import org.junit.Test;

public class DeleteContact extends Wrapper {
	@Test
	public void EditContacts() throws IOException {
		launchApplication("chrome", "http://demo1.opentaps.org/opentaps/control/main");
		enterTextById("username", "DemoSalesManager");
		enterTextById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLinkText("CRM/SFA");
		clickByLinkText("Create Contact");
		clickByLinkText("Find Contacts");
		enterTextByXpath("(//input[@name='firstName'])[3] ","CCC");
		clickByLinkText("Find Contacts");
		clickByXpath("(//button[@class='x-btn-text'])[7]");
		clickByLinkText("10013");
		clickByLinkText("Deactivate Contact");
		acceptAlert();
	}

}
