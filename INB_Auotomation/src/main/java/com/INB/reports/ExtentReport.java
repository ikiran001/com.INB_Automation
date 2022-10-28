package com.INB.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.INB.constants.FrameworkConstants;
import com.INB.enums.CategoryType;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public final class ExtentReport {
	private ExtentReport(){ 
	}
	private static ExtentReports extent;


	public static void initReports()  {
		if(Objects.isNull(extent)) {
			extent=new ExtentReports();
			ExtentSparkReporter spark=new ExtentSparkReporter(FrameworkConstants.getExtentReportFilePath());

			extent.attachReporter(spark);
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("INB Report");
			spark.config().setReportName("INB AUTOMATION REPORT BY KIRAN");
		}
	}

	public static void flushReport()  {
		if(Objects.nonNull(extent)) {
			extent.flush();
		}
	
		try {
			ExtentManager.unload();
			Desktop.getDesktop().browse(new File(FrameworkConstants.getExtentReportFilePath()).toURI());
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void createTest(String testCaseName) {
		ExtentTest test=extent.createTest(testCaseName);
		ExtentManager.setExtentTest(test);
	}


	public static void addAuthor(String[] authors) {
		for(String temp: authors)
			ExtentManager.getExtentTest().assignAuthor(temp);
	}
	public static void addCategories(CategoryType[] categories) {
		for(CategoryType temp: categories)
			ExtentManager.getExtentTest().assignCategory(temp.toString());
	}
}
