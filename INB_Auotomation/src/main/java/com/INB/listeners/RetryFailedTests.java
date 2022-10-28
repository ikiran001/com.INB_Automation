package com.INB.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.INB.enums.ConfigProperties;
import com.INB.utils.PropertyUtils;

public class RetryFailedTests implements IRetryAnalyzer {
	int count=0;
	int retries=1;
	public boolean retry(ITestResult result) {
		boolean value=false;

		if(PropertyUtils.get(ConfigProperties.RETRYFAILEDTESTS).equalsIgnoreCase("yes")) {
			value=count<retries;
			count++;
		}

		return value;
	}

}
