package HandlingDatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleDatePiker {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
			
		driver.get("https://jqueryui.com/datepicker/");
		
		// switch to the frame if avaliable
		driver.switchTo().frame(0);
		
		//Method 1---> by sendKeys
		//driver.findElement(By.id("datepicker")).sendKeys("02/11/2026");
		
		
		//Method 2--->select the date using date-picker element.
		
		//Expected date....
		

		String year = "2026";
		String month = "July";
		String date = "11";
		
		driver.findElement(By.id("datepicker")).click();
		
		
		//1. select month and year
		
		while(true) {
			
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			
			if(currentMonth.equals(month) && currentYear.equals(year)) {
				
				break;
			}
			
			WebElement nextButton =driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
			nextButton.click();
			
			//WebElement previousButton =driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
			//previousButton.click();
			
			Thread.sleep(2000);
			
		}
		
		
	//select the date....
		
		
	List <WebElement>allDates =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt:allDates) {
			
			if (dt.getText().equals(date)) {
				
				dt.click();
				break;
			}
			
			
		}
	
	
		
	
		
		

	}

}
