package Assignment_18Jan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BirthDayFbDropdown {

	public static void main(String[] args) {
		
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement dateDD = driver.findElement(By.id("day"));
		
		Select selDate = new Select(dateDD);
		
		selDate.selectByVisibleText("11");
		
		
		
        WebElement monthDD = driver.findElement(By.id("month"));
		
		Select selMonth = new Select(monthDD);
		
		selMonth.selectByVisibleText("Jul");
		
        WebElement yearDD = driver.findElement(By.id("year"));
		
		Select selYear = new Select(yearDD);
		
		selYear.selectByVisibleText("1994");
		
		
		
		

	}

}
