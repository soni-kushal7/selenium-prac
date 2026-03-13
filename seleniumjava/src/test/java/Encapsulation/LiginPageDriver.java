package Encapsulation;

public class LiginPageDriver {

	public static void main(String[] args) {
		
		
		
		// STEP 1 → Create BaseTest object
		BaseClass base = new BaseClass();
		
		 // STEP 2 → Initialize browser & open URL or 1, 2, 3 line of code is present in this method
		base.setUp();
		
		
		LoginPage loginPage = new LoginPage(base.driver);
		loginPage.login("student", "Password123");
		
		
		 //  Capture actual result
		
		String  actualMessage = loginPage.getSuccessMessage();
		
		   //  Validation (MANUAL ASSERTION)
		
        if (actualMessage.equals("Logged In Successfully")) {
            System.out.println("✅ Login Successful - Test Case PASS");
        } else {
            System.out.println("❌ Login Failed - Test Case FAIL");
        }
		
		
		base.tearDown();
		

	}

}
