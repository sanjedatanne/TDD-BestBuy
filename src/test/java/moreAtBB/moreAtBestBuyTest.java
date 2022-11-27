package moreAtBB;

import org.testng.annotations.Test;
import base.BaseClass;

public class moreAtBestBuyTest extends BaseClass {
	 
	@Test
	public void polariodCamGift() {
		moreAtBestBuy.giftIdeas();
		moreAtBestBuy.retroGifts();
		moreAtBestBuy.polariodCamera();
		moreAtBestBuy.addToCart();
		moreAtBestBuy.goToCart();
		moreAtBestBuy.checkOut();
	}

}
