package home;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import base.BaseClass;

public class HomeTest extends BaseClass {

	@Test(priority = 1, enabled = true)
	public void laptopCheckout() {

		homePage.laptopSearch("laptops");
		homePage.clickLaptop();
		homePage.warranty();
		homePage.addToCart();
		homePage.goToCart();
		homePage.checkOutItems();
		homePage.guestCheckout();
		homePage.switchToShipping();
		homePage.inputFirstName();
		homePage.inputLastName();
		homePage.addressInput("25 E 104th St, New York NY");
		homePage.cityInput("New York");
		homePage.state();
		homePage.zipCode("10029");
		homePage.apply();

	}

	@Parameters({ "house", "capital", "areaCode" })
	@Test(enabled = false)
	public void homePageParameter(String item, String house, String capital, String areaCode) {
		homePage.laptopSearch(item);
		homePage.addressInput(house);
		homePage.cityInput(capital);
		homePage.zipCode(areaCode);

	}
}
