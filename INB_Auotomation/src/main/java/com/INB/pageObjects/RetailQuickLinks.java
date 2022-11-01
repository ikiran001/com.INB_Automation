package com.INB.pageObjects;

import org.openqa.selenium.By;

import com.INB.enums.WaitStrategy;

public class RetailQuickLinks extends BasePage{

	private final By qlMyAccount=By.xpath("/html/body/section/div/div/div[2]/ul/li[1]/a");
	private final By qlProfile=By.xpath("/html/body/section/div/div/div[2]/ul/li[2]/a");
	private final By qlEservices=By.xpath("/html/body/section/div/div/div[2]/ul/li[3]/a");
	private final By qlRequest=By.xpath("/html/body/section/div/div/div[2]/ul/li[4]/a");
	private final By qlEnquiry=By.xpath("/html/body/section/div/div/div[2]/ul/li[5]/a");

	private final By profileNameMH=By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a");
	private final By changeLoginPassMH=By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/ul/li[1]");
	private final By changeProfilePassMH=By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/ul/li[2]/a");
	private final By resetProfilePassMH=By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/ul/li[3]/a");
	private final By myProfileMH=By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/ul/li[4]/a");




	public RetailQuickLinks mouseHoverProfileName() {
		mouseHover(profileNameMH, WaitStrategy.PRESENCE, "Profile Name");
		return this;
		
	}

	public RetailQuickLinks clickOnchangeLoginPass() {
		click(changeLoginPassMH, WaitStrategy.PRESENCE , "Change Login Pass");
		return this;
	}

	public RetailQuickLinks clickOnChangeProfilePass() {
		click(changeProfilePassMH, WaitStrategy.PRESENCE, "Change PRofile Pass");
		return this;
	}

	public RetailQuickLinks clickOnResetProfilePass() {
		click(resetProfilePassMH, WaitStrategy.PRESENCE, "Reset Profile Pass");
		return this;
	}

	public RetailHome clickOnMyProfile() {
		click(myProfileMH, WaitStrategy.PRESENCE, "My Profile ");
		return new RetailHome();
	}
	public RetailQuickLinks clickOnqlMyAccount() {
		click(qlMyAccount, WaitStrategy.CLICKABLE, "My Account ");
		return this;
	}

	public RetailQuickLinks clickOnqlProfile() {
		click(qlProfile, WaitStrategy.CLICKABLE, "Profile ");
		return this;
	}

	public RetailQuickLinks clickOnEservices() {
		click(qlEservices, WaitStrategy.CLICKABLE, "E-Services");
		return this;
	}

	public RetailQuickLinks clickOnRequest() {
		click(qlRequest, WaitStrategy.CLICKABLE	, "Request ");
		return this;
	}

	public RetailHome clickOnEnquiry() {
		click(qlEnquiry, WaitStrategy.CLICKABLE, "Enquiry");
		return new RetailHome();
	}
}



