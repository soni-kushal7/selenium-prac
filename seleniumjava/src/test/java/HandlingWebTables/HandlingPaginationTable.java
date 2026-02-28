package HandlingWebTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		
		
//int rows = driver.findElements(By.xpath("//table[@id= 'productTable']//tbody//tr")).size();
//int columns = driver.findElements(By.xpath("//table[@id= 'productTable']//tr[1]//th")).size();
		
		
// First we have to fetch total no of pages
		
	    int totalPages = driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
        totalPages++;
        
// Then we have to click on each page 	   
	    int count=1;
	    for (int p=1; p<totalPages; p++) {
	    	
	    	if(p>=1) {
	    		
	    	WebElement	activePage = driver.findElement(By.xpath("//ul[@id='pagination']//*[text()="+p+"]"));
	    	Thread.sleep(3000);
	    	activePage.click();
	 
	    		
	    	}
	    	
	    	
//After click on page ---Read the data 
	    	
	    	int rows = driver.findElements(By.xpath("//table[@id= 'productTable']//tbody//tr")).size();
	    	
	    	
	    	for(int r=1;r<=rows;r++) {
	    		
	    	String  name= driver.findElement(By.xpath("//table[@id= 'productTable']//tbody//tr["+r+"]//td[2]")).getText();
	    		 
	    	String price =driver.findElement(By.xpath("//table[@id= 'productTable']//tbody//tr["+r+"]//td[3]")).getText();
	    	
	    	
// IF block is optional if you want to click on particular checkbox otherwise skip the if block
	    	
	    	if(name.equals("Laptop") || name.equals("Bluetooth Speaker") || name.equals("Router") ||name.equals("Streaming Device")) {
	    	
	    	driver.findElement(By.xpath("//table[@id= 'productTable']//tbody//tr["+r+"]//td[4]//input[@type='checkbox']")).click();
	    	
	    	System.out.println("S. No.--> "+count+"---"+name + " "+ price);
	    		
	    	count++;
	    	}
	    	
	    	}
	    	
	    	
	    }
		
		
	
	}

}
