package com.INB.pageObjects;

import org.openqa.selenium.By;

import com.INB.driver.DriverManager;
import com.INB.enums.WaitStrategy;
import com.INB.reports.ExtentLogger;

public final class RetailHomePage extends BasePage{
	private final By retailLogOut=By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]");


	public RetailHomePage clickOnLogout() throws Exception {
		//Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		click(retailLogOut,WaitStrategy.CLICKABLE ,"Logout button" );

		return this;
	}

	public RetailLogin  acceptAlert() {
		try {
			DriverManager.getDriver().switchTo().alert().accept();
			ExtentLogger.pass(" Alert accepted successfully ", true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new RetailLogin();
	}

}
