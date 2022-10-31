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
	public void enquirytClick(Map <String, String> data) throws Exception {
		new RetailLogin().enterUserName(data.get("data1")).enterPass(data.get("data2"))
		.getCaptchCode().clickOnLogin();
		new RetailHomePage().clickOnEnquiry().clickOnLoginHistory().clickOnEnquiry()
		.clickOnTDSEnquiry().clickOnLogout().acceptAlert();
	}

	@FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void enquirytMH(Map <String, String> data) throws Exception {
		new RetailLogin().enterUserName(data.get("data1")).enterPass(data.get("data2"))
		.getCaptchCode().clickOnLogin();
		new RetailHomePage().mouseHoverOnenquiry().clickOnloginHistoryMH().mouseHoverOnenquiry().clickOnTDSEnquiryMH()
		.mouseHoverOnenquiry().clickOnTDSEnquirySubmitMH().clickOnLogout().acceptAlert();
	}

	@FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void requestMH(Map <String, String> data) throws Exception {
		new RetailLogin().enterUserName(data.get("data1")).enterPass(data.get("data2"))
		.getCaptchCode().clickOnLogin();
		new RetailHomePage().mouseHoverrequest().clickOnchequeBookReqMH().mouseHoverrequest()
		.clickOnStopRemoveStopOnChequeMH().mouseHoverrequest().clickOndepChequeStatMH().mouseHoverrequest()
		.clickOnsetStopOnChequeMH().mouseHoverrequest().clickOnremoveStopOnChequeMH().mouseHoverrequest()
		.clickOngenerateMMIDMH().clickOnLogout().acceptAlert();
	}

	@FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void requestClick(Map<String, String> data) throws Exception {
		new RetailLogin().enterUserName(data.get("data1")).enterPass(data.get("data2"))
		.getCaptchCode().clickOnLogin();
		new RetailHomePage().clickOnRequest().clickOnchequeBookReq().clickOnRequest().clickOnStopRemoveStop().clickOnRequest()
		.clickOnDepChequeState().clickOnRequest().clickOnsetStopOnCheq().clickOnRequest().clickOnRemoveSTopOnCHeque().clickOnRequest()
		.clickOnGeneraateMMID().clickOnLogout().acceptAlert();
	}

	@FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void myAccountsMH(Map <String, String> data) throws Exception {
		new RetailLogin().enterUserName(data.get("data1")).enterPass(data.get("data2"))
		.getCaptchCode().clickOnLogin();
		new RetailHomePage().mouseHoverOnMyAccount().mhAccountSumm()
		.clickOnTermDep().clickOntermLoanAccounts().clickOnClosedIncorpAccount()
		.mouseHoverOnMyAccount().mhAccountState().clickOnTransactionFor()
		.clickOnSpecifiedPeriod().clickOnTransactionFor().getCurrentPeriodTxn()
		.clickOnLogout().acceptAlert();
	}

	@FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void myAccountsClick(Map <String , String> data) throws Exception {
		new RetailLogin().enterUserName(data.get("data1")).enterPass(data.get("data2"))
		.getCaptchCode().clickOnLogin();
		new RetailHomePage().clickOnMyAccount().clickOnAccountSummary()
		.clickOnTermDep().clickOntermLoanAccounts()
		.clickOnClosedIncorpAccount().clickOnMyAccount().clickOnAccountStatement()
		.clickOnTransactionFor().clickOnSpecifiedPeriod()
		.clickOnTransactionFor().getCurrentPeriodTxn()
		.clickOnLogout().acceptAlert();
	}

	@FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void eServiceMH(Map<String, String> data) throws Exception {
		new RetailLogin().enterUserName(data.get("data1")).enterPass(data.get("data2"))
		.getCaptchCode().clickOnLogin();
		new RetailHomePage().mhEService().clickOnLinkOfAdhar().mhEService()
		.clickOnInterestCertificate().mhEService().clickOnCancelNAH().clickOnLogout().acceptAlert();
	}

	@FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void eServiceClick(Map<String, String> data) throws Exception {
		new RetailLogin().enterUserName(data.get("data1")).enterPass(data.get("data2"))
		.getCaptchCode().clickOnLogin();
		new RetailHomePage().eEServiceCLick().clickOnLinkOfAdharC()
		.eEServiceCLick().clickOnCancel().clickOnLogout().acceptAlert();
	}


}
