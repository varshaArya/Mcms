package Mcms.Intro;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Login {

	protected WebDriver driver;

	protected ExtentTest test;

	protected ExtentReports extent;

	@BeforeSuite
	public void setup() {

		// Create a timestamp for the report file name
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String timestamp = dateFormat.format(new Date());

		// Define the report file path with the timestamp
		@SuppressWarnings("unused")
		String reportFileName = "extent-report-" + timestamp + ".html";
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("report.html");
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);

		// Create a test
		ExtentTest test = extent.createTest("Check Extent Report");

		// Add test information
		test.pass("Test Step 1");
		test.pass("Test Step 2");

	}

	@BeforeMethod
	public void beforeTest() {
		test = extent.createTest(this.getClass().getSimpleName());
	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, "Test Failed: " + result.getThrowable());
		}
	}

	@Test
	public void log() throws InterruptedException {

		// init();
		// test1 = extent.createTest("MyFirstTest");

		// System.setProperty("webdriver.chrome.driver","C:\\Users\\varsha\\Documents\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		test.log(Status.INFO, "Login successfull");

		driver.get("https://publisherv6-mcms.readwhere.app/auth/handshake");
		driver.manage().window().maximize();
		driver.get("https://publisherv6-mcms.readwhere.app/auth/handshake");
		test.pass("login");
		WebElement framet1 = driver.findElement(By.className("FB_UI_Dialog"));
		driver.switchTo().frame(framet1);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("resend")).sendKeys("pawas@mediologysoftware.com");
		driver.findElement(By.id("signinform-password")).sendKeys("123");

		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

	}

	@AfterSuite
	public void afterSuite() {

		extent.flush();
	}

}
