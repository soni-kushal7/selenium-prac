package Dropdown_Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws IOException {
		
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://automationwithpiyush.vercel.app/dropdown.html");
		
		
	
		WebElement multiDD = driver.findElement(By.id("multi-select"));
		
		Select selMulti = new Select(multiDD);
		
		selMulti.selectByVisibleText("Playwright Automation");
		selMulti.selectByVisibleText("Selenium WebDriver");
		selMulti.selectByVisibleText("Jenkins CI/CD");
		
		
		List <WebElement> allOption = selMulti.getAllSelectedOptions();
		
		for(WebElement allOptions:allOption) {
			
		    String getText = allOptions.getText();
		    
		    System.out.println(getText);
		
		}
		
		
	}

}
