package PracticeSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceCheckBox {
	
	
	public void clickOnCheckbox(WebDriver driver) {
		
		WebElement ckBox1 =driver.findElement(By.id("cb1"));
		ckBox1.click();
		
	}
	
	
	public static void selectAll(WebDriver driver) {
		
		WebElement selectAll= driver.findElement(By.xpath("//button[text() = 'SELECT ALL']"));
		selectAll.click();
		
	}
	

	public static void main(String[] args) {
		
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationwithkushal.vercel.app/");
		
/*		
		 // non static mectod
        practiceCheckBox obj = new practiceCheckBox();  // ✅ Create object
        obj.clickOnCheckbox(driver);     // ✅ Call method
*/
        //static method
        practiceCheckBox.selectAll(driver);
        
        
        

	}

}
