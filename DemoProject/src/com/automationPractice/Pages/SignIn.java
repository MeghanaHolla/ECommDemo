package com.automationPractice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	
	@FindBy(id = "email_create")
	private WebElement emailID;
	
	@FindBy(id="SubmitCreate")
	private WebElement createAcc;
	
	
	public SignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void createAccount(String emailAddress) {
		emailID.sendKeys(emailAddress);
		createAcc.click();
	}

}
