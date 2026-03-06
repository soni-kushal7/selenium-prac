package TakaScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class practice2 {

	public static void main(String[] args) throws IOException {
		
		
		
		WebDriver driver = new ChromeDriver();  //upcasting		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        driver.get("file:///C:/Users/kushal_verma/git/basic-sel/seleniumjava/src/test/java/HandlingDatePicker/datePicker.html");
		
		
        //TakesScreenshot tks = (TakesScreenshot)driver;
        //File source= tks.getScreenshotAs(OutputType.FILE);
      
        
        //WebElement element =driver.findElement(By.xpath("//div[@class='section'][2]"));
        WebElement element =driver.findElement(By.xpath("//div[@class='section'][4]//h2"));
      
        File source = element.getScreenshotAs(OutputType.FILE);
        
        String realPath ="./errorshots/elementDatePicker1.png";
        File destination = new File(realPath);
        FileHandler.copy(source, destination);
        
        
        
        
		
		

	}

}
