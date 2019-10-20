package org.com.test.testProject;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;*/

import com.test.master.BaseHandler;
import com.test.testProjectPages.CommBankLandingPage;
import com.test.testProjectPages.CommBankTravelOverseasMoneyCard;
import com.test.testProjectPages.NetBankLoginPage;

public class CommBankTest extends BaseHandler {
	CommBankLandingPage landingPage;
	CommBankTravelOverseasMoneyCard commBankTravelOverseasMoneyCardPage;
	NetBankLoginPage netBankLoginPage;
	
	public CommBankTest() {
		super();
	}

	@Before
	public void setup() {
		initialization();
		landingPage = new CommBankLandingPage();
		commBankTravelOverseasMoneyCardPage = new CommBankTravelOverseasMoneyCard();
		netBankLoginPage = new NetBankLoginPage();
	}
	
	@Test
	public void commBankTest() {
		String title = landingPage.validatePageTitle();
		landingPage.clickOnSearch();
		landingPage.searchFor("Travel");
		landingPage.clickOnTravelCardPage();
		if(commBankTravelOverseasMoneyCardPage.validatePageTitle().contains("Travel Money Card")) {
			System.out.println("--Asserted the page title---");
			commBankTravelOverseasMoneyCardPage.clickOnLogin();
			netBankLoginPage.enterCredentials();
		}
		
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
}
