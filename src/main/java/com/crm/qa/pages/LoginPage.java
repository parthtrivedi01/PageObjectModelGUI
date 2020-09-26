package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory - OR
	
		@FindBy(name="email")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//*[text()='Login']")
		WebElement loginBtn;
		
		@FindBy(xpath="//a[contains(.,'Sign up')]")
		WebElement signLink;
		
		//Initilizing Page Object
		
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		
		public String validateLoginPageTitle() {
			return driver.getTitle();
		}
		
		public HomePage login(String un, String pwd) {
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
			return new HomePage();
		}

}
