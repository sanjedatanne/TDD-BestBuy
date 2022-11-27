package parameterizedHomeTest;

import org.testng.annotations.Test;
import base.BaseClass;
import utils.data.AutoData;

public class HomeAutoTest extends BaseClass {

	AutoData autoData = new AutoData("laptops","25 E 104th St, New York NY", "New York", "10029");

	@Test(priority = 1)
	public void checkoutWithAutoData() {
		homePage.laptopSearch(autoData.getItem());
		homePage.zipCode(autoData.getAreaCode());
		homePage.addressInput(autoData.getHouse());
		homePage.cityInput(autoData.getCaptial());

	}

}
