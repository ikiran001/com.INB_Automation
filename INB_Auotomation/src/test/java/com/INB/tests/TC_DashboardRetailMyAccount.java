package com.INB.tests;

import java.util.Map;

import org.testng.annotations.Test;

import com.INB.annotations.FrameworkAnnotations;
import com.INB.constants.FrameworkConstants;
import com.INB.enums.CategoryType;
import com.INB.pageObjects.RetailHome;
import com.INB.pageObjects.RetailLogin;

public class TC_DashboardRetailMyAccount extends BaseTest {
	private TC_DashboardRetailMyAccount(){
	}


	@FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void enquirytClick(Map <String, String> data)   {
		new RetailLogin().loginToTheApp(FrameworkConstants.getUserName(data),FrameworkConstants.getPassword(data));
		new RetailHome().clickOnEnquiry().clickOnLoginHistory().clickOnEnquiry()
		.clickOnTDSEnquiry()
		.logoutApp();

	}

	@FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void enquirytMH(Map <String, String> data)  {
		new RetailLogin().loginToTheApp(FrameworkConstants.getUserName(data),FrameworkConstants.getPassword(data));
		new RetailHome().mouseHoverOnenquiry().clickOnloginHistoryMH().mouseHoverOnenquiry().clickOnTDSEnquiryMH()
		.mouseHoverOnenquiry().clickOnTDSEnquirySubmitMH()
		.logoutApp();
	}

	@FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void requestMH(Map <String, String> data)  {
		new RetailLogin().loginToTheApp(FrameworkConstants.getUserName(data),FrameworkConstants.getPassword(data));
		new RetailHome().mouseHoverrequest().clickOnchequeBookReqMH().mouseHoverrequest()
		.clickOnStopRemoveStopOnChequeMH().mouseHoverrequest().clickOndepChequeStatMH().mouseHoverrequest()
		.clickOnsetStopOnChequeMH().mouseHoverrequest().clickOnremoveStopOnChequeMH().mouseHoverrequest()
		.clickOngenerateMMIDMH()
		.logoutApp();
	}

	@FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void requestClick(Map<String, String> data) throws Exception {
		new RetailLogin().loginToTheApp(FrameworkConstants.getUserName(data),FrameworkConstants.getPassword(data));
		new RetailHome().clickOnRequest().clickOnchequeBookReq().clickOnRequest().clickOnStopRemoveStop().clickOnRequest()
		.clickOnDepChequeState().clickOnRequest().clickOnsetStopOnCheq().clickOnRequest().clickOnRemoveSTopOnCHeque().clickOnRequest()
		.clickOnGeneraateMMID()
		.logoutApp();
	}

	@FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void myAccountsMH(Map <String, String> data)  {
		new RetailLogin().loginToTheApp(FrameworkConstants.getUserName(data),FrameworkConstants.getPassword(data));
		new RetailHome().mouseHoverOnMyAccount().mhAccountSumm()
		.clickOnTermDep().clickOntermLoanAccounts().clickOnClosedIncorpAccount()
		.mouseHoverOnMyAccount().mhAccountState().clickOnTransactionFor()
		.clickOnSpecifiedPeriod().clickOnTransactionFor().getCurrentPeriodTxn()
		.logoutApp();
	}

	@FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void myAccountsClick(Map <String , String> data) {
		new RetailLogin().loginToTheApp(FrameworkConstants.getUserName(data),FrameworkConstants.getPassword(data));
		new RetailHome().clickOnMyAccount().clickOnAccountSummary()
		.clickOnTermDep().clickOntermLoanAccounts()
		.clickOnClosedIncorpAccount().clickOnMyAccount().clickOnAccountStatement()
		.clickOnTransactionFor().clickOnSpecifiedPeriod()
		.clickOnTransactionFor().getCurrentPeriodTxn()
		.logoutApp();
	}

	@FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void eServiceMH(Map<String, String> data)  {
		new RetailLogin().loginToTheApp(FrameworkConstants.getUserName(data),FrameworkConstants.getPassword(data));
		new RetailHome().mhEService().clickOnLinkOfAdhar().mhEService()
		.clickOnInterestCertificate().mhEService().clickOnCancelNAH()
		.logoutApp();
	}

	@FrameworkAnnotations(author={"KIRAN"}, categories = { CategoryType.REGRESSION })
	@Test
	public void eServiceClick(Map<String, String> data)  {
		new RetailLogin().loginToTheApp(FrameworkConstants.getUserName(data),FrameworkConstants.getPassword(data));
		new RetailHome().eEServiceCLick().clickOnLinkOfAdharC()
		.eEServiceCLick().clickOnCancel()
		.logoutApp();
	}
	
	@FrameworkAnnotations(author = { "Kiran" }, categories = { CategoryType.SMOKE })
	@Test
	public void accountStatForSpecPeriod(Map<String, String> data) {
		new RetailLogin().loginToTheApp(FrameworkConstants.getUserName(data),FrameworkConstants.getPassword(data));
		new RetailHome().clickOnMyAccount().clickOnAccountStatement();
		
	}


}
