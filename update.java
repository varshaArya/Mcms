package Mcms.Intro;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class update extends Login {


	public void Update() throws InterruptedException { 
	   
	    //update
	     
        Thread.sleep(2000);
	 	driver.findElement(By.xpath("//a[@href='/category/344/91761']")).click();
        driver.findElement(By.xpath("//button[@id='submit_step']")).click();
	    Alert alert1 = driver.switchTo().alert(); 
 	    alert1.accept(); 
	 	     
	 	     
	 	  //Delete
	 	     
        Thread.sleep(2000);
	 	driver.findElement(By.xpath("//a[@href='/category/344/91778']")).click();
    
	 	driver.findElement(By.xpath("//button[contains(@id,'delete_step')]")).click();
	 	Thread.sleep(2000);
        Alert alert2 = driver.switchTo().alert(); 
        alert2.accept();
        Alert alert3 = driver.switchTo().alert(); 
        alert3.accept();
	 	     
	 	     

	}

}
