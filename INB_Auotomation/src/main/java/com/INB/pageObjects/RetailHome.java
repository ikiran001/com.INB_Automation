package com.INB.pageObjects;

import org.openqa.selenium.By;
import com.INB.driver.DriverManager;
import com.INB.enums.WaitStrategy;
import com.INB.reports.ExtentLogger;

public final class RetailHome extends BasePage{

	private final By retailLogOut=By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]");

	private final By myAccount=By.xpath("//li[@class='dropdown li-active']//a//span");
	private final By accountSummaryMH=By.xpath("/html/body/header/nav[2]/div/div/ul/li[1]/ul/li[1]");
	private final By accountStatementMH=By.xpath("/html/body/header/nav[2]/div/div/ul/li[1]/ul/li[2]");
	private final By transactionFor=By.xpath("//*[@id=\"command\"]/div[2]/div/div/input");

	//	private final By mheService=By.xpath("//li[@class='dropdown']//a//span[contains(text(),'E-Services')]");

	private final By mheService=By.xpath("/html/body/header/nav[2]/div/div/ul/li[2]/a/span");
	private final By linkOfAdharMH=By.xpath("//a[contains(text(),'Link of Aadhaar with')]");
	private final By interestCertMH=By.xpath("//a[contains(text(),'Interest Certificate')]");
	private final By cancelNAHMandateMH=By.xpath("//a[contains(text(),'Cancel NACH')]");

	private final By enquiry=By.xpath("/html/body/header/nav[2]/div/div/ul/li[4]/a");
	private final By accountSummary=By.xpath("/html/body/section/div/div/div[1]/div[2]/div/div[1]/a");

	private final By accountStatement=By.xpath("/html/body/section/div/div/div[1]/div[2]/div/div[2]/a");
	private final By termDepoAcc=By.xpath("//*[@id=\"summaryDiv\"]/ul/li[2]/a");
	private final By termLoanAccount=By.xpath("//*[@id=\"summaryDiv\"]/ul/li[3]/a");
	private final By closedAccounts=By.xpath("//*[@id=\"summaryDiv\"]/ul/li[4]/a");

	private final By specifiedPeriodList=By.xpath("//ul[contains(@class, 'dropdown-content select-dropdown ')]//li//span");
	private final By currentPeriod=By.xpath("//*[@id=\"select-options-dc2b5fac-56be-4dbc-8b84-3a3363a01854\"]/li[3]");
	private final By accountSummaryClick=By.xpath("/html/body/section/div/div/div[1]/div[2]/div/div[1]/a");
	private final By accountStatementClick=By.xpath("/html/body/section/div/div/div[1]/div[2]/div/div[2]/a");	

	private final By cancelforCl=By.xpath("/html/body/section/div/div/div[1]/div[2]/div/div[2]/a");
	private final By linkOfAdharCl=By.xpath("/html/body/section/div/div/div[1]/div[2]/div/div[1]/a");
	private final By cancelNachC=By.xpath("/html/body/section/div/div/div[1]/div[2]/div/div[2]/a");

	private final By requestMH=By.xpath("/html/body/header/nav[2]/div/div/ul/li[3]/a");
	private final By chequeBookReqMH=By.xpath("/html/body/header/nav[2]/div/div/ul/li[3]/ul/li[1]");
	private final By stopRemoveStopOnCheque=By.xpath("/html/body/header/nav[2]/div/div/ul/li[3]/ul/li[2]");
	private final By depChequeStatMH=By.xpath("/html/body/header/nav[2]/div/div/ul/li[3]/ul/li[3]");
	private final By setStopOnChequeMH=By.xpath("/html/body/header/nav[2]/div/div/ul/li[3]/ul/li[4]");
	private final By removeStopOnChequeMH=By.xpath("/html/body/header/nav[2]/div/div/ul/li[3]/ul/li[5]");
	private final By generateMMIDMH=By.xpath("/html/body/header/nav[2]/div/div/ul/li[3]/ul/li[6]");

	private final By chequeBookReqCl=By.xpath("/html/body/section/div/div/div[1]/div[2]/div/div[1]/a");
	private final By stopRemoveStopCL=By.xpath("/html/body/section/div/div/div[1]/div[2]/div/div[2]/a");
	private final By depChequeStateCl=By.xpath("/html/body/section/div/div/div[1]/div[2]/div/div[3]/a");
	private final By setStopOnCheqCl=By.xpath("/html/body/section/div/div/div[1]/div[2]/div/div[4]/a");
	private final By removeStopOnChequeCl=By.xpath("/html/body/section/div/div/div[1]/div[2]/div/div[5]/a");
	private final By generateMMIDCl=By.xpath("/html/body/section/div/div/div[1]/div[2]/div/div[6]/a");

	private final By enquiryMH=By.xpath("/html/body/header/nav[2]/div/div/ul/li[4]/a");
	private final By loginHistoryMH=By.xpath("/html/body/header/nav[2]/div/div/ul/li[4]/ul/li[1]");
	private final By tdsEnquiryMH=By.xpath("/html/body/header/nav[2]/div/div/ul/li[4]/ul/li[2]");
	private final By tdsEnquirySubmit=By.xpath("/html/body/header/nav[2]/div/div/ul/li[4]/ul/li[3]");

	private final By loginHistoryClick=By.xpath("/html/body/section/div/div/div[1]/div[2]/div/div[1]/a");
	private final By tdsEnquiryClick=By.xpath("/html/body/section/div/div/div[1]/div[2]/div/div[2]/a");



	public RetailHome clickOnLoginHistory() {
		click(loginHistoryClick, WaitStrategy.CLICKABLE, "Login History ");
		return this;
	}

	public RetailHome clickOnTDSEnquiry() {
		click(tdsEnquiryClick, WaitStrategy.CLICKABLE, "TDS Enquiry ");
		return this;
	}

	public RetailHome mouseHoverOnenquiry() {
		mouseHover(enquiryMH, WaitStrategy.VISIBLE, "Enquiry ");
		return this;
	}
	public RetailHome clickOnloginHistoryMH() {
		click(loginHistoryMH, WaitStrategy.CLICKABLE, "Login History ");
		return this;
	}	

	public RetailHome clickOnTDSEnquiryMH() {
		click(tdsEnquiryMH, WaitStrategy.CLICKABLE, "TDS Enquiry ");
		return this;
	}

	public RetailHome clickOnTDSEnquirySubmitMH() {
		click(tdsEnquirySubmit, WaitStrategy.CLICKABLE, "TDS Enquiry Submit");
		return this;
	}
	public RetailHome clickOnGeneraateMMID() {
		click(generateMMIDCl, WaitStrategy.CLICKABLE, "Generate MMID");
		return this;
	}
	public RetailHome clickOnRemoveSTopOnCHeque() {
		click(removeStopOnChequeCl, WaitStrategy.CLICKABLE, "Remove Stop On Cheque");
		return this;
	}
	public RetailHome clickOnsetStopOnCheq() {
		click(setStopOnCheqCl, WaitStrategy.CLICKABLE, "Set Stop On Ceque");
		return this;
	}
	public RetailHome clickOnDepChequeState() {
		click(depChequeStateCl, WaitStrategy.CLICKABLE, "Dep Cheque Status");
		return this;
	}
	public RetailHome clickOnStopRemoveStop() {
		click(stopRemoveStopCL, WaitStrategy.CLICKABLE, "Stop Remove Stop Cheque");
		return this;
	}
	public RetailHome clickOnchequeBookReq() {
		click(chequeBookReqCl, WaitStrategy.CLICKABLE, "Cheque Book Request");
		return this;
	}

	public RetailHome clickOngenerateMMIDMH() {

		click(generateMMIDMH, WaitStrategy.CLICKABLE, "Generate MMID");

		return this;
	}
	public RetailHome clickOnsetStopOnChequeMH() {

		click(setStopOnChequeMH, WaitStrategy.CLICKABLE, "Set Stop on cheque");

		return this;
	}

	public RetailHome clickOndepChequeStatMH() {

		click(depChequeStatMH, WaitStrategy.CLICKABLE, "Depo cheque statement");

		return this;
	}

	public RetailHome clickOnremoveStopOnChequeMH() {

		click(removeStopOnChequeMH, WaitStrategy.CLICKABLE, "Remove Stop On cheque");

		return this;
	}
	public RetailHome mouseHoverrequest() {
		mouseHover(requestMH, WaitStrategy.VISIBLE, "Request ");
		return this;
	}

	public RetailHome clickOnRequest() {
		clickAction(requestMH, WaitStrategy.CLICKABLE, "Request ");
		return this;
	}

	public RetailHome clickOnchequeBookReqMH() {

		click(chequeBookReqMH, WaitStrategy.CLICKABLE, "ChequeBook Request");

		return this;
	}

	public RetailHome clickOnStopRemoveStopOnChequeMH() {

		click(stopRemoveStopOnCheque, WaitStrategy.CLICKABLE, "Set/Remove Stop");

		return this;
	}

	public RetailHome clickOnCancelNACHC() {

		click(cancelNachC, WaitStrategy.VISIBLE, "Cancel NACH");

		return this;
	}
	public RetailHome clickOnLinkOfAdharC() {

		click(linkOfAdharCl, WaitStrategy.VISIBLE, "Link Of Adhar ");

		return this;
	}

	public RetailHome clickOnCancelNAH() {

		click(cancelNAHMandateMH, WaitStrategy.VISIBLE, "Cancel NAH mandate");

		return this;
	}
	public RetailHome clickOnCancel() {

		click(cancelforCl, WaitStrategy.VISIBLE, "Cancel NAH mandate");

		return this;
	}


	public RetailHome clickOnInterestCertificate() {

		click(interestCertMH, WaitStrategy.PRESENCE, "Interest Certificate");

		return this;
	}


	public RetailHome clickOnLinkOfAdhar() {

		click(linkOfAdharMH, WaitStrategy.PRESENCE, "Link Of Adhar With Bank Account");

		return this;
	}


	public RetailHome mhEService() {
		mouseHover(mheService, WaitStrategy.PRESENCE, "E-Services");
		return this;
	}

	public RetailHome eEServiceCLick() {

		clickAction(mheService, WaitStrategy.CLICKABLE, "E-Services");


		return this;
	}


	public RetailHome  mhAccountState() {

		click(accountStatementMH, WaitStrategy.PRESENCE, "Account Statement");

		return this;
	}

	public RetailHome mhAccountSumm() {

		click(accountSummaryMH, WaitStrategy.PRESENCE, "Account Summary");

		return this;
	}

	public RetailHome clickOnAccSumm() {

		click(accountSummaryClick, WaitStrategy.VISIBLE, "Account Summary");

		return this;  	
	}

	public RetailHome clickOnAccState() {

		click(accountStatementClick, WaitStrategy.VISIBLE, "Account Statement ");

		return this;
	}

	public RetailHome clickOnMyAccount () {
		clickAction(myAccount, WaitStrategy.CLICKABLE, "My Account ");

		return this;
	}
	public RetailHome getCurrentPeriodTxn() {
		getRequiredElementFromTheList(WaitStrategy.VISIBLE, specifiedPeriodList, "Current");
		return this;
	}

	public RetailHome clickOnSpecifiedPeriod() {

		getRequiredElementFromTheList(WaitStrategy.VISIBLE, specifiedPeriodList,"Specified");


		return this;
	}
	public RetailHome clickOnTransactionFor() {

		click(transactionFor, WaitStrategy.VISIBLE, "Transaction for ");

		return this;
	}


	public RetailHome clickOnCurrentPeriod() {

		click(currentPeriod, WaitStrategy.VISIBLE, "Current Period");

		return this;
	}
	public RetailHome clickOnEnquiry() {

		click(enquiry, WaitStrategy.VISIBLE, "Enquiry ");

		return this;
	}

	public RetailHome clickOnEServices() {

		click(mheService, WaitStrategy.VISIBLE, "EServices");

		return this;
	}
	public RetailHome clickOnAccountStatement() {

		click(accountStatement, WaitStrategy.VISIBLE, "Account statement");

		return this;
	}

	public RetailHome clickOnTermDep() {

		click(termDepoAcc, WaitStrategy.VISIBLE, "Term Deposite/other Account");

		return this;
	}
	public RetailHome clickOntermLoanAccounts() {

		click(termLoanAccount, WaitStrategy.VISIBLE, "Term Loan Account");

		return this;
	}


	public RetailHome clickOnClosedIncorpAccount() {

		click(closedAccounts, WaitStrategy.VISIBLE, "Closed Accounts");

		return this;
	}


	public RetailLogin logoutApp()  {

		clickForLogout(retailLogOut,WaitStrategy.VISIBLE ,"Logout button" );
		acceptAlert();
		return new RetailLogin();
	}

	public RetailHome mouseHoverOnMyAccount() {
		mouseHover(myAccount, WaitStrategy.PRESENCE ,"My Account");
		return this;
	}

	public RetailHome clickOnAccountSummary() {

		click(accountSummary, WaitStrategy.PRESENCE, "Account Summary");

		return this;
	}

	public void  acceptAlert() {

		DriverManager.getDriver().switchTo().alert().accept();
		ExtentLogger.pass(" Alert accepted successfully ");
		
	}

}
