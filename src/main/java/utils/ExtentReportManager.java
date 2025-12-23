package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
	
	private static ExtentReports extent;
	private static ExtentTest test;
	
	// Method to get ExtentReports instance
	public static ExtentReports getReportInstance() {
		if (extent == null) {
			// Create timestamp for report file name to ensure uniqueness
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			// Define report path with timestamp to avoid overwriting
			String reportPath = "reports/ExtentReport_" + timestamp + ".html";
			// initialize ExtentReports and attach reporter
			ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
			
			// Create ExtentReports instance
			reporter.config().setDocumentTitle("Automation Test Report");
			reporter.config().setReportName("Test Execution Report");
			
			extent = new ExtentReports();
			extent.attachReporter(reporter);
			
		}
		return extent;
		
	}
	
	// Method to create a test in the report
	public static ExtentTest createTest(String testName) {
		test = getReportInstance().createTest(testName);
		return test;
	}

	// Method to capture screenshot
	public static String captureScreenshot(WebDriver driver, String screenshotName) {
		
		try {
			
			// craete file to store screenshot
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			// define destination path
			String path = System.getProperty("user.dir") + "/screenshots/" + screenshotName + ".png";
			
			System.out.println("Screenshot path: " + path);
			
			FileUtils.copyFile(src, new File(path));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		return null;
	}
}
