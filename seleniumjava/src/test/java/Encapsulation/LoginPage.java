package Encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Test;





public class LoginPage extends BaseClass {

	
	private WebDriver driver ;
	
	private By username = By.id("username");
	private By password = By.id("password");	
	private By loginbtn = By.id("submit");
	
	private By successMsg = By.xpath("//h1[text() ='Logged In Successfully']");

	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	
	public void login(String user, String pass) {
		
		
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginbtn).click();
		
	}	
	
	
	// STEP 1️⃣ → Method to fetch success message
	
	 public String getSuccessMessage() {
	        return driver.findElement(successMsg).getText();
	    }
	
	
	
	
	
}
