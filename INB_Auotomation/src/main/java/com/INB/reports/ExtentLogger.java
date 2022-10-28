package com.INB.reports;

import com.INB.enums.ConfigProperties;
import com.INB.utils.PropertyUtils;
import com.INB.utils.ScreenShotUtils;
import com.aventstack.extentreports.MediaEntityBuilder;

public final class ExtentLogger {
	
	private ExtentLogger() {
		
	}
	
	public static void pass(String message) {
		ExtentManager.getExtentTest().pass(message);
	}
	public static void fail(String message) {
		ExtentManager.getExtentTest().fail(message);
	}
	public static void skip(String message) {
		ExtentManager.getExtentTest().skip(message);
	}
	
	public static void pass(String message , boolean isScreenShotNeeded){
		if(PropertyUtils.get(ConfigProperties.PASSEDSTEPSSCREENSHOTS).equals("yes")
			&& isScreenShotNeeded){
			ExtentManager.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenShotUtils.getBased64Image()).build());
		}
		else {
			pass(message);
		}
		
	}
	
	public static void fail(String message , boolean isScreenShotNeeded)  {
		if(PropertyUtils.get(ConfigProperties.FAILEDSTEPSSCREENSHOTS).equals("yes")
			&& isScreenShotNeeded){
			ExtentManager.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenShotUtils.getBased64Image()).build());
		}
		else {
			fail(message);
		}
		
	}
	
	public static void skip(String message , boolean isScreenShotNeeded)  {
		if(PropertyUtils.get(ConfigProperties.SKIPPEDSTEPSSCREENSHOTS).equals("yes")
			&& isScreenShotNeeded){
			ExtentManager.getExtentTest().skip(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenShotUtils.getBased64Image()).build());
		}
		else {
			skip(message);
		}
		
	}
	
	
}
