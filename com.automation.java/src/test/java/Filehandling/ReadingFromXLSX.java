package Filehandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingFromXLSX {

	public static void main(String[] args) throws IOException {

		String path = System.getProperty("user.dir") + "\\Files\\Book.xlsx";
		System.out.println(path);
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowcount = sheet.getLastRowNum(); // returns row count
		int colcount = sheet.getRow(0).getLastCellNum(); // returns col count
		System.out.println(rowcount);
		System.out.println(colcount);

		for (int i = 0; i <=rowcount; i++) {

			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colcount; j++) {
				String cell = row.getCell(j).toString();
				System.out.print(" "+cell);
			}
			System.out.println(" \t");

		}

	}

}
