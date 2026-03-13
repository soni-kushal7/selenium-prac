package handleFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleSimpleFrames {

	public static void main(String[] args) {
		
		
/*
 
  		3 types of switching methods
---------

1) browser windows  
   driver.switchTo().window(windowID/window handle)

2) alerts  
   driver.switchTo().alert()  
   driver.switchTo().accept()  
   driver.switchTo().dismiss()

3) frames/iframes  
   driver.switchTo().frame(id);  
   driver.switchTo().frame(name);  
   driver.switchTo().frame(WebElement);
 
  		
✅ Explanation:

Browser windows: Used when multiple tabs or windows are open — Selenium switches focus using a unique window handle.

Alerts: Handles popup alerts; .accept() clicks OK, .dismiss() clicks Cancel.

Frames: Switches between different frame elements on a webpage (by ID, name, or WebElement reference).
  		
   		
  				
 */
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		
//		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
//		driver.switchTo().frame(frame1);  // passed frame as a webelement // switch to frame1
//		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
		
		//Frame 1
		WebElement frame1 =driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("kushal");
		
		driver.switchTo().defaultContent(); // go back to page
		
		//Frame 2
		WebElement frame2 =driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Verma");
		
		driver.switchTo().defaultContent();
		
		
		//Frame 3
		
		
		WebElement frame3 =driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("QA");
		
		
		// Inner iframe part of frame 3
		
		
		driver.switchTo().frame(0);
		
		//driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		
		
		// Click by JavascriptExecutor
		WebElement radioButton =driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", radioButton);
		
		driver.switchTo().defaultContent();
	
		
		
		
		
		
		
		
		

	}

}
