package com.INB.reports;

import java.awt.Desktop;
import java.io.File;
import java.util.Objects;

import com.INB.constants.FrameworkConstants;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public final class ExtentReport {
	private ExtentReport(){ 
	}
	private static ExtentReports extent;


	public static void initReports() throws Exception {
		if(Objects.isNull(extent)) {
			extent=new ExtentReports();
			ExtentSparkReporter spark=new ExtentSparkReporter(FrameworkConstants.getExtentReportFilePath());

			extent.attachReporter(spark);
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("INB Report");
			spark.config().setReportName("INB AUTOMATION REPORT BY KIRAN");
		}
	}

	public static void flushReport() throws Exception {
		if(Objects.nonNull(extent)) {
			extent.flush();
		}
		ExtentManager.unload();
		Desktop.getDesktop().browse(new File(FrameworkConstants.getExtentReportFilePath()).toURI());
	}

	public static void createTest(String testCaseName) {
		ExtentTest test=extent.createTest(testCaseName);
		ExtentManager.setExtentTest(test);
	}


}
