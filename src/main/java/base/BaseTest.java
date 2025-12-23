package base;

import org.bouncycastle.util.test.TestResult;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import utils.ExtentReportManager;
import utils.LoggerUtil;

public class BaseTest {

	protected WebDriver driver;
	protected WebDriverWait wait;
	protected static ExtentReports extent;
	protected ExtentTest test;
	
	@BeforeSuite
	public void setupReport() {
		extent = ExtentReportManager.getReportInstance();
	}
	@AfterSuite
	public void tearDownReport() {
		extent.flush();
		
	}
	
	@BeforeMethod
	public void setup() {

		LoggerUtil.info("Setting up the WebDriver");
		// Initialize WebDriver and WebDriverWait here

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

		LoggerUtil.info("Navigating to the login page");

		driver.get("https://admin-demo.nopcommerce.com/login");

	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		
		// Capture screenshot on failure
		if (result.getStatus()== ITestResult.FAILURE) {
			String screenshotPath = ExtentReportManager.captureScreenshot(driver, "Login Failure");
			System.out.println("Screenshot captures, Path: " + screenshotPath);
		// Attach screenshot to the report
			test.fail("Test Failed. Screenshot Attached.", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
			
		}
		
		// Close the browser
		if (driver != null) {
			LoggerUtil.info("Closing the browser");
			driver.quit();
		}
	}
}
