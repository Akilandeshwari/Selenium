package week2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindMultipleElements {

	public static void main(String[] args) {
		// sets the property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch chrome
		ChromeDriver driver = new ChromeDriver();

		// To maximize the window
		driver.manage().window().maximize();

		// Launch Google

		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=pBr2VvCXF8-L8Qet14GgBA&gws_rd=ssl");

		// implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Total number of links
		List<WebElement> n = driver.findElementsByTagName("a");

		System.out.println("Total links: " + n.size());

		for (WebElement link : n) {
			if (link.getText().contains("c") && link.getLocation().getX() > 50 && link.getSize().getWidth() > 20) {
				link.click();
				System.out.println(driver.getTitle());
				break;
			}
		}
	}
}
