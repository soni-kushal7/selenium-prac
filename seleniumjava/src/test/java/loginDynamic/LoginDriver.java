package loginDynamic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDriver {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.saucedemo.com/");
		
		CommanUtulity login = new CommanUtulity(driver);
	
		login.login("standard_user", "secret_sauce");
		

	}

}






/*
 * 
public static String login (String name , String pass) {
			String flag = "";
			
			if(name.equals("abc")) {
				flag = "true";
			}else {
				flag = "false";
			}
			if(pass.equals("123456")) {
				flag = "true";
			}else {
				flag = "false";
			}
			System.out.println("Login Succesfully....."+flag);
			
			return flag;
			
			}
 * 
 * 
 */




