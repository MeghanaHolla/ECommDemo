package com.automationPractice.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationPractice.Pages.*;

import utils.GenericMethods;

public class PlaceOrderTest extends Base{
	
	@Test
	public void placeOrder() throws IOException {
		Address ad = new Address(driver);
		Home home = new Home(driver);
		OrderComplete oc = new OrderComplete(driver);
		Payment pay = new Payment(driver);
		Registration reg = new Registration(driver);
		Shipping ship = new Shipping(driver);
		ShoppingCartSummary sc = new ShoppingCartSummary(driver);
		SignIn sn = new SignIn(driver);
		OrderConfirmation oConf = new OrderConfirmation(driver);
		
		String[][] data = GenericMethods.getData("ECommTestData.xlsx", "Sheet1");
		
		home.addProduct(driver);
		sc.checkOutProduct();
		sn.createAccount(data[1][0]);
		
		reg.regiterAccount(data[1][1], data[1][2], data[1][3], data[1][4], data[1][5], data[1][6], data[1][8], data[1][7], data[1][9]);
		
		ad.proceedAddress();
		
		ship.agreeTAndC();
		
		pay.payment();
		
		oConf.ConfirmOrder();
		
		String actualMsg = oc.completeOrder().getText();
		String expectedMsg = "Your order on My Store is complete.";
		Assert.assertEquals(actualMsg, expectedMsg);
		
		oc.signOut();
		
	}
	

}
