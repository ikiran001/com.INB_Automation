package com.INB.tests;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.INB.annotations.FrameworkAnnotations;
import com.INB.enums.CategoryType;
import com.INB.pageObjects.RetailLogin;
import com.INB.reports.ExtentLogger;
import com.INB.reports.ExtentManager;

public final class TC_LoginRetailUser extends BaseTest{
	private TC_LoginRetailUser(){

	}
    @FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void LoginLogoutTest(Map<String ,String> data) throws Exception {


		String title=new RetailLogin().enterUserName(data.get("username")).enterPass(data.get("password")).getCaptchCode().clickOnLogin()
				.clickOnLogout().acceptAlert()
				.getTitle();

		Assertions.assertThat(title)
		.isEqualTo("Login");

	}

    @FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void newTest(Map<String ,String> data) throws Exception {
		
		String title=new RetailLogin().enterUserName(data.get("username")).enterPass(data.get("password")).getCaptchCode().clickOnLogin()
				.clickOnLogout().acceptAlert()
				.getTitle();

		Assertions.assertThat(title)
		.isEqualTo("Login");

	}




}
