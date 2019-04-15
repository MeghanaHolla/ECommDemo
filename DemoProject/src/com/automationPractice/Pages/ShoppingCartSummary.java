package com.automationPractice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartSummary {
	
	@FindBy(linkText = "Proceed to checkout")
	private WebElement checkOut;
	
	public ShoppingCartSummary(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void checkOutProduct() {
		checkOut.click();
		
	}

}
