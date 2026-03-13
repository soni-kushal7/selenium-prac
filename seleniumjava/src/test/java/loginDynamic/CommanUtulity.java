package loginDynamic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommanUtulity {

	  WebDriver driver;

	    By usernameField = By.id("user-name");
	    By passwordField = By.id("password");
	    By loginButton = By.id("login-button");
	    By errorMessage = By.xpath("//h3[@data-test='error']");
	

	    public  CommanUtulity(WebDriver driver) {
	        this.driver = driver;
			

	    }
	    
	    
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	    }
	    
	    

	    public void login(String username, String password) {
	       
	    	driver.findElement(usernameField).clear();
	        driver.findElement(usernameField).sendKeys(username);
	        driver.findElement(passwordField).clear();
	        driver.findElement(passwordField).sendKeys(password);
	        driver.findElement(loginButton).click();
	        
	        
	        // 🔹 Validation Logic
	        if (driver.getCurrentUrl().contains("inventory")) {
	            System.out.println("Login Successful");
	        } 
	        else if (driver.findElements(errorMessage).size() > 0) {
	            System.out.println("Invalid User");
	        } 
	        else {
	            System.out.println("Unknown Login Status");
	        }
	        
	       
	        
	        
	        
	        
	        
	        
	        
	        
	    }
	}
	
	
	


