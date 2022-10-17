package com.INB.constants;

import com.INB.enums.ConfigProperties;
import com.INB.utils.PropertyUtils;

public final class FrameworkConstants {                          // final= not to extend

	private FrameworkConstants() {                               //not to create a object 

	}
	private static final String PATHTORESOURCES=System.getProperty("user.dir")+"/src/test/resources"; 
	private static final String CHROMEDRIVERPATH=PATHTORESOURCES+"/executables/chromedriver.exe";
	private static final String GECKODRIVERPATH=PATHTORESOURCES+"/executables/geckodriver.exe";
	private static final String MSEDGEDRIVERPATH=PATHTORESOURCES+"/executables/msedgedriver.exe";
	private static final String CONFIGFILEPATH=PATHTORESOURCES+"/config/config.properties";
	private static final int    EXPLICITWAIT=10;
	private static final String EXCELPATH=PATHTORESOURCES+"/excel/testData.xlsx";
	private static final String EXTENTREPORFOLDERTPATH=System.getProperty("user.dir")+"/extent-test-output";
	private static       String extentReportFilePath="";
	private static final String RUNMANAGERSHEET="RUNMANAGER";
	private static final String ITERATIONDATASHEET="DATA";

	
	public static String getFirefoxDriverPath() {
		return GECKODRIVERPATH;
	}
	
	public static String getMsedgeDriverPath() {
		return MSEDGEDRIVERPATH;
	}
	

	public static String getRunManagerSheet() {
		return RUNMANAGERSHEET;
	}

	public static String getIterationDataSheet() {
		return ITERATIONDATASHEET;
	}

	public static String getExtentReportFilePath() throws Exception {
		if(extentReportFilePath.isEmpty()) {
			extentReportFilePath=createEtentReportPath();
		}
		return extentReportFilePath;
	}

	public static String getExcelpath() {
		return EXCELPATH;
	}

	private static String createEtentReportPath() throws Exception {
		if(PropertyUtils.get(ConfigProperties.OVERRIDEREPORTS).equals("yes")) {
			return EXTENTREPORFOLDERTPATH+"/"+System.currentTimeMillis()+"/index.html";
		}
		else {
			return EXTENTREPORFOLDERTPATH+"/index.html";
		}
	}

	public static int getExplicitwait() {
		return EXPLICITWAIT;
	}
	public  static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}
	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}


}
