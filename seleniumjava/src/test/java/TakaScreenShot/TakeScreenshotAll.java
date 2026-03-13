package TakaScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotAll {

	public static void main(String[] args) throws IOException {
		
		
		
		WebDriver driver = new ChromeDriver();  //upcasting		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
		driver.get("https://demo.nopcommerce.com/");
		

		//1) full page screenshot
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
//		File targetfile=new File(System.getProperty("user.dir")+"\\errorshots\\fullpage.png");
//		sourcefile.renameTo(targetfile); // copy sourcefile to target file
//		System.out.println("Screenshot Captured......");
		
		

		//2) capture the screenshot of specific section
		/*WebElement featuredProducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourcefile=featuredProducts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty(System.getProperty("user.dir")+"\\errorshots\\specificSection.png");
		sourcefile.renameTo(targetfile); // copy sourcefile to target file
		*/

		//3) capture the screenshot of webelement
//		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		File sourcefile=logo.getScreenshotAs(OutputType.FILE);
//		File targetfile=new File(System.getProperty("user.dir")+"\\errorshots\\fullpage.png");
//		sourcefile.renameTo(targetfile); // copy sourcefile to target file

		
		//1) full page screenshot
		driver.get("https://demo.nopcommerce.com/");		
		TakesScreenshot tks = (TakesScreenshot)driver;		
		File source= tks.getScreenshotAs(OutputType.FILE);		
		String realPath = "./errorshots/fullpage1.png";		
	    File dest = new File(realPath);	    
	    FileHandler.copy(source, dest); 
	    System.out.println("1st SS Created.....");
	    
	    
	  //2) capture the screenshot of specific section
	    WebElement fetureProd =driver.findElement(By.xpath("//section[@class='product-grid home-page-product-grid']"));
	    File source1 =fetureProd.getScreenshotAs(OutputType.FILE);
	    String reatPath ="./errorshots/fetureProd.png";	    
	    File dest1 = new File(reatPath);	    
	    FileHandler.copy(source1, dest1);	    
	    System.out.println("2nd SS Created.....");
	    
	    
	    
	  //3) capture the screenshot of webelement
	    WebElement macImage= driver.findElement(By.xpath("//img[@alt='Picture of Apple MacBook Pro']"));	    
	    File source2= macImage.getScreenshotAs(OutputType.FILE);	    
	    String realPath1=  "./errorshots/elementSs.png";    
	    File dest2 = new File(realPath1);	    
	    FileHandler.copy(source2, dest2);
	    System.out.println("3rd SS Created.....");

	    
	    
	    
		driver.quit();
		
		
		

	}

}
