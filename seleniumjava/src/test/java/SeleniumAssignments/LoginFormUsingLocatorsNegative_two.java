package SeleniumAssignments;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFormUsingLocatorsNegative_two {

	public static void main(String[] args) {
		
		
/*
		 
Test case 3: Negative password test

1. Open page
2. Type username student into Username field
3. Type password incorrectPassword into Password field
4. Push Submit button
5. Verify error message is displayed
6. Verify error message text is Your password is invalid!
		 				
		 		
*/		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		
//1. Open page
		
		driver.get("https://practicetestautomation.com/practice-test-login/");	
		

//2. Type username student into Username field
		
		WebElement inputUname = driver.findElement(By.xpath("//input[@id='username']"));		
		inputUname.sendKeys("student");
		
		
//3. Type password incorrectPassword into Password field	
		
		WebElement inputPassword =driver.findElement(By.xpath("//input[@id='password']"));		
		inputPassword.sendKeys("incorrectPassword ");
		
//4. Push Submit button
		
		WebElement button = driver.findElement(By.xpath("//button[@id='submit']"));
		button.click();
		
//5. Verify error message is displayed
		
		
		WebElement error =driver.findElement(By.xpath("//div[@id='error']"));
		
		String getErrorMsg = error.getText();
		
		if (error.isDisplayed()) {
			
			System.out.println("Error Message is Displayed !");
			
		}else {
			
			System.out.println("Error Message is not Displayed !");
			
		}
		
		
 //6. Verify error message text is Your password is invalid!
		
        if(getErrorMsg.contains("Your password is invalid!")) {
			
			
			System.out.println("Error message text is :-" +getErrorMsg);
		}else {
			
			System.out.println("Error message is not Displayed!.....");
		}
		
		
		
		

	}

}
