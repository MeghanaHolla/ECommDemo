package com.automationPractice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmation {
	
	@FindBy(css = "#cart_navigation > button")
	private WebElement confirmOrder;
	
	public OrderConfirmation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ConfirmOrder() {
		confirmOrder.click();
	}

}
