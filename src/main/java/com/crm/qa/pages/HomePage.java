package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	//Object Repository - OR
	
	@FindBy(xpath="//*[contains(text(),'Parth T')]")
	WebElement userNameLable;
	
	@FindBy(xpath="//a[contains(@href,'/contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(@href,'/deals')]")
	WebElement dealsLink;
	
	//Initilize Constructor
	
	public HomePage() {		
		PageFactory.initElements(driver, this);
	}
	
	//Actions on WebElements
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyUserName() {
		return userNameLable.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLink() {
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();
	}
	
	

}
