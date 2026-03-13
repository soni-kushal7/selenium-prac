package SeleniumAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFormUsingLocatorsNegative {

	public static void main(String[] args) {
	

/*
 
 Test case 2: Negative username test

1. Open page
2. Type username incorrectUser into Username field
3. Type password Password123 into Password field
4. Push Submit button
5. Verify error message is displayed
6. Verify error message text is Your username is invalid!
 				
 		
 */
		
				
        WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//Test case 2: Negative username test
		
		
//1. Open page	
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		
//2. Type username incorrectUser into Username field----by contains() method 
		
		WebElement userName=driver.findElement(By.xpath("//input[contains(@id,'username')]"));
		userName.sendKeys("incorrectUser");
		
//3. Type password Password123 into Password field-----by multiple attributes 
		
		WebElement password =driver.findElement(By.xpath("//input[@type='password' and @name='password']"));		
		password.sendKeys("Password123");
		
		
//4. Push Submit button -----By cssSelector
		
		WebElement submit =driver.findElement(By.cssSelector("#submit"));
		submit.click();
		
//5. Verify error message is displayed		
		
		WebElement error =driver.findElement(By.xpath("//div[@id='error']"));
		
		String gerError= error.getText();
		//System.out.println(gerError);
		
		if (error.isDisplayed()) {
			
			System.out.println("Error Message Is Displayed!...");
			
		}else {
			
			System.out.println("Error Message Is Displayed!...");
			
		}
		
//6. Verify error message text is Your username is invalid!
		
		if(gerError.contains("Your username is invalid!")) {
			
			
			System.out.println("Error message text is :-" +gerError);
		}else {
			
			System.out.println("Error message is not Displayed!.....");
		}
		
		
		
		

	}

}
