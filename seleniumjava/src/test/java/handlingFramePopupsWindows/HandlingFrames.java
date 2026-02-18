package handlingFramePopupsWindows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	driver.get("https://automationwithpiyush.vercel.app/frames.html");
//		
//		WebElement frame1 = driver.findElement(By.id("frame_a"));
//		driver.switchTo().frame(frame1);
//		WebElement input =driver.findElement(By.id("name_input"));
//		input.sendKeys("Kushal Verma");
//		
//		//driver.switchTo().parentFrame();
//		driver.switchTo().defaultContent();
//		
//		
//		WebElement frame2 = driver.findElement(By.id("frame_b"));
//		driver.switchTo().frame(frame2);
//		driver.findElement(By.xpath("//input[@id='critical_check']")).click();
//		
//		driver.switchTo().defaultContent();
//		
//		
//		
//		WebElement frame3 =driver.findElement(By.id("frame_c"));
//		driver.switchTo().frame(frame3);
//		driver.findElement(By.xpath("//label[text()=' B+']")).click();
//		
//		
//		driver.switchTo().defaultContent();
//		
		
//		WebElement frame4 = driver.findElement(By.id("frame_d"));
//		driver.switchTo().frame(frame4);
//		driver.findElement(By.xpath("//input[@id='open_door_btn']")).click();
//		
//		driver.switchTo().defaultContent();
		
	
		
		
//		WebElement frame5= driver.findElement(By.id("frame_h"));
//		
//		driver.switchTo().frame(frame4).switchTo().frame(frame5);
//		driver.findElement(By.xpath("//textarea[@id='notes_area']")).sendKeys("Kushal");
		
		
		WebElement frame4 = driver.findElement(By.id("frame_d"));
		WebElement frame5= driver.findElement(By.id("frame_h"));
		
		driver.switchTo().frame(frame4).switchTo().frame(frame5);
		

	}

}
