package SeleniumAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFormUsingLocatorsPositive {

	public static void main(String[] args) {
		

/*

 1. Automate the Login Form Using All Types of Locators
Question: Locate and interact with the username, password, and login button using all types of Selenium locators
(id, name, className, tagName, cssSelector, xpath).
 
 Practice URL--->https://practicetestautomation.com/practice-test-login/	
 
 			
Test case 1: Positive LogIn test

1. Open page
2. Type username student into Username field
3. Type password Password123 into Password field
4. Push Submit button
5. Verify new page URL contains practicetestautomation.com/logged-in-successfully/
6. Verify new page contains expected text ('Congratulations' or 'successfully logged in')
7. Verify button Log out is displayed on the new page
	
 						
 */
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//Test case 1: Positive LogIn test		
		
//1. Open page		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
//2. Type username student into Username field by ID Locator
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("student");
		
//3. Type password Password123 into Password field by name locator
		
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("Password123");

		
//4. Push Submit button		by cssSelector
				
		WebElement submit=driver.findElement(By.cssSelector("button[id='submit']"));
		submit.click();
		
		System.out.println("LogIn Succesfully!....");
		
		
//5. Verify new page URL contains practicetestautomation.com/logged-in-successfully/
		
		 String currentUrl = driver.getCurrentUrl();  
		 
		 //System.out.println(currentUrl);
		 
		 if (currentUrl.contains("practicetestautomation.com/logged-in-successfully/")) {
			 
			 
			 System.out.println("New page URL contains Given URL!.. Tast Case Pass!....");			 
			 
		 }else {
			 
			 System.out.println("New page URL IS Not contains Given URL!..Tast Case Fail!....");	
			 
		 }
		 
		 
		
//6. Verify new page contains expected text ('Congratulations' or 'successfully logged in') by xPath 
		 
		 WebElement loggedIn=driver.findElement(By.xpath("//h1[text()='Logged In Successfully']"));
		 
		 String getText=loggedIn.getText();
		 
		 if (getText.contains("Logged In Successfully")) {
			 
			 System.out.println("New page contains expected text!... Test Case Pass!.....");
			 
		 }else {
			 
			 System.out.println("New page IS Not contains expected text!...Test Case Fail!.....");
		 }
		 
//7. Verify button Log out is displayed on the new page	
		 
		 
		 WebElement buttonDisplay=driver.findElement(By.xpath("//a[text()='Log out']"));
		 
		 //String displayLogout=buttonDisplay.getText();
		 
		 if (buttonDisplay.isDisplayed() && buttonDisplay.isEnabled()) {
			 
			 System.out.println("Logout Button Is Displayed, Test Case Pass!....");
			 
			 WebElement logOut =driver.findElement(By.xpath("//a[text()='Log out']"));
			 logOut.click();
			 System.out.println("LogOut Succesfully!.....");
			 
		 }else {
			 
			 System.out.println("Logout Button Is Not Displayed, Test Case Fail!....");
			 
		 }

		 
		 
		 
		 
		 
	}

}
