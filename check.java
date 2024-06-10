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
public class check extends Login {

		
	public void subuser() throws InterruptedException {
			
	  // subuser
    
    
//		 driver.findElement(By.xpath("(//span[normalize-space()='Manage'])[1]")).click();
//	     driver.findElement(By.xpath("(//ul[contains(@class,'sub_menu_dropdown')])[1]")).click();
//	     driver.findElement(By.xpath("//a[@href='/setting/inviteuser']")).click();
//	     driver.findElement(By.xpath("//input[@id='new_user']")).sendKeys("intro@gmail.com");
//	     driver.findElement(By.xpath("//input[@id='new_user_again']")).sendKeys("intro@gmail.com");
//	     
//	    Thread.sleep(2000);
//	    WebElement staticDropdown1= driver.findElement(By.xpath(("(//select[@id='website_user_type'])[1]")));
//	    Select dropdown1= new Select(staticDropdown1);
//	    dropdown1.selectByIndex(1);
//	   
//	   driver.findElement(By.xpath("(//input[@value='344'])[1]")).click();
//	   driver.findElement(By.xpath("(//input[@value='343'])[1]")).click();
//	   driver.findElement(By.xpath("(//input[@value='330'])[1]")).click();
//	   driver.findElement(By.xpath("(//input[@value='322'])[1]")).click();
//	   
//	   driver.findElement(By.xpath("(//input[@name='submit'])[1]")).click();
//

	 
	     
	     //switch to new tab
	      driver.switchTo().newWindow(WindowType.TAB);
	   
		  driver.manage().window().maximize();
		  
		  driver.get(" https://mail.google.com/mail/u/0/#inbox");

		  driver.findElement(By.xpath("(//input[@id='identifierId'])[1]")).sendKeys("varsha.arya@mediologysoftware.com");
		  driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
		   
		  driver.findElement(By.xpath("(//input[@name='Passwd'])[1]")).sendKeys("Varsha@241118");
		  driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click(); //--- to show the passwsord 
		    
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//span[starts-with(text(),'Next')]")).click(); // click on next
	     
	     Thread.sleep(2000);
	   
	     // Inbox 
	     driver.findElement(By.xpath("(//div[@class='wT']//div[@class='aio UKr6le'])[1]")).click();   //go to inbox
	   

		   driver.findElement(By.xpath("(//tr[@jscontroller='ZdOxDb'])[2]")).click();
		   driver.findElement(By.partialLinkText("http://www.readwhere")).click();

		    
	   driver.findElement(By.xpath("(//input[@id='verifiedusersignupform-password'])[1]")).sendKeys("123456");
	   driver.findElement(By.xpath("(//input[@id='verifiedusersignupform-password_repeat'])[1]")).sendKeys("123456");
	   driver.findElement(By.xpath("(//input[@id='verifiedusersignupform-terms_accepted'])[1]")).click();
	   driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	   

	
	
	
	
	
  
	}

}
