package Dropdown_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("file:///C:/Users/kushal_verma/eclipse-workspace/seleniumjava/src/test/java/Dropdown_Practice/DDHtml.html");
	
        
	     WebElement countryDD = driver.findElement(By.id("country"));
	     
	     Select selCountry = new Select(countryDD);
	   
	     
	     selCountry.selectByVisibleText("India");
	     
	     
	     
	    List<WebElement> selOption= selCountry.getAllSelectedOptions();
		
	    for(WebElement options:selOption) {
	    	
	    	String getText = options.getText();
	    	
	    	System.out.println(getText);
	    	
	    }
	    
	   List<WebElement> allOptions = selCountry.getOptions();
	   
	   for (WebElement options :allOptions) {
		   
		   String getText = options.getText();
		   
		   System.out.println(getText);
		   
	   }
	   
	   
	   
	   
	   
	   WebElement fruitDD = driver.findElement(By.id("fruits"));
	   
	   Select selFruit = new Select(fruitDD);
	   
	   selFruit.selectByVisibleText("Banana");
	   
	   selFruit.selectByVisibleText("grape");
	   
	   selFruit.selectByVisibleText("Pineapple");
	   
	   
	    
	    
		
		
		
		
		
		
		
		
		

	}

}
