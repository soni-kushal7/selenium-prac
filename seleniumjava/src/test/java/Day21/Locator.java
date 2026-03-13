package Day21;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		
		
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		/*	
			driver.get("http://103.246.106.171:6060/IITK-0/");
			
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("arh");
			
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
			
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			
			Thread.sleep(4000);
			
		*/	
			
			
		
			
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.findElement(By.id("inputUsername")).sendKeys("contact");
			driver.findElement(By.name("inputPassword")).sendKeys("asdfg1234");
			driver.findElement(By.className("signInBtn")).click();
			System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
			
			//driver.findElement(By.cssSelector("a[href='#']")).click();
			//driver.findElement(By.cssSelector("a[href='\\#']")).click();
			
			driver.findElement(By.linkText("Forgot your password?")).click();
			
			Thread.sleep(1000);
			
			//driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
			
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("kushal");
			driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("kushal@gmail.com");
			driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9876123456");
			
			driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
			
			System.out.println(driver.findElement(By.cssSelector("form p")).getText());
			
			driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
			
			Thread.sleep(1000);
			
			String name="Ankit Pratap Singh";
			
			//driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
			
			driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(name);
			
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
			
			driver.findElement(By.xpath("//input[@name='chkboxOne']")).click();
			driver.findElement(By.xpath("//button[contains(@class,'submit ')]")).click();
			
			Thread.sleep(2000);
			
			//System.out.println("Logged In");
			
			//driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
			//System.out.println("Log Out");
			
			System.out.println(driver.findElement(By.tagName("p")).getText());
			Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
			
			Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+ name +",");
			
			
			
			
			
			
			
			
	
			
/*	
			
			   // Get the full message
	        String message = driver.findElement(By.cssSelector("form p")).getText();
	        System.out.println("Full message: " + message);

	        // Extract the password between single quotes
	        String password = message.split("'")[1];
	        System.out.println("Extracted password: " + password);
*/
			
			
			

			
			
		
		//driver.findElement(By.className("reset-pwd-btn")).click();
		//driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		//driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		
		
		
		
		
		
		
		
	}

}
