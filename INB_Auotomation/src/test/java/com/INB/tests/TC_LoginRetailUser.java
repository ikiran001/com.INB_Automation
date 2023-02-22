package com.INB.tests;

import java.util.Map;

import org.testng.annotations.Test;

import com.INB.annotations.FrameworkAnnotations;
import com.INB.constants.FrameworkConstants;
import com.INB.enums.CategoryType;
import com.INB.pageObjects.RetailLogin;

public final class TC_LoginRetailUser extends BaseTest{
	private TC_LoginRetailUser(){

	}
	@FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void TC00(Map<String ,String> data)  {


		new RetailLogin().loginToTheApp(FrameworkConstants.getUserName(data), FrameworkConstants.getPassword(data))
		.logoutApp();
	}

	
	
	@FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void newTest(Map<String ,String> data)  {

		new RetailLogin().loginToTheApp(FrameworkConstants.getUserName(data), FrameworkConstants.getPassword(data))
		.logoutApp();

	}




}
