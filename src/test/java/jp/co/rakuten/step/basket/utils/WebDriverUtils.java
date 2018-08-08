package jp.co.rakuten.step.basket.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverUtils {
	
	public static WebDriver createChromeDriver(){
		// TODO : move to configuration
		System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--lang=jp");
		return new ChromeDriver(options);
	}
	
	public static WebDriver createFireFoxDriver(){
		// TODO : move to configuration
		System.setProperty("webdriver.gecko.driver", "./webdriver/geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--lang=jp");
		return new FirefoxDriver(options);
	}
	
	public static WebDriver createEdgeDriver(){
		// TODO : move to configuration
		System.setProperty("webdriver.edge.driver", "./webdriver/MicrosoftWebDriver.exe");
		return new EdgeDriver();
	}
	
	// TODO : Add to remote driver for selenium hub
}
