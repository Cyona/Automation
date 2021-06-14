package Filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Readfiledata {

	@Test
	public void readData() throws IOException {
		String path = System.getProperty("user.dir") + "\\Files\\login_credentials.xlsx";
		System.out.println(path);
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);

		int rowcount = sheet.getLastRowNum(); // returns row count
		int colcount = sheet.getRow(0).getLastCellNum(); // returns col count
		System.out.println(rowcount);
		System.out.println(colcount);
	
		String user=sheet.getRow(1).getCell(0).getStringCellValue();
		String passwrd=sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(user);
		System.out.println(passwrd);

		
	}

}
