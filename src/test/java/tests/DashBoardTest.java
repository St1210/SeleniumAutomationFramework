package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DashBoardPage;

public class DashBoardTest extends BaseTest{

	@Test(description="Verify that the dashborad page is displayed")
	
	public void verifyDashBoardIsDisplayed() {
		
		DashBoardPage dashBoardPage = new DashBoardPage(driver);
		
		//verify DashBoard header 
		Assert.assertTrue(dashBoardPage.isDashboardDisplayed(),"DashBoard header is not displayed");
		
		//Verify Logout option
		Assert.assertTrue(dashBoardPage.isLogoutVisible(),"Logout link is not visible");
		
	}
	
}



