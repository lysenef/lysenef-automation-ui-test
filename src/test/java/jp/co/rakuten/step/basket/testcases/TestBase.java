package jp.co.rakuten.step.basket.testcases;

import org.junit.*;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.saucelabs.junit.ConcurrentParameterized;
import com.saucelabs.junit.SauceOnDemandTestWatcher;

import jp.co.rakuten.step.basket.utils.WebDriverUtils;

import java.net.URL;
import java.util.LinkedList;

import com.saucelabs.common.SauceOnDemandAuthentication;
import com.saucelabs.common.SauceOnDemandSessionIdProvider;

public class TestBase {
	
	public static class Browsers {
		protected WebDriver firefoxDriver;
	    protected WebDriver chromeDriver;
	    protected WebDriver ieDriver;
	    protected WebDriver safariDriver;
	    
	    public Browsers(){
	    	if(firefoxDriver == null){
	    		firefoxDriver = WebDriverUtils.createFireFoxDriver();
	    	}
	    	if(chromeDriver == null){
	    		chromeDriver = WebDriverUtils.createChromeDriver();
	    	}
	    	if(ieDriver == null){
	    		ieDriver = WebDriverUtils.createEdgeDriver();
	    	}
	    	if(safariDriver == null){
	    		safariDriver = null;
	    	}
	    }
	}
	
	protected Browsers browsers;
    
    @Before
    public void setUp() throws Exception {
    	browsers = new Browsers();
    }

    @After
    public void tearDown() throws Exception {
    	browsers.chromeDriver.quit();
    	browsers.firefoxDriver.quit();
    	browsers.ieDriver.quit();
    }
}
