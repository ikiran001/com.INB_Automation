package com.INB.driver;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import com.INB.constants.FrameworkConstants;
import com.INB.enums.ConfigProperties;
import com.INB.utils.PropertyUtils;

public final class Driver {
	private Driver() {

	}
	public static void initDriver(String browser) throws Exception {
		
		if (Objects.isNull(DriverManager.getDriver())) {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
				DriverManager.setDriver(new ChromeDriver());
			}

			else if(browser.equalsIgnoreCase("microedge")) {
				System.setProperty("webdriver.edge.driver", FrameworkConstants.getMsedgeDriverPath());
				DriverManager.setDriver(new EdgeDriver());
			}

			DriverManager.getDriver().manage().window().maximize();
			DriverManager.getDriver().get(PropertyUtils.get(ConfigProperties.URL));

		}}

	public static void quitDriver() {
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}
}
