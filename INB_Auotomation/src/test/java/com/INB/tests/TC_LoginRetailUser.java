package com.INB.tests;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.INB.annotations.FrameworkAnnotations;
import com.INB.enums.CategoryType;
import com.INB.pageObjects.RetailLogin;

public final class TC_LoginRetailUser extends BaseTest{
	private TC_LoginRetailUser(){

	}
    @FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void TC00(Map<String ,String> data) throws Exception {


		String title=new RetailLogin().enterUserName(data.get("data1")).enterPass(data.get("data2")).getCaptchCode().clickOnLogin()
				.clickOnLogout().acceptAlert()
				.getTitle();

		Assertions.assertThat(title)
		.isEqualTo("Login");
		

	}

    @FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void newTest(Map<String ,String> data) throws Exception {
		
		String title=new RetailLogin().enterUserName(data.get("data1")).enterPass(data.get("data2")).getCaptchCode().clickOnLogin()
				.clickOnLogout().acceptAlert()
				.getTitle();

		Assertions.assertThat(title)
		.isEqualTo("Login");

	}




}
