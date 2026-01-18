package LocatersPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {

	public static void main(String[] args) throws InterruptedException {

		
/*		
		
// There are 6 Direct locators---- 		
		
1. id()
2.name()
3.linkText()
4.partialLinkText()
5.className()
6.tagName()	
		
*/	
		
		
   
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
		 // Step 3: Find all links (<a> tags)
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        
        //System.out.println("links on page: " + allLinks);

        // Step 4: Count links
        int linkCount = allLinks.size();
		
        int serialNo = 1;
        for (WebElement link : allLinks) {
            System.out.println(serialNo + ". Link Text: " 
                + link.getText() 
                + " | URL: " 
                + link.getAttribute("href"));
            serialNo++;
        }
        
        
        // Step 5: Print count
        System.out.println("Total number of links on page: " + linkCount);
		
		
		//driver.findElement(By.id("email")).sendKeys("kushal");
		
		//driver.findElement(By.name("pass")).sendKeys("123456");
		
	    //WebElement link =driver.findElement(By.linkText("Forgotten password?"));
	    
	    //link.click();
	    
	    //driver.navigate().back();
		
	    //driver.findElement(By.partialLinkText("F")).click();
	    
	    //driver.findElement(By.className("_6lth")).click();
	    
	    //driver.findElement(By.tagName("button")).click();
	    
		
		
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
