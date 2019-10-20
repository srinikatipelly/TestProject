package com.test.testProjectPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.master.BaseHandler;

public class CommBankTravelOverseasMoneyCard extends BaseHandler {

	// PageFactory
	@FindBy(xpath = "//li[@class='logged-state-button']/a/i")
	WebElement loginBtn;

	// Initializing Page Objects
	public CommBankTravelOverseasMoneyCard() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String validatePageTitle() {
		return driver.getTitle();
	}

	public NetBankLoginPage clickOnLogin() {
		loginBtn.click();
		System.out.println("--Clicked login on CommBank Travel Overseas MoneyCard page--");
		return new NetBankLoginPage();
	}

}
