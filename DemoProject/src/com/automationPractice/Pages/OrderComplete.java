package com.automationPractice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderComplete {
	
	@FindBy(css = "#center_column > div > p > strong")
	private WebElement orderComplete;
	
	
	@FindBy(linkText= "Sign out")
	private WebElement signOut;
	
	
	public OrderComplete(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement completeOrder() {
		return orderComplete;
	}

	public void signOut() {
		signOut.click();
	}
}
