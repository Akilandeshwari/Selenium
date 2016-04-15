package week4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrapper {

	public void createWorkbook(String filepath, String sheetname) throws IOException {
		FileInputStream fis = new FileInputStream(new File(filepath));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetname);
	}

	public void getNumberOfRows(String filepath, String sheetname) throws IOException {
		FileInputStream fis = new FileInputStream(new File(filepath));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetname);
		int noofrows = sheet.getLastRowNum();
		System.out.println("Total number of rows are: " + noofrows);
	}

	public void getCellValue(String filepath, String sheetname, int rowno, int colno) throws IOException {
		FileInputStream fis = new FileInputStream(new File(filepath));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String cellValue = wb.getSheet(sheetname).getRow(rowno).getCell(colno).getStringCellValue();
	}

	public void writeData(String path, String sheetname, int rowno, int colno, String data) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.getSheet(sheetname);
		XSSFRow r = sh.createRow(rowno);
		sh.getRow(rowno).createCell(colno).setCellValue(data);

		FileOutputStream fo = new FileOutputStream(new File(path));
		wb.write(fo);
		wb.close();
	}

	public void closeWorkbook(String filepath) throws IOException {
		FileInputStream fis = new FileInputStream(new File(filepath));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		wb.close();
	}
}
