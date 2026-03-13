package HandlingDatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/kushal_verma/git/basic-sel/seleniumjava/src/test/java/HandlingDatePicker/datePicker.html");
		
		String year ="2026";
		String month = "July";
		String date = "11";
		
		driver.findElement(By.id("jqueryDate")).click();
		
		//select the year and month
		
		boolean flag = true;
		
		while(flag) {
			
			String currentYear =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String currentMonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			if(currentYear.equals(year) && currentMonth.equals(month)) {
				
				flag =false;
				
			}
			
			WebElement nextButton =driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
			nextButton.click();
			//Thread.sleep(2000);
		
		}
		
		//select the date
		
		
		List <WebElement> allDates =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt:allDates) {
			
			if(dt.getText().equals(date)) {
				
				dt.click();
				break;
			}
			
		}
		
		

	}

}
