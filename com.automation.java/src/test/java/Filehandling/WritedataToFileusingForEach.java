package Filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WritedataToFileusingForEach {
	@Test
	public void writeTest() throws IOException  {
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("employee");
		Object empdata[][]=new Object[3][3];
		empdata[0][0]="Name";
		empdata[0][1]="Designation";
		empdata[0][2]="Salary";
		
		empdata[1][0]="Cyona";
		empdata[1][1]="TSE";
		empdata[1][2]="30000";

		empdata[2][0]="Steve";
		empdata[2][1]="SE";
		empdata[2][2]="50000";
	
		int rows=empdata.length;
		int cols=empdata[0].length;
		System.out.println("No of rows: "+rows+ "No of cols: "+cols);
		int rowCount=0;
		for(Object emprow[]:empdata ) {
			XSSFRow row=sheet.createRow(rowCount++);
			int colCount=0;

			for(Object value:emprow) {
				XSSFCell cell=row.createCell(colCount++);
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		String path = System.getProperty("user.dir") + "\\Files\\Book.xlsx";

		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		fos.close();
		System.out.println("Data is written to excel successfully");
		
	}
}
