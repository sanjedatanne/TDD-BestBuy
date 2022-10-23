package base;

import static utils.Constant.IMPLICIT_WAIT;
import static utils.Constant.PAGELOAD_WAIT;
import static utils.Constant.URL;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Configuration;

public class BaseClass {
	
	Configuration config = new Configuration();
	WebDriver driver;
	
	@BeforeMethod
	public void setUpDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(config.getProperty((URL.name())));
		long pageLoadTime = Long.parseLong(config.getProperty(PAGELOAD_WAIT.name()));
		long implicitWait = Long.parseLong(config.getProperty(IMPLICIT_WAIT.name()));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
		
	}
	
		public WebDriver getDriver() {
			return driver;
			
		}
	
		@AfterMethod
		public void closingDriverSession() {
			getDriver().quit();
		}
		
	}



