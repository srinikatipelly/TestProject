package com.test.testProjectPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.master.BaseHandler;

public class CommBankLandingPage extends BaseHandler {
	// PageFactory-ObjectRepository
	@FindBy(xpath = "//span[@class='icon-search']")
	WebElement searchIcon;

	@FindBy(id = "header-search-input-box")
	WebElement searchInput;

	
	@FindBy(xpath= "//a[contains(text(),'Travel Money Card')]")
	WebElement travelCardPage;
	// Initializing Page Objects
	public CommBankLandingPage() {
		PageFactory.initElements(driver, this);
	}
    //Actions
	public String validatePageTitle() {
		return driver.getTitle();
	}

	public void clickOnSearch() {
		searchIcon.click();
		System.out.println("--Clicked on Search Icon---");
	}

	public void searchFor(String str) {
		searchInput.sendKeys(str);
		System.out.println("--Searched for :"+str);
	}
	public CommBankTravelOverseasMoneyCard clickOnTravelCardPage() {
		travelCardPage.click();
		System.out.println("--Clicked on Travel Card Page---");
		return new CommBankTravelOverseasMoneyCard();
	}
}