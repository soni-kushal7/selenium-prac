package Dropdown_Practice;

import java.time.Duration;
import java.util.List;

import javax.annotation.processing.SupportedSourceVersion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://automationwithpiyush.vercel.app/dropdown.html");
		
		
		WebElement checkUpDD = driver.findElement(By.id("single-select"));
		
		Select selCheckup = new Select(checkUpDD);
		selCheckup.selectByVisibleText("New York, USA");
		
		List<WebElement> allOption =selCheckup.getAllSelectedOptions();
		
		for(WebElement options:allOption) {
			
			String getText =options.getText();
			
			System.out.println(getText);
			
			
		}
		
	}

}
