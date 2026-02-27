package HandlingDatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    
public class methodOfPastAndFutureDates {
	
	
	//Method of Future Date....
	
	    static void futureDate(WebDriver driver, String year,String month,String date) {
		
		
		while(true) {
			
		String currentYear =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		String currentMonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
		if(currentYear.equals(year) && currentMonth.equals(month)) {
				
			break;
				
		}
			
			WebElement nextButton =driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
			nextButton.click();
			//Thread.sleep(2000);
		
		}
		
		
        List <WebElement> allDates =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt:allDates) {
			
			if(dt.getText().equals(date)) {
				
				dt.click();
				break;
			}
			
		}

		
		
	}
	    
	    
	    
//--------------------------
	    
	  //Method of past Date....
		
	    static void pastDate(WebDriver driver, String year,String month,String date) {
		
		
		while(true) {
			
		String currentYear =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		String currentMonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
		if(currentYear.equals(year) && currentMonth.equals(month)) {
				
			break;
				
		}
			
			WebElement previousButton =driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
			previousButton.click();
			//Thread.sleep(2000);
		
		}
		
		
        List <WebElement> allDates =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt:allDates) {
			
			if(dt.getText().equals(date)) {
				
				dt.click();
				break;
			}
			
		}

		
	}
	  
	
	public static void main(String[] args) {
		
		

		    WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			
			driver.get("file:///C:/Users/kushal_verma/git/basic-sel/seleniumjava/src/test/java/HandlingDatePicker/datePicker.html");
		
		
		
		driver.findElement(By.id("jqueryDate")).click();
		
		methodOfPastAndFutureDates.futureDate(driver, "2027", "July", "11");
		
		//methodOfPastAndFutureDates.pastDate(driver, "2024", "July", "11");

	}

}
