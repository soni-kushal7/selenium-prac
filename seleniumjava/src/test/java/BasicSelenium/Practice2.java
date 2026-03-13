package BasicSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice2 {

	public static void main(String[] args) throws IOException {
		
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://automationwithpiyush.vercel.app/surrounding.html");
		
//		WebElement radioButton = driver.findElement(By.xpath("//label[text()= 'Proficient']/..//input"));
//		
//		radioButton.click();
//		
//		WebElement castButton = driver.findElement(By.xpath("//button[contains(text(),'Cast Vote')]"));
//		castButton.click();
//		
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
//		WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("success-msg")));
//		String getMsg =successMessage.getText();
//		System.out.println(getMsg);
	
		
	WebElement radioBytton= driver.findElement(By.xpath("//label[text()='Expert']/..//input[@id='expert_radio']"));	
	radioBytton.click();
	
	WebElement castButton =driver.findElement(By.xpath("//button[contains(text(),'Cast Vote')]"));
	castButton.click();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("success-msg")));
	String getText = successMessage.getText();	
    System.out.println(getText);
    
    
    Actions act = new Actions(driver);
    act.scrollByAmount(0, 300).build().perform();
    
    if (!getText.isEmpty()) {
    	
    	TakesScreenshot tks = (TakesScreenshot)driver;
    	
    	File source = tks.getScreenshotAs(OutputType.FILE);
    	
    	String relPath= "./errorshots/dummy.png";
    	
    	File destination = new File (relPath);
    	
    	FileHandler.copy(source, destination);
    	
    	 System.out.println("📸 Screenshot saved successfully at: " + destination.getAbsolutePath());
    	
    }else {
    		
    	 System.out.println("❌ No success message found, screenshot not captured.");
    }
    
    
    
    
    
        
		

		
		
		
		
//		TakesScreenshot tks =(TakesScreenshot) driver;
//		File source = tks.getScreenshotAs(OutputType.FILE);
//		
//		String relPath = "./errorshots/dummy.png";
//		
//		File destination = new File(relPath);
//		
//		FileHandler.copy(source, destination);		
		
		

	}

}
