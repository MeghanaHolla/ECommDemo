package com.automationPractice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {

	@FindBy(id="cgv")
	private WebElement tcAgree;
	
	@FindBy(name="processCarrier")
	private WebElement proceedPay;
	
	public Shipping(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void agreeTAndC() {
		tcAgree.click();
		
		proceedPay.click();
	}
}
