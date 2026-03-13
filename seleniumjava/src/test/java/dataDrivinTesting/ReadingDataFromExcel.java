package dataDrivinTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		// Excel File----Workbook---Steet---rows----cell
			
		
		
		FileInputStream file1 = new FileInputStream(System.getProperty("user.dir")+ "\\testData\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file1);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int totalRows = sheet.getLastRowNum();
		
		int totalCells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total rows" + totalRows);
		
		System.out.println("Total Cell " +totalCells);
		
		for(int r=0; r<=totalRows; r++) {
			
			XSSFRow currentRow = sheet.getRow(r);
			
			for(int c=0; c<totalCells; c++) {
				
				XSSFCell cell = currentRow.getCell(c);
				
				System.out.printf("| %-20s", cell.toString());
				
			}
			
			System.out.println("|");
			System.out.println("-----------------------------------------------------------------------------------------");
		}
		
		
		
		workbook.close();
	    file1.close();		
		
		
		
		
		
//		
//		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ "\\testData\\data.xlsx");
//		
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
//		
//		XSSFSheet sheet = workbook.getSheet("Sheet1");
//		
//		int totalRows =sheet.getLastRowNum();
//		
//		int totalCells = sheet.getRow(1).getLastCellNum();
//		
//		System.out.println("Total rows are:- "+ totalRows);
//		System.out.println("Total cells are:- "+totalCells);
//		
//		
//		for(int r=0; r<=totalRows; r++) {
//			
//			XSSFRow currentRow = sheet.getRow(r);
//			
//			for(int c=0; c<totalCells; c++) {
//				
//				XSSFCell cell = currentRow.getCell(c);
//				
//				System.out.printf("| %-20s",cell.toString());
//				
//			}
//			
//			System.out.println("|");
//            System.out.println("-----------------------------------------------------------");
//			
//		}
		
		
//		workbook.close();
//		file.close();
//		
		
		
//			XSSFWorkbook workbook = new XSSFWorkbook(file);
//			
//			XSSFSheet sheet = 	workbook.getSheet("Sheet1");
//			
//			int totalRows = sheet.getLastRowNum();
//			
//			int totalCells = sheet.getRow(1).getLastCellNum();
//			
//			System.out.println("Total No. of Rows :- "+totalRows);
//			System.out.println("Total No. of Cells :- "+totalCells);
//			
//			
//			for(int r=0; r<=totalRows; r++) {
//				
//				XSSFRow currentRow= sheet.getRow(r);
//				
//				for(int c=0; c<totalCells; c++) {
//					
//					XSSFCell cell = currentRow.getCell(c);
//					System.out.printf("| %-20s", cell.toString());			
//					
//				}
//				
//				System.out.println("|");
//	            System.out.println("-----------------------------------------------------------");
//				
//			}
//			
//			
//			workbook.close();
//			file.close();
//			
//			 System.out.println("\n✅ Data read successfully!");
//			

	}

}
