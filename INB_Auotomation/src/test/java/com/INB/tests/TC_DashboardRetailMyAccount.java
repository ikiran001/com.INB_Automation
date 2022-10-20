package com.INB.tests;

import java.util.Map;

import org.testng.annotations.Test;

import com.INB.annotations.FrameworkAnnotations;
import com.INB.enums.CategoryType;
import com.INB.pageObjects.RetailHomePage;
import com.INB.pageObjects.RetailLogin;

public class TC_DashboardRetailMyAccount extends BaseTest {
	private TC_DashboardRetailMyAccount(){
	}


	
	
	@FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void myAccountsSummary(Map <String, String > data) throws Exception {

		new RetailHomePage().mouseHoverOnMyAccount().clickOnAccountSummary().clickOnTermDep()
		.clickOntermLoanAccounts().clickOnClosedIncorpAccount()
		.clickOnLogout().acceptAlert();
	}


	@FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void myAccountsStatement(Map <String, String > data) throws Exception {
		new RetailLogin().enterUserName(data.get("data1")).enterPass(data.get("data2"))
		.getCaptchCode().clickOnLogin();
		new RetailHomePage().mouseHoverOnMyAccount()
		.clickOnAccountStatement().clickOnTransactionFor().clickOnSpecifiedPeriod().clickOnLogout().acceptAlert();
	}

}
