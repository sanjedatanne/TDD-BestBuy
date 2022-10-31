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
	

	/*
	 * EXAMPLE  USING CONTINUE ELEMENT FACTOR:
	 * By continuElementBy = By.xpath("(//input[@value='Continue'])[1]");
	 * driver.findElement(continuElementBy) ==
	 * driver.findElement(By.xpath("(//input[@value='Continue'])[1]"))
	 */

	public void autoSteps() {
		input(searchLaptopElement, "laptops");
		click(enterSearchElement);
	

		waits.waitUntilVisible(enterSearchElement);
		if (isPresent(enterSearchElement) && isDisplayed(enterSearchElement)) {
			click(enterSearchElement);
		}
	}

	}

