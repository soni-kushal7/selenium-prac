package dataDrivinTesting;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcel {

	
	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+ "\\testData\\writingDynamic4.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("DynamicDataSheet");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many rows?");
		int noOfrows = sc.nextInt();
		
		System.out.println("Enter how many cells?");
		int noofCells = sc.nextInt();
		
	    // Consume leftover newline after integers
        sc.nextLine();

        // Take data row-wise
        for (int r = 0; r < noOfrows; r++) {
            XSSFRow currentRow = sheet.createRow(r);
            System.out.println("Enter data for row " + (r + 1) + ":");

            for (int c = 0; c < noofCells; c++) {
                System.out.print("Enter value for cell " + (c + 1) + ": ");
                String value = sc.nextLine(); // read full cell value (including spaces)
                XSSFCell cell = currentRow.createCell(c);
                cell.setCellValue(value);
            }
        }
		
//		 sc.nextLine();
//		
//		for(int r=0; r<=noOfrows; r++) {
//			
//			XSSFRow currentRow=sheet.createRow(r);
//			
//			for(int c=0; c<noofCells; c++) {
//				
//				XSSFCell cell =currentRow.createCell(c);
//				cell.setCellValue(sc.next());
//				
//				
//			}	
//			
//		}
//	
		
 		workbook.write(file);
 		workbook.close();
 		file.close();
		
		System.out.println("File is created.......");
		
		
		
	}

}
