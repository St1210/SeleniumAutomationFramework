package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ExtentReportManager;
import utils.LoggerUtil;

public class LoginTest extends BaseTest {
	
	@Test(priority=1, description="Verify that a user can log in with valid credentials")
	public void testValidLogin() {
		
		LoggerUtil.info("Starting test: testValidLogin");
		
	//create a new test in the report
		test =ExtentReportManager.createTest("Login Test - Valid Credentials");
		test.info("Navigating to the login page");
		
		try {		
			LoginPage loginPage = new LoginPage(driver);
		
		
		// Use valid credentials
		test.info("Adding email");
		LoggerUtil.info("Entering valid email");
		loginPage.enterEmail("admin@yourstore.com");
		
		// Use valid password
		test.info("Adding password");
		LoggerUtil.info("Entering valid password");
		loginPage.enterPassword("admin");
		
		// Check the "Remember Me" checkbox
		test.info("Checking 'Remember Me' checkbox");
		LoggerUtil.info("Checking 'Remember Me' checkbox");
		loginPage.checkRememberMe();
		
		// Click the login button
		test.info("Clicking the login button");
		LoggerUtil.info("Clicking the login button");
		loginPage.clickLogin();
		
		System.out.println("Title of the page : " + driver.getTitle());
		
		test.info("Verifying the page title");
		LoggerUtil.info("Verifying the page title ");
		Assert.assertEquals(driver.getTitle(),"Just a moment...123");
		
		test.pass("Login test with valid credentials passed.");
		}
		catch (AssertionError e) {
			test.fail("Login test with valid credentials failed. " + e.getMessage());
			LoggerUtil.error("Assertion failed: " + e.getMessage());
			Assert.fail(e.getMessage());
		}
		
	}	

}
