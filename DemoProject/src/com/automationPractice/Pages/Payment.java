package com.automationPractice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	@FindBy(partialLinkText = "bank wire")
	private WebElement bankWire;
	
	public Payment(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void payment() {
		bankWire.click();
	}

}
