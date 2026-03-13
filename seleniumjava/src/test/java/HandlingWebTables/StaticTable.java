package HandlingWebTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
//1. count no. of rows in a table
		
		int rows = driver.findElements(By.xpath("//table[@name= 'BookTable']//tr")).size();
		System.out.println("Total No. of Rows in a table : " + rows);
		
//2. count no. of column in a table		
		int columns = driver.findElements(By.xpath("//table[@name= 'BookTable']//tr//th")).size();
		System.out.println("Total No. of Columns in a table : "+ columns);
		
//3. read data from specific row and column....
		
		String  bookName = driver.findElement(By.xpath("//table[@name= 'BookTable']//tr[5]//td[1]")).getText();
		System.out.println("Book Name is : - " +bookName);
		
		String author = driver.findElement(By.xpath("//table[@name= 'BookTable']//tr[4]//td[2]")).getText();
		System.out.println("Author is : - "+ author);
		
//4. Read data from all the rows and column
		
	/*	
		for (int r=2; r<=rows; r++) {
			
			for(int c=1; c<=columns; c++) {
				
				
				String value = driver.findElement(By.xpath("//table[@name= 'BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(value+ "\t");
				
			}
			System.out.println();
			
		}
		
*/
		
		
//5. Print book name whose author is mukesh.
		
		
		for (int r=2; r<=rows;r++) {
			
			String authorName = driver.findElement(By.xpath("//table[@name= 'BookTable']//tr["+r+"]//td[2]")).getText();

			if(authorName.equals("Amit")) {
				
				String bookname = driver.findElement(By.xpath("//table[@name= 'BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookname);
				
			}
			
		}
		
	
//6. find total price of all the books
		
		
		int total =0;
		for(int r=2; r<=rows;r++) {
			
				String bookPrice =driver.findElement(By.xpath("//table[@name= 'BookTable']//tr["+r+"]//td[4]")).getText();
				
				total= total + Integer.parseInt(bookPrice);
				
		}
		System.out.println(total);
		
	}

}
