package handlingFramePopupsWindows;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopupWindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
			
		driver.get("https://automationwithpiyush.vercel.app/popups.html");

		Thread.sleep(5000);
		
		
		Alert ale = driver.switchTo().alert();
		String textOfFirstAlert = ale.getText();
		System.out.println(textOfFirstAlert);
		
		ale.sendKeys("Kushal");
//		Thread.sleep(3000);
		ale.accept();
		
		
		driver.findElement(By.xpath("//button[@onclick= 'triggerAlert()']")).click();
		Thread.sleep(3000);
		String jsAlert = ale.getText();
		System.out.println(jsAlert);
		ale.accept();

		
		driver.findElement(By.xpath("//button[@onclick= 'triggerConfirm()']")).click();
		Thread.sleep(3000);
		
		String JsConfirm= ale.getText();
		System.out.println(JsConfirm);
		ale.accept();
		//ale.dismiss();
		
		
		
		driver.findElement(By.xpath("//button[@onclick= 'triggerPrompt()']")).click();
		Thread.sleep(5000);
		
		String JsPrompt = ale.getText();
		System.out.println(JsPrompt);
		ale.sendKeys("Rajat");
		//ale.accept();
		ale.dismiss();
		
		
		String Path= "C:\\Users\\kushal_verma\\OneDrive - University of Cleveland\\Desktop\\Decl.pdf";
		WebElement fileUpload = driver.findElement(By.id("fileUpload"));
		fileUpload.sendKeys(Path);
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		

	}

}
