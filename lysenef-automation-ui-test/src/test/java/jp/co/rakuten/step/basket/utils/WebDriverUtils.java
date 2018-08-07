package jp.co.rakuten.step.basket.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverUtils {
	public static WebDriver createChromeDriver(){
		System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--lang=jp");
		return new ChromeDriver(options);
	}
}
