package dataDrivinTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInSpecificRowCell {

	public static void main(String[] args) throws IOException {
		
		
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+ "\\testData\\SpecificData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet= workbook.createSheet("SpecificData");
		
		XSSFRow row = sheet.createRow(3);
		
		XSSFCell cell= row.createCell(4);
		
		cell.setCellValue("Kushal Verma");
		
		
		workbook.close();
		file.close();
		
		System.out.println("File is created.......");
		
		
		

	}

}
