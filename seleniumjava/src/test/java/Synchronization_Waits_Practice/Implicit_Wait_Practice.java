package Synchronization_Waits_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait_Practice {

	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///C:/Users/kushal_verma/eclipse-workspace/seleniumjava/src/test/java/Synchronization_Waits_Practice/DynamicControlsPracticeHtml.html");
		
		WebElement clickCheckBox = driver.findElement(By.xpath("//input[@id='dynamicCheckbox']"));
		clickCheckBox.click();
		
		WebElement removeCheckBox = driver.findElement(By.xpath("//button[text()='Remove Checkbox']"));
		removeCheckBox.click();
		
		
		WebElement textRemoved = driver.findElement(By.xpath("//p[text() ='Checkbox removed!']"));		
        String getText = textRemoved.getText();         
        System.out.println(getText);
        
        
        WebElement addCheckBox = driver.findElement(By.xpath("//button[text()= 'Add Checkbox']"));
        addCheckBox.click();
        
        WebElement textAdded =driver.findElement(By.xpath("//p[text()= 'Checkbox added!']"));
        String getTextAdded = textAdded.getText();
        System.out.println(getTextAdded);
        
        WebElement clickCheckBox1 = driver.findElement(By.xpath("//input[@id= 'dynamicCheckbox']"));
        clickCheckBox1.click();
        
        WebElement removeCheckBox1=  driver.findElement(By.xpath("//button[text()= 'Remove Checkbox']"));
        removeCheckBox1.click();
        
        
        
	}

}
