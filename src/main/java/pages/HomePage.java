package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common.CommonWaits;
import static common.CommonActions.*;

public class HomePage {

	WebDriver driver;
	CommonWaits waits;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "gh-search-input")
	WebElement searchLaptopElement;
	@FindBy(xpath = "//button[@title= 'submit search']")
	WebElement enterSearchElement;
	@FindBy(xpath = "(//a[text() = 'HP - 15.6\" Touch-Screen Laptop - Intel Core i7 - 16GB Memory - 512GB SSD - Natural Silver']) [1]")
	WebElement clickLaptop;
	@FindBy(xpath = "(//input[@type= 'checkbox' and starts-with(@id, 'warranty-sku-')]) [3]")
	WebElement warrantyBox;
	@FindBy(css = ".c-button.c-button-primary.c-button-lg.c-button-block.c-button-icon.c-button-icon-leading.add-to-cart-button")
	WebElement addToCart;
	@FindBy(css = ".c-button.c-button-secondary.c-button-sm.c-button-block")
	WebElement goToCart;
	@FindBy(css = ".btn.btn-lg.btn-block.btn-primary")
	WebElement checkOut;
	@FindBy(xpath = "//button[@class ='c-button c-button-secondary c-button-lg cia-guest-content__continue guest']")
	WebElement continueAsGuest;
	@FindBy(xpath = "//button[@class = 'c-button-link card-call-to-action-button']")
	WebElement shipping;
	@FindBy(xpath = "//input[@name= 'firstName']")
	WebElement firstName;
	@FindBy(xpath = "//input[@name= 'lastName']")
	WebElement lastName;
	@FindBy(id = "street")
	WebElement address;
	@FindBy(xpath = "//input[@name= 'city']")
	WebElement city;
	@FindBy(xpath = "//select[@id='state']")
	WebElement selectState;
	@FindBy(xpath = "//input[@name='zipcode']")
	WebElement zip;
	@FindBy(css = ".c-button.c-button-secondary.c-button-md.new-address-form__button")
	WebElement applyInput;

	public void laptopSearch(String item) {
		click(searchLaptopElement);
		input(searchLaptopElement, item);
		waits.waitUntilVisible(enterSearchElement);
		if (isPresent(enterSearchElement) && isDisplayed(enterSearchElement)) {
			click(enterSearchElement);
		}
	}

	public void clickLaptop() {
		click(clickLaptop);
	}

	public void warranty() {
		click(warrantyBox);
	}

	public void addToCart() {
		click(addToCart);
	}

	public void goToCart() {
		click(goToCart);
	}

	public void checkOutItems() {
		click(checkOut);
	}

	public void guestCheckout() {
		click(continueAsGuest);
	}

	public void switchToShipping() {
		click(shipping);
	}

	public void inputFirstName() {
		click(firstName);
		input(firstName, "Nick");
		sleep(1);

		waits.waitUntilVisible(firstName);
		if (isPresent(firstName) && isDisplayed(firstName)) {
			click(firstName);
		}

	}

	public void inputLastName() {
		click(lastName);
		input(lastName, "John");
		sleep(1);

		waits.waitUntilVisible(lastName);
		if (isPresent(lastName) && isDisplayed(lastName)) {
			click(lastName);
		}

	}

	public void addressInput(String house) {
		click(address);
		input(address, house);
		sleep(1);

		waits.waitUntilVisible(address);
		if (isPresent(address) && isDisplayed(address)) {
			click(address);
		}

	}

	public void cityInput(String capital) {
		click(city);
		input(city, capital);
		sleep(1);

		waits.waitUntilVisible(city);
		if (isPresent(city) && isDisplayed(city)) {
			click(city);
		}

	}

	public void state() {
		click(selectState);
		sleep(1);
		if (isPresent(selectState) && isDisplayed(selectState)) {
			selectDropdown(selectState, "NY");
		}
	}

	public void zipCode(String areaCode) {
		click(zip);
		input(zip, areaCode);
		sleep(1);

		waits.waitUntilVisible(zip);
		if (isPresent(zip) && isDisplayed(zip)) {
			click(zip);
		}

	}

	public void apply() {
		click(applyInput);
	}

}
