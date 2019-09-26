package org.dj.study.functionalinterface.supplier.example;

import org.dj.study.functionalinterface.supplier.example.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestWebDriver {
	
	private WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setDriver(@Optional("Ie") String browser) {
		this.driver = DriverFactory.getDriver(browser);
	}

	
	@Test
	public void googleTest() {
		this.driver.get("http://www.google.com");
	}
	
	@AfterTest
	public void afterTest() {
		this.driver.quit();
	}
}
