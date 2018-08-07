package jp.co.rakuten.step.basket.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import jp.co.rakuten.step.basket.pages.CartPage;
import jp.co.rakuten.step.basket.utils.WebDriverUtils;

public class NoneMemberTest {
	public CartPage cartPage;
	public WebDriver driver;
	
	@Before
	public void setUp(){
		// TODO : Refactoring
		driver = WebDriverUtils.createChromeDriver();
		cartPage = new CartPage(driver);
	}
	
	@Test
	public void chromeRakutenShoppingBasket_test(){
		cartPage.goToWithItem("https://item.rakuten.co.jp/rakuten24/e498358h/");
		assertEquals("Øâª¤Úªª«ª´",cartPage.getPageTitle());
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
}
