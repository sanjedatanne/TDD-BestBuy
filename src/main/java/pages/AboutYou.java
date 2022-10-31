package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;
 
public class AboutYou {
	
	public AboutYou(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@class='c-button-link visibility-hidden visibility-hidden-focusable']")
	WebElement dobElement;
	@FindBy(xpath = "///button[@class= 'c-button-unstyled hamburger-menu-button']")
	WebElement nextElement;
	@FindBy(xpath = "//input[@name = 'st']")
	WebElement letsSpeedUpElement;
	@FindBy(id = "header-clear-search-icon")
	WebElement noElement;
	@FindBy(xpath = "//button[@id= 'ghp-tabs-tab']")
	WebElement nextElement2;
	
	
	public void aboutYouSteps(String dob) {
		if(isPresent(letsSpeedUpElement) && isDisplayed(letsSpeedUpElement)) {
			click(noElement);
			click(nextElement2);
		}
		input(dobElement, dob);
		click(nextElement);
	}
}

