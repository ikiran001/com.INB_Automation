package com.INB.listeners;

import java.util.Arrays;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.INB.annotations.FrameworkAnnotations;
import com.INB.reports.ExtentLogger;
import com.INB.reports.ExtentReport;

public class ListenerCLass implements ITestListener , ISuiteListener{
	
	@Override
	public void onFinish(ISuite suite) {
		
			ExtentReport.flushReport();
		
	}
	
	@Override
	public void onStart(ISuite suite) {
		
			ExtentReport.initReports();
		
	}
	
	@Override
	public void onFinish(ITestContext context) {

	}
	
	@Override
	public void onStart(ITestContext context) {

	}

	
	@Override
	public void onTestFailure(ITestResult result) {
	
			ExtentLogger.fail(result.getMethod().getMethodName()+ " is failed" , true);
			ExtentLogger.fail(result.getThrowable().toString());
			ExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));
		

	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		try {
			ExtentLogger.skip(result.getMethod().getMethodName()+ " is skipped" , true);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		ExtentReport.createTest(result.getMethod().getDescription());
		ExtentReport.addAuthor(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotations.class).author());
		ExtentReport.addCategories(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotations.class).categories());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			ExtentLogger.pass(result.getMethod().getMethodName()+ " is passed" , true);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
