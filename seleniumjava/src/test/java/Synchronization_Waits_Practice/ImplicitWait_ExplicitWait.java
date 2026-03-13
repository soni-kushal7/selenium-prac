package Synchronization_Waits_Practice;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait_ExplicitWait {

	private static final Function ExpetedConditions = null;

	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
		driver.findElement(By.xpath("//button[text() = 'Remove']")).click();
		
// Implicit Wait.......	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement message = driver.findElement(By.xpath("//p[@id='message']"));
		
		String getMessage = message.getText();
		
		System.out.println(getMessage);
		
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		
		WebElement message1 = driver.findElement(By.xpath("//p[@id= 'message']"));
		
		String getMessage1 = message1.getText();
		
		System.out.println(getMessage1);
		
		driver.findElement(By.xpath("//input[@id='checkbox']")).click();
		
	
//Explicit wait.....
		
		WebElement enable= driver.findElement(By.xpath("//button[text()= 'Enable']"));
		enable.click();
		
		WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
		
//		make this input clickable...
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		wait.until(ExpectedConditions.elementToBeClickable(input));
		
		input.sendKeys("1232123");
		
		WebElement disable= driver.findElement(By.xpath("//button[text()='Disable']"));
		disable.click();
		
		
		
		
		
		
		

	}

}
