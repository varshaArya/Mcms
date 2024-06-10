package Mcms.Intro;
import java.time.Duration;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



@Test
public class Mobi extends Login {


	public void Mobi() throws InterruptedException {
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\varsha\\Documents\\chromedriver\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
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
			
			//driver.findElement(By.className("btn")).click();

			driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
			
			//importer
			
		    driver.switchTo().newWindow(WindowType.TAB);
		 
		    driver.manage().window().maximize();
		  
		    driver.get("https://mobiadmin.readwhere.app/publisher-apps");
		    driver.findElement(By.xpath("(//img[@class='center-block google_img_width'])[1]")).click();
		    
		    driver.findElement(By.xpath("(//input[@id='identifierId'])[1]")).sendKeys("varsha.arya");
		    driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
		     
		    driver.findElement(By.xpath("(//input[@name='Passwd'])[1]")).sendKeys("Varsha@241118");
		    driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click(); //--- to show the password 
		     
		    Thread.sleep(2000);
		     driver.findElement(By.xpath("//span[starts-with(text(),'Next')]")).click(); // click on next
		     
		     
	         driver.findElement(By.xpath("(//span[@class='caret'])[1]")).click();
		     driver.findElement(By.linkText("Importer Stats")).click();


		    driver.findElement(By.xpath("(//input[@id='websiteId'])[1]")).sendKeys("344");
		    
		    driver.findElement(By.xpath("(//select[@id='observerfilter'])[1]")).click();
		    driver.findElement(By.xpath("//select[@id='observerfilter']//option[@value='all']")).click();
		    
		    driver.findElement(By.xpath("(//select[@id='frequency'])[1] ")).click();
		    driver.findElement(By.xpath("//select[@id='frequency']//option[@value='all']")).click();
		    driver.findElement(By.xpath("(//input[@id='go'])[1]")).click();
		
		    
		    driver.findElement(By.xpath("(//img[@title='update'])[2]")).click();
		    driver.findElement(By.xpath("(//select[@name='importer_frequency'])[1]")).click();
		    driver.findElement(By.xpath("(//option[@value='300'])[1]")).click();
		    driver.findElement(By.xpath("//form[@id='version']//button[@name='submit-button']")).click();
		    
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("(//input[@value='disabled'])[2]")).click();
		    driver.findElement(By.xpath("//form[@id='combined_xmlform']//button[@name='submit-button']")).click();
            
		    
//		    <class name="Mcms.Intro.Mobi"/>
//		     <class name="Mcms.Intro.check"/>
//		      <class name="Mcms.Intro.Edit"/>
	}

}
