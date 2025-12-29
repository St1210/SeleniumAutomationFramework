package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ExcelUtils;
import utils.ExtentReportManager;
import utils.LoggerUtil;

public class LoginTest extends BaseTest {
	
	@DataProvider(name="loginData")
	//DataProvider method to fetch login data from Excel
	public Object [][] getloginData () throws IOException {
		
		//Get the path of the Excel file
		String FilePath = System.getProperty("user.dir") + "/testdata/Logindata.xlsx";
				ExcelUtils.loadExcel(FilePath, "Sheet1"); 
				
				//Get the number of rows
				int rowCount = ExcelUtils.getRowCount();
				Object [][] loginData = new Object [rowCount-1][2];
				//Loop through the rows and columns to get the data
				for (int i=1; i<rowCount; i++) {
					
					//Get email and password from Excel
					loginData [i-1][0]= ExcelUtils.getCellData(i, 0); //email
					loginData [i-1][1]= ExcelUtils.getCellData(i, 1); //password
					
				}
				ExcelUtils.closeExcel();
				return loginData;
	}
	
	
	@Test(dataProvider = "loginData", priority = 1, description = "Verify that a user can log in with valid credentials")
	public void testValidLogin(String username, String password) {

		LoggerUtil.info("Starting test: testValidLogin");

		// create a new test in the report
		test = ExtentReportManager.createTest("Login Test - Valid Credentials " + username);
		test.info("Navigating to the login page");

		try {
			LoginPage loginPage = new LoginPage(driver);

			// Use valid credentials
			test.info("Adding email");
			LoggerUtil.info("Entering valid email");
			loginPage.enterEmail(username);

			// Use valid password
			test.info("Adding password");
			LoggerUtil.info("Entering valid password");
			loginPage.enterPassword(password);

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
			Assert.assertEquals(driver.getTitle(), "Just a moment...");

			test.pass("Login test with valid credentials passed.");
		} catch (AssertionError e) {
			test.fail("Login test with valid credentials failed. " + e.getMessage());
			LoggerUtil.error("Assertion failed: " + e.getMessage());
			Assert.fail(e.getMessage());
		}

	}
	
	@DataProvider(name="loginData2")
	public Object [][] getdata () {
		
		return new Object[][] {
			{"User1","Pass1"},
			{"User2","Pass2"},
			{"User3","Pass3"}
		};
		
	
	}

	@Test(dataProvider = "loginData2", priority=2, description="Verify that a user cannot log in with invalid credentials")
	public void testInvalidLogin(String username, String password) {
		
		LoggerUtil.info("Starting test: testInvalidLogin");
		
		//create a new test in the report
		test =ExtentReportManager.createTest("Login Test - Invalid Credentials" + username);
		test.info("Navigating to the login page");
		
		try {
		LoginPage LoginPage = new LoginPage(driver);
		
		// Use invalid credentials
		test.info("Adding invalid email");
		LoggerUtil.info("Entering invalid email");
		LoginPage.enterEmail(username);
		
		// Use invalid password
		test.info("Adding invalid password");
		LoggerUtil.info("Entering invalid password");
		LoginPage.enterPassword(password);
		
		// Click the login button
		test.info("Clicking the login button");
		LoggerUtil.info("Clicking the login button");
		LoginPage.clickLogin();
		
		
		String actualErrorMessage = LoginPage.getloginErrorMessage();
		//Print in console
		System.out.println("Actual Error Message: " + actualErrorMessage);
		
		//Log in Extent-Report
		test.info("Actual Error Message: " + actualErrorMessage);
		
		
		
		// Assertion for error message
		String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\r\n"
				+ "The credentials provided are incorrect";
		
		Assert.assertEquals(actualErrorMessage, expectedMessage);
		
		test.pass("Login test with invalid credentials passed.");
	
		}
		catch (AssertionError e) {
			test.fail("Login test with invalid credentials failed. " + e.getMessage());
			LoggerUtil.error("Assertion failed: " + e.getMessage());
			Assert.fail(e.getMessage());
		}
		
		
	}
}
