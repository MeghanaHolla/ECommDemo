package com.automationPractice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	@FindBy(linkText = "T-SHIRTS")
	private WebElement tshirts;
	
	@FindBy(css="#center_column > ul > li > div > div.right-block > span > span")
	private WebElement inStock;
	
	@FindBy(css="#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span")
	private WebElement addToCart;
	
	@FindBy(css= "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span")
	private WebElement proceedToCheckOut;
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void addProduct(WebDriver driver) {
		tshirts.click();
		Actions hover = new Actions(driver);
		hover.moveToElement(addToCart).perform();
		proceedToCheckOut.click();
	}

}
