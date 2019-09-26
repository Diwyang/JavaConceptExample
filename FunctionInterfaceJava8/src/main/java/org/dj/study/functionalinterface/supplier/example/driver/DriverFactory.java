package org.dj.study.functionalinterface.supplier.example.driver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

	private static final Supplier<WebDriver> chromeSupplier = () ->{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Resources\\Chrome\\chromedriver.exe");
		return new ChromeDriver();
	};
	
	private static final Supplier<WebDriver> fireFoxSupplier = () ->{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Resources\\FireFox\\geckodriver.exe");
		return new FirefoxDriver();
	};
	
	private static final Supplier<WebDriver> IeSupplier = () ->{
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\Resources\\InternetExplorer\\IEDriverServer_x64_3.14.0.exe");
		return new InternetExplorerDriver();
	};
	
	private static final Map<String, Supplier<WebDriver>> MAP = new HashMap<>();
	
	static {
		MAP.put("Chrome",chromeSupplier);
		MAP.put("FireFox",fireFoxSupplier);
		MAP.put("Ie",IeSupplier);
		
	}
	
	public static WebDriver getDriver(String browser) {
		return MAP.get(browser).get(); 
	}
}
