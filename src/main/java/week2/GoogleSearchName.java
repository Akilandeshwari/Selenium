package week2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchName {

	public static void main(String[] args) throws Exception {
		String str = "selenium";
		// sets the property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch chrome
		ChromeDriver driver = new ChromeDriver();

		// To maximize the window
		driver.manage().window().maximize();

		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch Google
		driver.get("https://www.google.co.in");

		// Type name in google
		driver.findElementById("lst-ib").sendKeys(str, Keys.ENTER);
		
		Thread.sleep(10000);

		List<WebElement> n = driver.findElementsByTagName("a");
		
		int i = 0;
		for (WebElement element : n) {

			if (element.getText().contains(str.toUpperCase())
					|| element.getText().contains(str.toLowerCase()) && element.getText().contains(str)
							&& element.getLocation().getX() > 100 && element.getText().length() > 20) {
				System.out.println(element.getText());
				System.out.println();
				i++;

			}

		}
		
		// print the total number of links
		System.out.println("Total number of links: " + i);
		
		// close the browser
		driver.close();
	}
	 
}
