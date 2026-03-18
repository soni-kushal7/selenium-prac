package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();

//By id and name 		
		driver.get("https://automationwithpiyush.vercel.app/locators.html");
		driver.findElement(By.id("login-username")).sendKeys("Kushal Verma");
		driver.findElement(By.name("user_email_address")).sendKeys("kushal@gmail.com");
		
		
//By LinkText and PartialLinkText	
		
	    //driver.findElement(By.linkText("Go to Dashboard")).click();
		//driver.findElement(By.partialLinkText("Conditions")).click();
		//driver.quit();		
		
// By class name 		
		List<WebElement> img =driver.findElements(By.className("avatar-image"));
		System.out.println(img.size());

//By tag-name
		WebElement parent = driver.findElement(By.id("useful-links-section"));
		List<WebElement> links = parent.findElements(By.tagName("a"));
		System.out.println("Total Links Present in this Box:-" +links.size());

		for(WebElement link:links) {
			
			System.out.println(link.getText());
			
		}
		

		WebElement parent1= driver.findElement(By.xpath("//div[@class='p-4 border rounded bg-gray-50 flex flex-col space-y-3']"));
		List<WebElement> links1 =parent1.findElements(By.tagName("a"));
		
		System.out.println("Total Links Present in this Box:-" + links1.size());
		
		for(WebElement link:links1) {
			
			System.out.println(link.getText());
			
		}
		

//By CSS Selectors 		
		driver.findElement(By.cssSelector("input[placeholder='Password input']")).sendKeys("123456");

		
		
		
		

	}

}
