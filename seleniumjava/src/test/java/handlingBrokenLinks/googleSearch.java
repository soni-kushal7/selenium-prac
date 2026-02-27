package handlingBrokenLinks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {

	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwjWwq2h-OqSAxX2ZWwGHVZgLjUQPAgJ");
		
		WebElement text =driver.findElement(By.id("APjFqb"));
		text.sendKeys("selenium");
		driver.findElement(By.xpath("//span[text()='AI Mode']")).click();
		
		
		
		
		
	}

}
