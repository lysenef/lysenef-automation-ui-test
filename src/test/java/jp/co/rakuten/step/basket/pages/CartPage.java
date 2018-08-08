package jp.co.rakuten.step.basket.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage{
	@FindBy(how = How.CSS, using = "button[class=\"cart-button checkout new-cart-button \"]")
    private WebElement addToCartButton;
	
	private final WebDriver driver;
	private final WebDriverWait wait;
	private static String cartPageUrl = "https://basket.step.rakuten.co.jp/rms/mall/bs/cartall/";
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 60);
		PageFactory.initElements(driver, this);
	}
	
	public void goToWithItem(String itemUrl) {
		driver.get(itemUrl);
		wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", addToCartButton);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[data-shop-id='261122'")));
	}
	
	public void goToWithoutItem() {
		driver.get(cartPageUrl);
	}
	
	public boolean isTitleOnPage(){
		System.out.println(driver.getTitle());
		return "Øâª¤Úªª«ª´".equals(driver.getTitle());
	}
}
