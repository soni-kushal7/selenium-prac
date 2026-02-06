package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterPractice {

	public static void main(String[] args) {
		
		//nowara
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://automationwithpiyush.vercel.app/js-executor.html");
		//driver.get("https://automationwithpiyush.vercel.app/locators.html");
		
		
//		WebElement inputBox =driver.findElement(By.id("email"));	
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].value = 'kushal';",inputBox);
		
		
		WebElement checkBox = driver.findElement(By.id("terms-checkbox"));
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].click()",checkBox);
		
		

	}

}
