package com.INB.listeners;

import java.io.IOException;import java.util.Arrays;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.INB.reports.ExtentLogger;
import com.INB.reports.ExtentReport;

public class ListenerCLass implements ITestListener , ISuiteListener{

	public void onFinish(ISuite suite) {
		try {
			ExtentReport.flushReport();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void onStart(ISuite suite) {
		try {
			ExtentReport.initReports();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void onFinish(ITestContext context) {

	}

	public void onStart(ITestContext context) {

	}


	public void onTestFailure(ITestResult result) {
		try {
			ExtentLogger.fail(result.getMethod().getMethodName()+ " is failed" , true);
			ExtentLogger.fail(result.getThrowable().toString());
			ExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {
		try {
			ExtentLogger.skip(result.getMethod().getMethodName()+ " is skipped" , true);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void onTestStart(ITestResult result) {
		ExtentReport.createTest(result.getMethod().getDescription());
	}

	public void onTestSuccess(ITestResult result) {
		try {
			ExtentLogger.pass(result.getMethod().getMethodName()+ " is passed" , true);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
