package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath="//*[@class='ui header item mb5 light-black']")
	WebElement contactsLabel;
	
	@FindBy(xpath="//*[contains(text(),'New')]")
	WebElement newContacts;
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	@FindBy(xpath="//*[contains(text(),'Save')]")
	WebElement saveContact;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyContactsLable() {
		return contactsLabel.isDisplayed();
	}
	
	
	public void clickOnNewContact() {
		newContacts.click();
	}
	
	public void createNewContact(String ftName, String ltName) {
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		saveContact.click();
		
	}
	

}
