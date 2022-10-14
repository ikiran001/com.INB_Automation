package com.INB.constants;

public final class FrameworkConstants {                          // final= not to extend

	private FrameworkConstants() {                               //not to create a object 

	}
	private static final String CHROMEDRIVERPATH=System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe";

	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}
}
