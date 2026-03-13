package BasicSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractice {

	public static void main(String[] args) {
		
		
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://automationwithpiyush.vercel.app/dropdown.html");
		
//		WebElement primaryDD = driver.findElement(By.id("single-select"));
//		
//		Select selPrimary = new Select(primaryDD);	
//		
//		selPrimary.selectByVisibleText("Tokyo, Japan");
//		
//	List<WebElement> selectedOption =	selPrimary.getAllSelectedOptions();
//		
//	for(WebElement option:selectedOption) {
//		
//		String getMsg = option.getText();
//		
//		System.out.println(getMsg);
//		
//	}		

	
		
		WebElement multiDD = driver.findElement(By.id("multi-select"));
		
		Select selMulti = new Select(multiDD);
	
		selMulti.selectByVisibleText("Selenium WebDriver");	
		selMulti.selectByVisibleText("Playwright Automation");		
		selMulti.selectByVisibleText("Jenkins CI/CD");	
		
		
		List<WebElement> allSelectedOptions= selMulti.getAllSelectedOptions();
		
	for(WebElement options :allSelectedOptions) {
		
		String allOptions = options.getText();
		System.out.println(allOptions);
		
	}
	
	
	}

}
