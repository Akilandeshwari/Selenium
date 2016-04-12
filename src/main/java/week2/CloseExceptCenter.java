package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseExceptCenter {

	public static void main(String[] args) {
		// sets the property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch chrome
		ChromeDriver driver = new ChromeDriver();

		// To maximize the window
		driver.manage().window().maximize();

		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// Launch URL
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		
		// Close West
		driver.findElementByXPath("/html/body/div[1]/p[1]/button").click();

		// Close East
		driver.findElementByXPath("/html/body/div[2]/p/button").click();

		// Switch to frame
		driver.switchTo().frame(driver.findElementById("childIframe"));

		// Close Iframe West
		driver.findElementByXPath("/html/body/div[2]/p/button").click();

		// Close Iframe East
		driver.findElementByXPath("/html/body/div[3]/p/button").click();

		// Get out of frame
		driver.switchTo().defaultContent();

		// close the browser
		driver.close();
		
	}

}
