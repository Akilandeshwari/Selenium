package week3;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenTapsApplication extends Wrapper {
	@Test
	public void OpenTaps() {
		launchApplication("chrome", "http://demo1.opentaps.org/opentaps/control/main");
		enterTextById("username", "DemoSalesManager");
		enterTextById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickById("logout");

	}

}
