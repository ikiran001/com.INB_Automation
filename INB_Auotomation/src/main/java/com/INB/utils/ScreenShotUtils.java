package com.INB.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.INB.driver.DriverManager;

public final class ScreenShotUtils {
	
	private ScreenShotUtils() {
		
	}
	public static String getBased64Image() {
		return ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
	}
}
