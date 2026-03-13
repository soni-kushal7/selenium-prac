package Synchronization_Waits_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Prectice {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///C:/Users/kushal_verma/eclipse-workspace/seleniumjava/src/test/java/Synchronization_Waits_Practice/DynamicControlsPracticeHtml.html");
		 
		WebElement enableButton = driver.findElement(By.xpath("//button[text()='Enable Input']"));
	    enableButton.click();

//To ptint Input field enabled!	    
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()= 'Input field enabled!']")));
	    
	    
	    String message =text.getText();	    
	    System.out.println(message);
	    	    
	    
	    WebElement inputText= driver.findElement(By.xpath("//input[@id= 'dynamicInput']"));	    
	    WebDriverWait wait1 = new WebDriverWait (driver, Duration.ofSeconds(15));
	    wait1.until(ExpectedConditions.elementToBeClickable(inputText));	    
	    inputText.sendKeys("Kushal");
	    
	    
	    WebElement disableButton = driver.findElement(By.xpath("//button[@id= 'toggleInput']"));
	    disableButton.click();
	    
	 
	    
	    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(15));	    
	    WebElement text2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()= 'Input field disabled!']")));	    
	    String getMessage = text2.getText();	    
	    System.out.println(getMessage);
	    
	    
	    
	    
	    

	}

}
