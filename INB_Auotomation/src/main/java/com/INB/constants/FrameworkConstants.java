package com.INB.constants;

import java.util.Map;

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
	private static final String ITERATIONDATASHEET="RETAIL_DATA";
	private static final String TESTCASENAME="Test Case Name";
	private static final String EXECUTE="Execute";
	private static final String BROWSER="Browser";
	private static final String PRIORITY="Priority";
	private static final String COUNT="Count";
	private static final String TESTDESCRIPTION="Test Description";
	private static final String USERNAME="";
	private static final String PASSWORD="";


	public static String getPassword(Map<String , String> data) {

		if(PASSWORD.isEmpty()) {
			return data.get("data2");
		}
		return "";
	}


	public static String getUserName(Map<String , String> data) {
		if(USERNAME.isEmpty()) {
			return data.get("data1");
		}
		return "";
	}


	public static String getTestDescription() {
		return TESTDESCRIPTION;
	}

	private static String createEtentReportPath()  {
		if(PropertyUtils.get(ConfigProperties.OVERRIDEREPORTS).equals("yes")) {
			return EXTENTREPORFOLDERTPATH+"/"+System.currentTimeMillis()+"/index.html";
		}
		else {
			return EXTENTREPORFOLDERTPATH+"/index.html";
		}
	}


	public static String getExtentReportFilePath()  {
		if(extentReportFilePath.isEmpty()) {
			extentReportFilePath=createEtentReportPath();
		}
		return extentReportFilePath;
	}

	public static String getExcelpath() {
		return EXCELPATH;
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
	public static String getCountDetails() {
		return COUNT;
	}
	public static String getPriorityDetails() {
		return PRIORITY;
	}

	public static String getBrowserDetails() {
		return BROWSER;
	}

	public static String getExecuteDetails() {
		return EXECUTE;
	}
	public static String getTestCaseName() {
		return TESTCASENAME;
	}
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


}
