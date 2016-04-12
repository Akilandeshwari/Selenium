package week3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		// sets the property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch chrome
		ChromeDriver driver = new ChromeDriver();

		// To maximize the window
		driver.manage().window().maximize();

		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Enter the URL
		driver.get("http://www.amazon.in/");

		FileInputStream fis = new FileInputStream(new File("./data/Amazon.xlsx"));

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(0);

		XSSFRow row = sheet.getRow(2);

		// String s = row.getCell(0).getStringCellValue();

		String m = row.getCell(0).getStringCellValue();
		driver.findElementByXPath("//input[@id='twotabsearchtextbox']").sendKeys(m, Keys.ENTER);

		String val = row.getCell(1).getStringCellValue();
		// System.out.println(driver.findElementByXPath("(//h2[@class='a-size-medium
		// a-color-null s-inline s-access-title
		// a-text-normal'])["+val+"]").getText());

		System.out.println(driver
				.findElementByXPath(
						"(//h2[@class='a-size-base a-color-null s-inline  s-access-title a-text-normal'])[" + val + "]")
				.getText());
	}

}
