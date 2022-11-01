package com.INB.tests;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.INB.annotations.FrameworkAnnotations;
import com.INB.constants.FrameworkConstants;
import com.INB.enums.CategoryType;
import com.INB.pageObjects.RetailHome;
import com.INB.pageObjects.RetailLogin;

public final class TC_LoginRetailUser extends BaseTest{
	private TC_LoginRetailUser(){

	}
	@FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void TC00(Map<String ,String> data)  {


		RetailLogin title=new RetailLogin().loginToTheApp(FrameworkConstants.getUserName(data), FrameworkConstants.getPassword(data))
				.logoutApp();

		Assertions.assertThat(title)
		.isEqualTo("Login");


	}

	@FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void newTest(Map<String ,String> data)  {

		RetailLogin title=new RetailLogin().loginToTheApp(FrameworkConstants.getUserName(data), FrameworkConstants.getPassword(data))
				.logoutApp();


		Assertions.assertThat(title)
		.isEqualTo("Login");

	}




}
