package com.INB.pageObjects;

import org.openqa.selenium.By;

import com.INB.enums.WaitStrategy;

public final class RetailHomePage extends BasePage{
	private final By retailLogOut=By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]");


	public RetailLogin clickOnLogout() throws Exception {
		//Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		click(retailLogOut,WaitStrategy.PRESENCE ,"Logout button");
		acceptAlert();
		return new RetailLogin();

	}

}
