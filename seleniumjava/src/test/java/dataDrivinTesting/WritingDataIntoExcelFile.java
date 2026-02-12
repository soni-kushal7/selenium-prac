package dataDrivinTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcelFile {

	public static void main(String[] args) throws IOException {
		
		
		
		// Excel File----Workbook---Steet---rows----cell		
		
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+ "\\testData\\writingData1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("DataSheet");
		
		XSSFRow row1 = sheet.createRow(0);
		     row1.createCell(0).setCellValue("Name");
		     row1.createCell(1).setCellValue("Designation");
		     row1.createCell(2).setCellValue("PhoneNo.");
		     row1.createCell(3).setCellValue("Address");
		     row1.createCell(4).setCellValue("Salary");
		
		
		XSSFRow row2 = sheet.createRow(1);     
		     
		     row2.createCell(0).setCellValue("Kushal");
		     row2.createCell(1).setCellValue("QA");
		     row2.createCell(2).setCellValue("9722311277");
		     row2.createCell(3).setCellValue("Noida");
		     row2.createCell(4).setCellValue("160000");
		     
		 XSSFRow row3 =sheet.createRow(2);    
		 
		 row3.createCell(0).setCellValue("Ankit");
		 row3.createCell(1).setCellValue("DEV");
		 row3.createCell(2).setCellValue("9722311277");
		 row3.createCell(3).setCellValue("Delhi");
		 row3.createCell(4).setCellValue("120000");
		 
		 workbook.write(file);
		 
		 workbook.close();
		 file.close();
		 
		 System.out.println("File is Created......");
		 
		 
		 
		 
		 
		 

	}

}
