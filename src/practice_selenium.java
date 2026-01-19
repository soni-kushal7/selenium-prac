import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class practice_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//ChromeDriver driver = new ChromeDriver();
		

		
		
//For Firefox	
		
		
//		WebDriver driver1 = new FirefoxDriver();
//		driver1.get("http://103.246.106.150:6060/IITK-0/login");
//		System.out.println(driver1.getTitle());
//		System.out.println(driver1.getCurrentUrl());
//		driver1.close();
		
		
//		For Edge
		
//		WebDriver driver2 = new EdgeDriver();
//		driver2.get("http://103.246.106.150:6060/IITK-0/login");
//		System.out.println(driver2.getTitle());
//		System.out.println(driver2.getCurrentUrl());
//		driver2.close();
//		
		
//		For Chrome driver	
		
			WebDriver driver = new ChromeDriver();
			driver.get("http://103.246.106.150:6060/IITK-0/login");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.close();
		
		
		
		
		

	}

}
