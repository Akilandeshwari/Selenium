package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class PopupTest {

	public static void main(String[] args) {
		// sets the property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch Chrome
		ChromeDriver driver = new ChromeDriver();

		// To maximize the window
		driver.manage().window().maximize();

		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch Popuptest
		driver.get("http://popuptest.com/");

		// click Multi-PopUp Test #2
		driver.findElementByLinkText("Multi-PopUp Test #2").click();

		String parentwindow = driver.getWindowHandle();

		for (String eachwindow : driver.getWindowHandles()) {
			if (!eachwindow.equals(parentwindow)) {
				driver.switchTo().window(eachwindow);
				driver.close();
			}
		}
		driver.switchTo().window(parentwindow);
		//prints the title
		System.out.println("Title of parent Window is: " + driver.getTitle());

	}

}
