package Filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataUsingSwitch {

	//@Test
	public void readData() throws IOException {
		String path = System.getProperty("user.dir") + "\\Files\\login_credentials.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int row = sheet.getLastRowNum();
		int col = sheet.getRow(0).getLastCellNum();
		for (int i = 0; i <= row; i++) {
			XSSFRow rows = sheet.getRow(i);
			for (int j = 0; j < col; j++) {
				XSSFCell cell = rows.getCell(j);
				{
					switch (cell.getCellType()) {
					case STRING:
						System.out.print(cell.getStringCellValue());
						break;
					case NUMERIC:
						System.out.print(cell.getNumericCellValue());
						break;
					case BOOLEAN:
						System.out.print(cell.getBooleanCellValue());
						break;

					}
					System.out.print(" ");
				}
			}
			wb.close();
			fis.close();
		}
	}
	@Test
	public void readDataUsingIterator() throws IOException {
		String path = System.getProperty("user.dir") + "\\Files\\login_credentials.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		Iterator rowitr=sheet.iterator();
		while(rowitr.hasNext()){
			XSSFRow row=(XSSFRow) rowitr.next();
			Iterator cellitr=row.cellIterator();
			while(cellitr.hasNext()){
				XSSFCell cell=(XSSFCell) cellitr.next();
				{
					switch (cell.getCellType()) {
					case STRING:
						System.out.print(cell.getStringCellValue());
						break;
					case NUMERIC:
						System.out.print(cell.getNumericCellValue());
						break;
					case BOOLEAN:
						System.out.print(cell.getBooleanCellValue());
						break;

					}
					System.out.print(" ");
				}
			}
			wb.close();
			fis.close();
		}
	}
}
