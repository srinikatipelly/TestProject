package com.test.testProjectPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.master.BaseHandler;

public class NetBankLoginPage extends BaseHandler {

	// PageFactory
	@FindBy(xpath = "//iframe[@class='netbank-login']")
	WebElement netBankFrame;

	@FindBy(xpath = "//div[@class='FieldElement ']/input[@placeholder='NetBank client number']")
	WebElement netBankUser;

	@FindBy(xpath = "//div[@class='FieldElement ']/input[@placeholder='Password']")
	WebElement netBankPwd;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement netBankLogonbtn;

	// Initializing Page Objects
	public NetBankLoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String validatePageTitle() {
		return driver.getTitle();
	}

	public NetBankLoginPage enterCredentials() {
		driver.switchTo().frame(netBankFrame);
		System.out.println("--Switched to NetBank Login frame--");
		netBankUser.sendKeys("dummyUser");
		System.out.println("--Entered to NetBank Login user--");
		netBankPwd.sendKeys("dummyPwd");
		System.out.println("--Entered to NetBank Login password--");
		netBankLogonbtn.click();
		System.out.println("--Clicked on NetBank Login button--");
		return new NetBankLoginPage();
	}

}
