package Mcms.Intro;

import java.time.Duration;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Edit {

	  @Test
	  public void edit() throws InterruptedException {
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\varsha\\Documents\\chromedriver\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	        WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(10));
	        
	        
            // login
	        
	       
	        driver.manage().window().maximize();
			driver.get("https://publisherv6-mcms.readwhere.app/auth/handshake");
			WebElement framet1=driver.findElement(By.className("FB_UI_Dialog"));
			driver.switchTo().frame(framet1);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.id("resend")).sendKeys("pawas@mediologysoftware.com");
			driver.findElement(By.id("signinform-password")).sendKeys("123");
			driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	
	
			
			//categories click
		    driver.findElement(By.xpath("(//div[@class='sections'])[11]")).click();
		   
		    //Edit
		    driver.findElement(By.xpath("//a[@href='/category/344/91761']")).click();
		    driver.findElement(By.xpath("//a[@href='/postlist/344/91761']")).click();
			
		    
		     //pin
		     Thread.sleep(4000);
		     driver.findElement(By.xpath("(//img)[4]")).click();
		     Alert alert6 = driver.switchTo().alert(); 
		     alert6.accept(); 
		    
		     //push
		     Thread.sleep(4000);
		     driver.findElement(By.xpath("(//a[@title='push notification'])[1]")).click();
		     driver.findElement(By.xpath("(//input[@id='submit_step'])[1]")).click();
			  
			     //delete
			     Thread.sleep(4000);
			     driver.findElement(By.xpath("(//a[@title='delete'])[1]")).click();
			     Alert alert5 = driver.switchTo().alert(); 
			     alert5.accept(); 
			     
			     
			      //restore
			     Thread.sleep(4000);
			     driver.findElement(By.cssSelector("a[title='restore'] i[class='material-icons']")).click();
			     Alert alert7 = driver.switchTo().alert(); 
			     alert7.accept(); 
			     
			 	//publish unpublish
				    Thread.sleep(4000);
					driver.findElement(By.xpath("(//a[@title='unpublish'])[1]")).click();
					  Alert alert4 = driver.switchTo().alert(); 
					     alert4.accept(); 
					    
			     
					     driver.findElement(By.xpath("(//a[@title='edit'])[1]")).click();
						    driver.findElement(By.xpath("//div[@class='col-md-12']//input[@id='submit_step']")).click();
						    driver.findElement(By.xpath("(//span[@class='page_title_page_rw']//button[@onclick='addPage();'])[1]")).click();
						    
						    
						    //upload a photo
						    Thread.sleep(2000);
						    driver.findElement(By.xpath("//div[@class='new_grid_layer']//div[2]")).click();
						    
						   
					
							driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='image_iframe']")));
							Thread.sleep(1000);
							WebElement uploadfiles2 =driver.findElement(By.xpath("(//input[@id='upload_file'])[1]"));	
							Thread.sleep(2000);
							uploadfiles2.sendKeys("C:\\Users\\varsha\\Downloads\\arts.jpg");
							
							driver.findElement(By.xpath("(//input[@value='Upload'])[1]")).click();
							
							
							
							//upload a video
							driver.findElement(By.xpath("//div[@class='new_grid_layer']//div[7]")).click();
							driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='ui-id-1']")));
							Thread.sleep(1000);
							WebElement uploadfiles3 =driver.findElement(By.xpath("(//input[@id='upload'])[1]"));	
							Thread.sleep(2000);
							uploadfiles3.sendKeys("C:\\Users\\varsha\\Downloads\\istockphoto-1492965725-640_adpp_is.mp4");
							
							driver.findElement(By.xpath("(//input[@id='uploadButton'])[1]")).click();
							
						
						    driver.switchTo().frame(driver.findElement(By.cssSelector("#image_iframe")));
							Thread.sleep(1000);
							//to save the image 
							driver.findElement(By.cssSelector("#saveImageShow")).click();				
						    driver.findElement(By.xpath("//input[@id='submit_step']")).click();
							

	}

}
