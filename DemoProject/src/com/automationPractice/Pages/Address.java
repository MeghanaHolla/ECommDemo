package com.automationPractice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	
	@FindBy(name = "processAddress")
	private WebElement checkOut;
	
	public Address(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void proceedAddress() {
		checkOut.click();
	}

}
