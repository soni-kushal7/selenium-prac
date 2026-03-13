package LocatersPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtractLinks {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		
		driver.findElement(By.partialLinkText("Log in")).click();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("kushal24@yopmail.com");
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Kushal@1234");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		

//		 List<WebElement> pollResults =
//		            driver.findElements(By.xpath("//ul[@class='poll-results']/li"));
//		    System.out.println(pollResults.size());
		
//	List<WebElement> listCount = driver.findElements(By.xpath("//ul[@class='list']/li/a"));
//		
//	System.out.println(listCount.size());
//	
//	int count = 1;
//	
//	for(WebElement list : listCount) {
//		
//		System.out.println(count + " ." + list);
//		count++;
//	}
		
		
		List<WebElement> categoryList =
		        driver.findElements(By.xpath("//ul[@class='list']/li"));

		System.out.println("Total categories: " + categoryList.size());

		for (int i = 0; i < categoryList.size(); i++) {
		    System.out.println((i + 1) + ". " + categoryList.get(i).getText());
		}	
		
		for (WebElement category : categoryList) {
		    category.click();
		    driver.navigate().back();
		}

		

	}

}
