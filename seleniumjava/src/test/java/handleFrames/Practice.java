package handleFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		
		WebElement frame5 =driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Assignment");
		
		//driver.switchTo().defaultContent();
		
		WebElement link =driver.findElement(By.xpath("//a[text()='https://a9t9.com']"));
		link.click();
		
		
		
		
		

	}

}
