package SeleniumAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
//1. 1. By ID
		
		
		driver.get("file:///C:/Users/kushal_verma/Downloads/assignment.html");
		
		driver.findElement(By.id("unique_user_id_99")).sendKeys("Kushal");
		
		
//2. By Name		
		
		driver.findElement(By.name("user_email_field")).sendKeys("kushal@gmail.com");
		
//3. By Class Name		
		
		driver.findElement(By.className("btn-login-action")).click();
		
//4. By Tag Name		
		
		List <WebElement > links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links on page are : " + links.size());
		
		
//		WebElement printLinks= driver.findElement(By.id("links-area"));
//		
//		List <WebElement> list = printLinks.findElements(By.tagName("a"));
//		
//		System.out.println(list.size());
//		
//		for (WebElement printLinks :list) {
//			
//			
//			
//		}
		
		

		
//5 & 6. Link Text
		
		//Thread.sleep(3000);
		
		driver.findElement(By.linkText("Terms and Conditions")).click();
		
		driver.findElement(By.partialLinkText("View")).click();
		
//7. CSS Selector		
		
		
		driver.findElement(By.cssSelector("button[id='submit']")).click();
		
		
//8. XPath (Custom Attribute)	
		
		
		
		driver.findElement(By.xpath("//button[@data-testid='add-to-cart-btn']")).click();

		
//9. XPath (Text Function)	
				
		
		WebElement text = driver.findElement(By.xpath("//span[text()='Save']"));
		
		System.out.println(text.getText());
		
//10. XPath (Multiple Attributes)	
		
			
		driver.findElement(By.xpath("//input[@type='submit' and @class='form-btn']")).click();
		
		
//11. XPath (Contains)
		
		
//Case 1----By text()		
		WebElement contains =driver.findElement(By.xpath("//div[contains(text() ,'User Data: John Doe' )]"));
		
		String userData= contains.getText();
		
		System.out.println(userData);
		
//Case 2------By Attribute		
		
		WebElement contains2 = driver.findElement(By.xpath("//div[contains(@id,'user_profile_98734_view')]"));
		
		String userData2= contains2.getText();
		
		System.out.println(userData2);
		
		
//	12 & 13. XPath Axes		
		
		driver.findElement(By.xpath("//label[text()='I agree to terms']/following-sibling::input[@type='checkbox']")).click();
		
		
//13.	
		WebElement Axes= driver.findElement(By.xpath("//td[text()='Product A']"));
	
	String getProductText = Axes.getText();
	
	System.out.println(getProductText);
		
	}

}
