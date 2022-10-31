package auto;

import org.testng.annotations.Test;

import base.BaseClass;


public class AutoTest extends BaseClass{
	
	@Test
	public void autoSearch() {
		homePage.autoSteps();
		aboutYou.aboutYouSteps("laptop");
		
		
		
		
	}
}
	
