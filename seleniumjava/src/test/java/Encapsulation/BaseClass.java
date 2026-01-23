package Encapsulation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	
	protected WebDriver driver;
	
	
	@BeforeMethod 
	
	void setUp() {
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
	}
	
	
	@AfterMethod
	
	void tearDown() {
		
		driver.quit();
		
	}
	
	
	
}
