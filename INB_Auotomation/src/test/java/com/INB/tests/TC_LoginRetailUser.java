package com.INB.tests;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.INB.pageObjects.RetailLogin;
import com.INB.utils.DataProviderUtils;

public final class TC_LoginRetailUser extends BaseTest{
	private TC_LoginRetailUser(){

	}

	@Test(dataProvider = "getData" , dataProviderClass = DataProviderUtils.class)
	public void LoginLogoutTest(Map<String ,String> data) throws Exception {
		
		
		String title=new RetailLogin().enterUserName(data.get("username")).enterPass(data.get("password")).getCaptchCode().clickOnLogin()
				.clickOnLogout()
				.getTitle();

		Assertions.assertThat(title)
		.isEqualTo("Login");

	}
	
	
	@Test(dataProvider = "getData" , dataProviderClass = DataProviderUtils.class)
	public void newTest(Map<String ,String> data) throws Exception {
		
		
		String title=new RetailLogin().enterUserName(data.get("username")).enterPass(data.get("password")).getCaptchCode().clickOnLogin()
				.clickOnLogout()
				.getTitle();

		Assertions.assertThat(title)
		.isEqualTo("Login");

	}

	
	

}
