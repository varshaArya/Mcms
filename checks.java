package Mcms.Intro;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class checks extends Login {

	@Test
	public void checko() throws InterruptedException {

	

		driver.findElement(By.xpath("(//div[@class='sections'])[11]")).click();

		// Edit
		driver.findElement(By.xpath("//a[@href='/category/344/91761']")).click();
		driver.findElement(By.xpath("//a[@href='/postlist/344/91761']")).click();

		

		// pin
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//img)[4]")).click();
		Alert alert6 = driver.switchTo().alert();
		alert6.accept();

		
		// push
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@title='push notification'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='submit_step'])[1]")).click();

		
		// delete
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@title='delete'])[1]")).click();
		Alert alert5 = driver.switchTo().alert();
		alert5.accept();


		// restore
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("a[title='restore'] i[class='material-icons']")).click();
		Alert alert7 = driver.switchTo().alert();
		alert7.accept();

		
		// publish unpublish
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@title='unpublish'])[1]")).click();
		Alert alert4 = driver.switchTo().alert();
		alert4.accept();
		
		driver.close();
		driver.quit();


                             
	}

}
