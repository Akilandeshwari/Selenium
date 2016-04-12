package week2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NumberOfDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sets the property
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

				// Launch chrome
				ChromeDriver driver = new ChromeDriver();

				// To maximize the window
				driver.manage().window().maximize();

				// Implicitly wait
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

				// Launch URL
				driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
				
				Select sel = new Select(driver.findElementByTagName("select"));

				List<WebElement> dropdown = sel.getOptions();
				System.out.println("Number of dropdown fields" + dropdown.size());
				
	}

}
