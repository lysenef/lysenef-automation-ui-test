package jp.co.rakuten.step.basket.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import jp.co.rakuten.step.basket.pages.CartPage;
import jp.co.rakuten.step.basket.utils.WebDriverUtils;

public class NoneMemberTest extends TestBase {
	
	@Test
	public void chromeRakutenShoppingBasket_test(){
		// TODO : refactoring
		// FireFox
		rakutenShoppingBasket(browsers.firefoxDriver);
		// Chrome
		rakutenShoppingBasket(browsers.chromeDriver);
		// Edge
		rakutenShoppingBasket(browsers.ieDriver);
	}
	
	private void rakutenShoppingBasket(WebDriver driver){
		CartPage cartPage = new CartPage(driver);
		cartPage.goToWithItem("https://item.rakuten.co.jp/rakuten24/e498358h/");
		assertTrue(cartPage.isTitleOnPage());
	}
}
