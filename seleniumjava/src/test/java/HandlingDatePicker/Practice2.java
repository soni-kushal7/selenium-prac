package HandlingDatePicker;

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

public class Practice2 {
	
	
	 

	 static void futureDate(WebDriver driver, String year,String month, String date) {
		
		while(true) {
			
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String currentMonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			
			if(currentYear.equals(year) && currentMonth.equals(month)) {
				
				break;
				
			}
			
			WebElement nextButton = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
			nextButton.click();	
			
		}

		
		List<WebElement >allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td//a"));
		
		for(WebElement dt:allDates) {
			
			if(dt.getText().equals(date)) {
				
				dt.click();
				break;
				
			}
				
			
		}
				
		
	}
	
	 
	 
	 
	 
	static void pastDate(WebDriver driver, String year, String month, String date) {
		 
		 
		 while(true) {
			 
			 String currentYear =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			 String currentMonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			 
			 if(currentYear.equals(year) && currentMonth.equals(month)) {
				 
				 break;
			 }
			 
			 WebElement preButton= driver.findElement(By.xpath("//span[@class= 'ui-icon ui-icon-circle-triangle-w']"));
			 preButton.click();
			 
			 
		 }
		 
		 
		List<WebElement>allDates= driver.findElements(By.xpath("//table[@class= 'ui-datepicker-calendar']//tbody//tr//td//a"));
		 
		 for(WebElement dt:allDates) {

			 if(dt.getText().equals(date)) {
				 
				 dt.click();
				 break;
			 }
			 
		 }
		 
		 
	 }
	 
	 
	
	
	public static void takeScreenshot(WebDriver driver, String screenshotName) throws IOException {

        // 1. Downcasting
        TakesScreenshot tks = (TakesScreenshot) driver;

        // 2. Capture screenshot
        File source = tks.getScreenshotAs(OutputType.FILE);

        // 3. Create destination file
        String path = "./errorshots/" + screenshotName + ".png";
        File destination = new File(path);

        // 4. Copy screenshot
        FileHandler.copy(source, destination);
    }

	


	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/kushal_verma/git/basic-sel/seleniumjava/src/test/java/HandlingDatePicker/datePicker.html");

		//driver.findElement(By.id("jqueryDate")).click();
		
		//Thread.sleep(2000);
		//Practice2.futureDate(driver, "2027", "July", "11");
		
		//Practice2.pastDate(driver, "2025", "July", "11");
		
		//Thread.sleep(2000);
		
		//Practice2.takeScreenshot(driver, "datePicker");

		
		
		String date="11";
		driver.findElement(By.id("calendarNav")).click();
		
		WebElement monthDD=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select selMonth= new Select(monthDD);
		selMonth.selectByVisibleText("Jul");
		
		
		WebElement yearDD =driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selYear = new Select(yearDD);
		selYear.selectByVisibleText("2016");
		
		List<WebElement> allDates =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt:allDates) {
			
			if(dt.getText().equals(date)) {
				
				dt.click();
				break;
				
			}
			
			
		}
		
		
		
		
		//driver.quit();
		

	}

}
