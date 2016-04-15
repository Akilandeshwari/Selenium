package week4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	@Test
	public void ErailExcel() throws IOException, Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("http://erail.in/");
		driver.findElement(By.id("txtStationFrom")).clear();

		driver.findElement(By.id("txtStationFrom")).sendKeys("TPJ", Keys.TAB, Keys.TAB);
		driver.findElement(By.id("txtStationTo")).sendKeys("MS", Keys.ENTER);
		WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList']/tbody"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("Test");

		for (int rownum = 0; rownum < rows.size(); rownum++) {
			XSSFRow r = sh.createRow(rownum);
			List<WebElement> columns = rows.get(rownum).findElements(By.tagName("td"));
			System.out.println("");
			for (int colnum = 0; colnum < columns.size(); colnum++) {
				sh.getRow(rownum).createCell(colnum).setCellValue(columns.get(colnum).getText());
			}
		}
		FileOutputStream fo = new FileOutputStream(new File("D:\\Excel\\ExcelErail.xlsx"));
		wb.write(fo);
		wb.close();
	}
}
