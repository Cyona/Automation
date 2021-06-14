package Filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteToExcelusingList {
	@Test
	public void writeTest() throws IOException  {
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("employee");
	
		ArrayList<Object[]> empdata=new ArrayList<Object[]>();
		
		empdata.add(new Object[] {"Cyona","TSE","30k"});
		empdata.add(new Object[] {"Steve","TSE","40k"});

		
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
