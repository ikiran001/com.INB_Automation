package com.INB.tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.INB.pageObjects.RetailLogin;

public final class TC_LoginRetailUser extends BaseTest{
	private TC_LoginRetailUser(){

	}

	@Test(dataProvider = "getData")
	public void LoginLogoutTest(String username,String pass) throws Exception {
		
		
		String title=new RetailLogin().enterUserName(username).enterPass(pass).getCaptchCode().clickOnLogin()
				.clickOnLogout()
				.getTitle();

		Assertions.assertThat(title)
		.isEqualTo("Login");

	}
	
	
	@Test(dataProvider = "getData")
	public void newTest(String username,String pass) throws Exception {
		
		
		String title=new RetailLogin().enterUserName(username).enterPass(pass).getCaptchCode().clickOnLogin()
				.clickOnLogout()
				.getTitle();

		Assertions.assertThat(title)
		.isEqualTo("Login");

	}

	
	@DataProvider(name="getData" , parallel=true)
	public Object [][] getData(){
		return new Object [][] {
			{"CIF1" , "Asdf@123"},
			};
	}

}
