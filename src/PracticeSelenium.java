

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;	

public class PracticeSelenium {

	public static void main(String[] args) {

		
		
		 WebDriver driver = new ChromeDriver();
			
		 driver.get("https://crm.exc.ms/");
		 
		 WebElement CompanyNameInput = driver.findElement(By.id("company"));
		 CompanyNameInput.sendKeys("ceai");
		
		 WebElement UserName = driver.findElement(By.id("username"));
		 UserName.sendKeys("KVerma3");
		
		 WebElement UserPasword = driver.findElement(By.id("password"));
		 UserPasword.sendKeys("Passwd#93&");
		 
		 
		 WebElement LoginButton = driver.findElement(By.id("loginBtn"));
		 LoginButton.click();
		
		/*
		
		 WebDriver driver = new ChromeDriver();
		
		 driver.get("https://hrms.elevenxcapital.com/");
		 driver.manage().window().maximize();
		 
		 WebElement searchBox1 = driver.findElement(By.name("txtLogin"));
		 searchBox1.sendKeys("1921");
		 
		 WebElement searchBox2 = driver.findElement(By.name("txtPassword"));
		 searchBox2.sendKeys("Kushal@$oni#1234");
		 
		 
		 WebElement searchButton = driver.findElement(By.id("btnLog"));
		 searchButton.click();
		 
		 
		 //WebElement AttendanceButton = driver.findElement(By.xpath("//a[@href='fb9c626ef517b6eda85c890c16f6a412']"));
		 
		 
		 WebElement attendanceHeader = driver.findElement(By.xpath("//h2[@class='num' and text()='Attendance']"));
		 
		 
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		 attendanceHeader.click();
		 
		 WebElement menuIconElement = driver.findElement(By.xpath("//li/a[@data-toggle-state=\"aside-collapsed\"]/em[@class=\"material-icons\"]"));
		 
//		 searchButtonAttendance.querySelector(.btnLog).click();
		 
		 
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 menuIconElement.click();
		 
		 */
		 
		 
		 
		 
		 
		 
		/* driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 
		 WebElement searchBox = driver.findElement(By.name("search_query"));
		 searchBox.sendKeys("SDET QA");
		 searchBox.sendKeys(Keys.RETURN);
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		 
		 for (int i = 0; i < 3; i++) {
             js.executeScript("window.scrollBy(0, 1000);");
             
         }
		 
		 //js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		 
		 */
		 
		 

	}

}
