package Mcms.Intro;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class checks extends Login {

	@Test
	public void checko() throws InterruptedException {

		test.pass("Go to category to edit the posts");

		driver.findElement(By.xpath("(//div[@class='sections'])[11]")).click();

		// Edit
		driver.findElement(By.xpath("//a[@href='/category/344/91761']")).click();
		driver.findElement(By.xpath("//a[@href='/postlist/344/91761']")).click();

		test.pass("pin the particluar post");

		// pin
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//img)[4]")).click();
		Alert alert6 = driver.switchTo().alert();
		alert6.accept();

		test.pass("push the notification for the post");
		// push
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@title='push notification'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='submit_step'])[1]")).click();

		test.pass("delete the post");
		// delete
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@title='delete'])[1]")).click();
		Alert alert5 = driver.switchTo().alert();
		alert5.accept();

		test.pass("restore the post");
		// restore
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("a[title='restore'] i[class='material-icons']")).click();
		Alert alert7 = driver.switchTo().alert();
		alert7.accept();

		test.pass("publish the post");
		// publish unpublish
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@title='unpublish'])[1]")).click();
		Alert alert4 = driver.switchTo().alert();
		alert4.accept();

		// Edit

//					        driver.findElement(By.xpath("(//a[@title='edit'])[1]")).click();
//						    driver.findElement(By.xpath("//div[@class='col-md-12']//input[@id='submit_step']")).click();
//						    driver.findElement(By.xpath("(//span[@class='page_title_page_rw']//button[@onclick='addPage();'])[1]")).click();
//						    

		// upload a photo
//						    Thread.sleep(2000);
//						    driver.findElement(By.xpath("//div[@class='new_grid_layer']//div[2]")).click();
//						    
//						   
//					
//							driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='image_iframe']")));
//							Thread.sleep(1000);
//							WebElement uploadfiles2 =driver.findElement(By.xpath("(//input[@id='upload_file'])[1]"));	
//							Thread.sleep(2000);
//							uploadfiles2.sendKeys("C:\\Users\\varsha\\Downloads\\arts.jpg");
//							
//							driver.findElement(By.xpath("(//input[@value='Upload'])[1]")).click();
//							
//							
//							
//							//upload a video
//							driver.findElement(By.xpath("//div[@class='new_grid_layer']//div[7]")).click();
//							driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='ui-id-1']")));
//							Thread.sleep(1000);
//							WebElement uploadfiles3 =driver.findElement(By.xpath("(//input[@id='upload'])[1]"));	
//							Thread.sleep(2000);
//							uploadfiles3.sendKeys("C:\\Users\\varsha\\Downloads\\istockphoto-1492965725-640_adpp_is.mp4");
//							
//							driver.findElement(By.xpath("(//input[@id='uploadButton'])[1]")).click();
//							
//						
//						    driver.switchTo().frame(driver.findElement(By.cssSelector("#image_iframe")));
//							Thread.sleep(1000);
//							//to save the image 
//							driver.findElement(By.cssSelector("#saveImageShow")).click();				
//						    driver.findElement(By.xpath("//input[@id='submit_step']")).click();
//						    
//						    driver.quit();
//						    driver.close();

	}

}
