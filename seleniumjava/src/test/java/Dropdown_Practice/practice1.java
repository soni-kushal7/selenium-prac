package Dropdown_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://automationwithpiyush.vercel.app/dropdown.html");
		
		WebElement doseDD= driver.findElement(By.id("multi-select"));
		
		Select selDD = new Select(doseDD);
		
		selDD.selectByVisibleText("Selenium WebDriver");
		selDD.selectByVisibleText("RestAssured API");
		selDD.selectByVisibleText("Docker Container");
		
		
		List<WebElement> allOptions= selDD.getAllSelectedOptions();
		
		for(WebElement options :allOptions) {
			
			String getText = options.getText();
			System.out.println(getText);
			
		}
		

	}

}
