package com.automationPractice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	
	@FindBy(id = "id_gender1")
	private WebElement gender;
	
	@FindBy(id = "customer_firstname")
	private WebElement firstName;
	
	@FindBy(id = "customer_lastname")
	private WebElement lastName;
	
	@FindBy(id = "passwd")
	private WebElement password;
	
	
	@FindBy(id = "address1")
	private WebElement address;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id = "id_state")
	private WebElement state;
	
	@FindBy(id = "postcode")
	private WebElement zipCode;
	
	@FindBy(id = "id_country")
	private WebElement country;
	
	@FindBy(id="submitAccount")
	private WebElement submit;
	
	@FindBy(id ="phone_mobile")
	private WebElement phone;
	
	public Registration(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void regiterAccount(String f_Name,String l_Name,String pass,String add_ress,String cityName,String stateName, String postCode, String countryName, String phoneNum) {
		gender.click();
		firstName.sendKeys(f_Name);
		lastName.sendKeys(l_Name);
		password.sendKeys(pass);
		address.sendKeys(add_ress);
		city.sendKeys(cityName);
		
		Select st = new Select(state);
		st.selectByVisibleText(stateName);
		
		zipCode.sendKeys(postCode);

		Select count = new Select(country);
		count.selectByVisibleText(countryName);
		
		phone.sendKeys(phoneNum);
		submit.click();
	}
}
