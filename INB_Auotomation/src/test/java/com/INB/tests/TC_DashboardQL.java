package com.INB.tests;

import java.util.Map;

import org.testng.annotations.Test;

import com.INB.annotations.FrameworkAnnotations;
import com.INB.constants.FrameworkConstants;
import com.INB.enums.CategoryType;
import com.INB.pageObjects.RetailHome;
import com.INB.pageObjects.RetailLogin;
import com.INB.pageObjects.RetailQuickLinks;

public final class TC_DashboardQL extends BaseTest {

	private TC_DashboardQL(){
	}


	@FrameworkAnnotations(author = { "Kiran" }, categories = { CategoryType.REGRESSION })
	@Test
	public void quickLinksCheck(Map<String , String> data) {
		new RetailLogin()

		.loginToTheApp(FrameworkConstants.getUserName(data),FrameworkConstants.getPassword(data));

		new RetailQuickLinks().clickOnqlMyAccount().clickOnqlProfile()
		.clickOnEservices().clickOnRequest().clickOnEnquiry()

		.logoutApp();
	}


	@FrameworkAnnotations(author = { "Kiran" }, categories = { CategoryType.REGRESSION })
	@Test
	public void profileLinksMH(Map<String , String> data) {
		new RetailLogin()

		.loginToTheApp(FrameworkConstants.getUserName(data),FrameworkConstants.getPassword(data));

		new RetailQuickLinks().mouseHoverProfileName().clickOnchangeLoginPass().mouseHoverProfileName().clickOnChangeProfilePass()
		.mouseHoverProfileName().clickOnResetProfilePass().mouseHoverProfileName().clickOnMyProfile()

		.logoutApp();
	}

	@FrameworkAnnotations(author = { "Kiran" }, categories = { CategoryType.REGRESSION })
	@Test
	public void profileLinksClick(Map<String , String> data) {
		new RetailLogin()

		.loginToTheApp(FrameworkConstants.getUserName(data),FrameworkConstants.getPassword(data));

		new RetailQuickLinks().clickOnProfileName().clickOnChangeLoginPassCL().clickOnProfileName()
		.clickOnChangeProfilePassCL().clickOnProfileName().clickOnForgotPassCL()
		.clickOnProfileName().clickOnMyProfileCL()

		.logoutApp();




	}




}
