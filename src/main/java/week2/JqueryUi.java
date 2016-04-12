package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryUi {

	public static void main(String[] args) {
		// sets the property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch chrome
		ChromeDriver driver = new ChromeDriver();

		// To maximize the window
		driver.manage().window().maximize();

		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch jqueryui
		driver.get("http://jqueryui.com/");

		// click dragabble
		driver.findElementByLinkText("Draggable").click();

		// Switches to frame
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));

		// print the content of draggable
		WebElement content = driver.findElementByXPath("//*[@id='draggable']");
		System.out.println(content.getText());

		// Comes out of frame
		driver.switchTo().defaultContent();

		// Click on droppable
		driver.findElementByLinkText("Droppable").click();
		
		// close the browser
		driver.close();
	}

}
