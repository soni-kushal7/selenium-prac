package BasicSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
WebDriver driver = new ChromeDriver(); //1st line of code
		
		//driver.manage().window().maximize(); // 2nd line of code
		
	
		
		driver.get("https://www.facebook.com/");
		
//To Get Title of web page.....................
		
		String getTitel = driver.getTitle();
		System.out.println(getTitel);
		
//To get Current URL of web page................
		String getUrl =driver.getCurrentUrl();
		System.out.println(getUrl);
		

//To get page source of web page................
		
		//String gPageSource= driver.getPageSource();
		//System.out.println(gPageSource);
		
		
		
		Window win= driver.manage().window();
		
		//win.maximize();
		//Thread.sleep(3000);
		
		//win.minimize();
		//Thread.sleep(3000);
		
		
		//win.fullscreen();
		//Thread.sleep(3000);

/*		
		
// ------------------- GET WINDOW SIZE -------------------		
		

		Dimension currentSize = win.getSize();
		
		int height= currentSize.getHeight();
		//System.out.println(height);
		
		int width = currentSize.getWidth();
		//System.out.println(width);
		
		 System.out.println("Current Window Size : " + currentSize);
	     System.out.println("Height : " + height);
	     System.out.println("Width  : " + width);
		
	     Thread.sleep(3000);
	     
// ------------------- SET WINDOW SIZE -------------------	
		
	     Dimension newSize = new Dimension(900, 500);
	     
	     win.setSize(newSize);
	     Thread.sleep(3000);
	    
	     
	  // Inline object creation	     
	      //win.setSize(new Dimension(600, 600));
	      //Thread.sleep(2000);
		
*/
		
// ------------------- GET WINDOW POSITION -------------------	     
	     
	     
	    Point currentPosition = win.getPosition(); 
	    
	     int x= currentPosition.getX();
	     int y= currentPosition.getY();
	     
	     System.out.println("Current Window Position : " + currentPosition);
	     System.out.println("X Coordinate : " + x);
	     System.out.println("Y Coordinate : " + y);
	     
	     
	  Point newPosition= new Point(300,300);
	    
	  win.setPosition(newPosition);
	  
	  System.out.println("New Window Position : " + newPosition);
	    
	  Thread.sleep(3000);
	  
	  driver.quit();
	     

	}

}
