package home;

import org.testng.annotations.Test;



import base.BaseClass;

public class HomeTest extends BaseClass {

	@Test(priority = 1, enabled = true)
	public void laptopCheckout() {
		
		homePage.laptopSearch();
		homePage.clickLaptop();
		homePage.warranty();
		homePage.addToCart();
		homePage.goToCart();
		homePage.checkOutItems();
		homePage.guestCheckout();
		homePage.switchToShipping();
		homePage.inputFirstName();
		homePage.inputLastName();
		homePage.addressInput();
		homePage.cityInput();
		homePage.state();
		homePage.zipCode();
		homePage.apply();
		
	}
		
	}
