package week2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfFrames {

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
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");

		//List<WebElement> iframe = driver.findElementsByTagName("iframe");
		List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
		for (WebElement frameElement : iframe) {
			driver.switchTo().frame(frameElement);
			driver.switchTo().defaultContent();
		}

		/*int i = iframe.size();
		System.out.println(i);
		int j, k, m,n,y,z;
		driver.switchTo().defaultContent();

		driver.switchTo().frame(0);
		List<WebElement> a = driver.findElementsByTagName("iframe");
		m = a.size();
		System.out.println(m);
		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		List<WebElement> b = driver.findElementsByTagName("iframe");
		n = b.size();
		System.out.println(n);
		driver.switchTo().defaultContent();

		driver.switchTo().frame(2);
		List<WebElement> c = driver.findElementsByTagName("iframe");
		y= c.size();
		System.out.println(y);
		driver.switchTo().defaultContent();

		driver.switchTo().frame(3);
		List<WebElement> d = driver.findElementsByTagName("iframe");
		z = d.size();
		System.out.println(z);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(4);
		List<WebElement> e = driver.findElementsByTagName("iframe");
		j = e.size();
		System.out.println(j);
		driver.switchTo().defaultContent();

		k = i + j + m+n+y+z;
		System.out.println("Total number of frames are " + k);
		*/
		driver.close();

	}
}
