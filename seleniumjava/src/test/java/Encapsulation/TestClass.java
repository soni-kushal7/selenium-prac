package Encapsulation;

import org.testng.annotations.Test;

public class TestClass extends BaseClass{

	
	  @Test
	    public void validLoginTest() {

	        LoginPage loginPage = new LoginPage(driver);

	        loginPage.login("student", "Password123");
	    }
	}
	
	

