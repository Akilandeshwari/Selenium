package week4;

import java.io.IOException;

import org.junit.Test;

public class MergeContact extends Wrapper {
	@Test
	public void MergeContacts() throws IOException {
		launchApplication("chrome", "http://demo1.opentaps.org/opentaps/control/main");
		enterTextById("username", "DemoSalesManager");
		enterTextById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLinkText("CRM/SFA");
		clickByLinkText("Create Contact");
		clickByLinkText("Merge Contacts");
		enterTextById("ComboBox_partyIdFrom","10002");
		enterTextById("ComboBox_partyIdTo","10010");
		clickByLinkText("Merge");
		acceptAlert();
		
	}

}
