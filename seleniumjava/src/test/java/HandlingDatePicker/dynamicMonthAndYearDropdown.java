package HandlingDatePicker;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicMonthAndYearDropdown {

	public static void main(String[] args) {
		
		
/*
 
 Logic ---->
 
 if expected month < current month then past month (click on back button)
             January < feb 
 
 
  if expected month > current month then future month (click on forward button)
               april> feb  
 
 * 		
 */
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		
		
		
		

	}

}
