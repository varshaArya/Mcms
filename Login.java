package Mcms.Intro;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Login {

protected WebDriver driver;


	
   @BeforeClass 
	public void log() throws InterruptedException {
		
         
    	//System.setProperty("webdriver.chrome.driver","C:\\Users\\varsha\\Documents\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	
     
        WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(10));

		driver.manage().window().maximize();
	    driver.get("https://publisherv6-mcms.readwhere.app/auth/handshake");
	    WebElement framet1=driver.findElement(By.className("FB_UI_Dialog"));
		driver.switchTo().frame(framet1);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("resend")).sendKeys("pawas@mediologysoftware.com");
		driver.findElement(By.id("signinform-password")).sendKeys("123");
		
	 
		
	
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		     

	}
	
	
}


			    
				
			   
		 	     
		 	     
		 	     
		 	     
		 	     
		 	     
		 	    
		 	    
		 	     
	 	     
	
