package Mcms.Intro;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class category extends Login {

	@Test
	public void cat() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//button[@class='form_save add_new_project']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("website_name")).sendKeys("Testcascade.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='website_url']")).sendKeys("testproject");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    driver.findElement(By.xpath("(//a[contains(text(),'Categories')])[1]")).click();
	    driver.findElement(By.id("category_name")).sendKeys("Entertainment");
	    driver.findElement(By.id("category_alias")).sendKeys("Dummycat");
	    
	    
	    // select dropdown with select tag 
	    WebElement staticDropdown= driver.findElement(By.id("category_type"));
	    Select dropdown= new Select(staticDropdown);
	    dropdown.selectByIndex(7);
	    
	    Thread.sleep(2000);
	    //driver.findElement(By.name("category_icon")).click();
	    driver.findElement(By.xpath("//input[@name='category_rss']")).clear();
	    driver.findElement(By.xpath("//input[@name='category_rss']")).sendKeys("https://api.indiatvnews.com/v3/en/qp745artfGgfgSrs9o0i/appfeed/subcategory/200");
	    driver.findElement(By.id("validate_feed")).click();
	     
        WebElement source =  driver.findElement(By.xpath("//li[@id='Articleid']")); //draggable
        WebElement target =  driver.findElement(By.id("ul_post_id"));//droppable
        
        WebElement source1 = driver.findElement(By.id("pubDate"));
	    WebElement target1 = driver.findElement(By.id("ul_published_date"));
	    
	    WebElement source2 = driver.findElement(By.xpath("(//li[@id='title'])[1]"));
	    WebElement target2 = driver.findElement(By.xpath("(//ul[@id='ul_post_title'])[1]"));

	    WebElement source3 = driver.findElement(By.id("description"));
	    WebElement target3 = driver.findElement(By.id("ul_post_content"));
	    
	    WebElement source4 = driver.findElement(By.id("fullimage"));
	    WebElement target4 = driver.findElement(By.id("ul_post_fullimage"));
	    
	    WebElement source5 = driver.findElement(By.id("link"));
	    WebElement target5 = driver.findElement(By.id("ul_share_url"));
	    
	    Thread.sleep(2000); 
	    WebElement source6 = driver.findElement(By.xpath("(//li[@id='authorname'])[1]"));
	    WebElement target6 = driver.findElement(By.xpath("(//ul[@id='ul_post_author'])[1]"));
	    
	    WebElement source8 =  driver.findElement(By.xpath("(//li[@id='tags'])[1]"));
	    WebElement target8 =  driver.findElement(By.xpath("(//ul[@id='ul_tags'])[1]"));
	    
	    WebElement source9 =  driver.findElement(By.xpath("(//li[@id='thumbimage'])[1] "));
	    WebElement target9 =  driver.findElement(By.xpath("(//ul[@id='ul_post_thumbimage'])[1] "));
	    
	    WebElement source10 = driver.findElement(By.xpath("(//li[@id='is_live_story'])[1] "));
	    WebElement target10 = driver.findElement(By.xpath("(//ul[@id='ul_live_story'])[1]"));
	    
          Actions a = new Actions(driver);
          a.dragAndDrop(source,target).build().perform();
	      a.dragAndDrop(source1,target1).build().perform();
	      a.dragAndDrop(source2,target2).build().perform();
	      a.dragAndDrop(source3,target3).build().perform();
	      a.dragAndDrop(source4,target4).build().perform();
	      a.dragAndDrop(source5,target5).build().perform();
	      a.dragAndDrop(source6,target6).build().perform();
	      a.dragAndDrop(source8,target8).build().perform();
	      a.dragAndDrop(source9,target9).build().perform();
	      a.dragAndDrop(source10,target10).build().perform();
	      
	      Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@id='submit_step']")).click();
		  
		  Alert alert = driver.switchTo().alert(); 
		     alert.accept();  
		   
		     
		   

	}

}
