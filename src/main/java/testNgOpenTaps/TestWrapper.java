package testNgOpenTaps;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestWrapper extends Wrapper {
	@BeforeClass(groups = {"smoke", "sanity"})
	public void LaunchBrowser() {
		launchApplication("chrome", "http://demo1.opentaps.org/opentaps/control/main");
	}

	@AfterClass(alwaysRun = true, groups = {"smoke", "sanity"})
	public void CloseBrowser() {
		closeBrowser();
		System.out.println("Browser closed");
	}

	@BeforeMethod(groups = {"smoke", "sanity"})
	public void LoginAndClickCrm() {
		enterTextById("username", "DemoSalesManager");
		enterTextById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLinkText("CRM/SFA");
	}
}
