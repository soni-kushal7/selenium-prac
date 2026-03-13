package Assignment_18Jan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_waits {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		
		driver.get("https://automationwithpiyush.vercel.app/synchronization.html");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
	WebElement addButton = driver.findElement(By.xpath("//button[@id='add']"));
	
	addButton.click();
	
    WebElement removeButton =	driver.findElement(By.xpath("//button[@id='remove']"));
	
	removeButton.click();
		
		
		
	   WebElement box1 = driver.findElement(By.xpath("//button[@id='trigger1']"));	    
	   box1.click();
	   
	   WebElement inputText= driver.findElement(By.xpath("//input[@id='target-1']"));	    
	   WebDriverWait wait1 = new WebDriverWait (driver, Duration.ofSeconds(15));
	   wait1.until(ExpectedConditions.elementToBeClickable(inputText));	    
	   inputText.sendKeys("Kushal");
	    
	    
	   
	   
	   WebElement box2 = driver.findElement(By.xpath("//button[@id='trigger2']"));	    
	   box2.click();
	   
	   WebElement inputText2= driver.findElement(By.xpath("//input[@id='target-2']"));	    
	   WebDriverWait wait2 = new WebDriverWait (driver, Duration.ofSeconds(15));
	   wait2.until(ExpectedConditions.elementToBeClickable(inputText2));	    
	   inputText2.sendKeys("Verma");
		

	}

}
