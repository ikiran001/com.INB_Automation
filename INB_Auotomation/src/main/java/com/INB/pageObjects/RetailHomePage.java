package com.INB.pageObjects;

import org.openqa.selenium.By;
import com.INB.driver.DriverManager;
import com.INB.enums.WaitStrategy;
import com.INB.reports.ExtentLogger;

public final class RetailHomePage extends BasePage{

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

	
	
	public RetailHomePage clickOnLoginHistory() {
		click(loginHistoryClick, WaitStrategy.CLICKABLE, "Login History ");
		return this;
	}

	public RetailHomePage clickOnTDSEnquiry() {
		click(tdsEnquiryClick, WaitStrategy.CLICKABLE, "TDS Enquiry ");
		return this;
	}

	public RetailHomePage mouseHoverOnenquiry() {
		mouseHover(enquiryMH, WaitStrategy.VISIBLE, "Enquiry ");
		return this;
	}
	public RetailHomePage clickOnloginHistoryMH() {
		click(loginHistoryMH, WaitStrategy.CLICKABLE, "Login History ");
		return this;
	}	

	public RetailHomePage clickOnTDSEnquiryMH() {
		click(tdsEnquiryMH, WaitStrategy.CLICKABLE, "TDS Enquiry ");
		return this;
	}

	public RetailHomePage clickOnTDSEnquirySubmitMH() {
		click(tdsEnquirySubmit, WaitStrategy.CLICKABLE, "TDS Enquiry Submit");
		return this;
	}
	public RetailHomePage clickOnGeneraateMMID() {
		click(generateMMIDCl, WaitStrategy.CLICKABLE, "Generate MMID");
		return this;
	}
	public RetailHomePage clickOnRemoveSTopOnCHeque() {
		click(removeStopOnChequeCl, WaitStrategy.CLICKABLE, "Remove Stop On Cheque");
		return this;
	}
	public RetailHomePage clickOnsetStopOnCheq() {
		click(setStopOnCheqCl, WaitStrategy.CLICKABLE, "Set Stop On Ceque");
		return this;
	}
	public RetailHomePage clickOnDepChequeState() {
		click(depChequeStateCl, WaitStrategy.CLICKABLE, "Dep Cheque Status");
		return this;
	}
	public RetailHomePage clickOnStopRemoveStop() {
		click(stopRemoveStopCL, WaitStrategy.CLICKABLE, "Stop Remove Stop Cheque");
		return this;
	}
	public RetailHomePage clickOnchequeBookReq() {
		click(chequeBookReqCl, WaitStrategy.CLICKABLE, "Cheque Book Request");
		return this;
	}

	public RetailHomePage clickOngenerateMMIDMH() {
		try {
			click(generateMMIDMH, WaitStrategy.CLICKABLE, "Generate MMID");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public RetailHomePage clickOnsetStopOnChequeMH() {
		try {
			click(setStopOnChequeMH, WaitStrategy.CLICKABLE, "Set Stop on cheque");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public RetailHomePage clickOndepChequeStatMH() {
		try {
			click(depChequeStatMH, WaitStrategy.CLICKABLE, "Depo cheque statement");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public RetailHomePage clickOnremoveStopOnChequeMH() {
		try {
			click(removeStopOnChequeMH, WaitStrategy.CLICKABLE, "Remove Stop On cheque");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public RetailHomePage mouseHoverrequest() {
		mouseHover(requestMH, WaitStrategy.VISIBLE, "Request ");
		return this;
	}

	public RetailHomePage clickOnRequest() {
		clickAction(requestMH, WaitStrategy.CLICKABLE, "Request ");
		return this;
	}

	public RetailHomePage clickOnchequeBookReqMH() {
		try {
			click(chequeBookReqMH, WaitStrategy.CLICKABLE, "ChequeBook Request");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public RetailHomePage clickOnStopRemoveStopOnChequeMH() {
		try {
			click(stopRemoveStopOnCheque, WaitStrategy.CLICKABLE, "Set/Remove Stop");
		} catch (Exception e) {

			e.printStackTrace();
		}
		return this;
	}

	public RetailHomePage clickOnCancelNACHC() {
		try {
			click(cancelNachC, WaitStrategy.VISIBLE, "Cancel NACH");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public RetailHomePage clickOnLinkOfAdharC() {
		try {
			click(linkOfAdharCl, WaitStrategy.VISIBLE, "Link Of Adhar ");
		} catch (Exception e) {

			e.printStackTrace();
		}
		return this;
	}

	public RetailHomePage clickOnCancelNAH() {
		try {
			click(cancelNAHMandateMH, WaitStrategy.VISIBLE, "Cancel NAH mandate");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public RetailHomePage clickOnCancel() {
		try {
			click(cancelforCl, WaitStrategy.VISIBLE, "Cancel NAH mandate");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}


	public RetailHomePage clickOnInterestCertificate() {
		try {
			click(interestCertMH, WaitStrategy.PRESENCE, "Interest Certificate");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}


	public RetailHomePage clickOnLinkOfAdhar() {
		try {
			click(linkOfAdharMH, WaitStrategy.PRESENCE, "Link Of Adhar With Bank Account");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}


	public RetailHomePage mhEService() {
		mouseHover(mheService, WaitStrategy.PRESENCE, "E-Services");
		return this;
	}

	public RetailHomePage eEServiceCLick() {
		try {
			clickAction(mheService, WaitStrategy.CLICKABLE, "E-Services");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}


	public RetailHomePage  mhAccountState() {
		try {
			click(accountStatementMH, WaitStrategy.PRESENCE, "Account Statement");
		} catch (Exception e) {

			e.printStackTrace();
		}
		return this;
	}

	public RetailHomePage mhAccountSumm() {
		try {
			click(accountSummaryMH, WaitStrategy.PRESENCE, "Account Summary");
		} catch (Exception e) {

			e.printStackTrace();
		}
		return this;
	}

	public RetailHomePage clickOnAccSumm() {
		try {
			click(accountSummaryClick, WaitStrategy.VISIBLE, "Account Summary");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;  	
	}

	public RetailHomePage clickOnAccState() {
		try {
			click(accountStatementClick, WaitStrategy.VISIBLE, "Account Statement ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public RetailHomePage clickOnMyAccount() {
		try {
			clickAction(myAccount, WaitStrategy.CLICKABLE, "My Account ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public RetailHomePage getCurrentPeriodTxn() {
		getRequiredElementFromTheList(WaitStrategy.VISIBLE, specifiedPeriodList, "Current");
		return this;
	}

	public RetailHomePage clickOnSpecifiedPeriod() {

		getRequiredElementFromTheList(WaitStrategy.VISIBLE, specifiedPeriodList,"Specified");


		return this;
	}
	public RetailHomePage clickOnTransactionFor() {
		try {
			click(transactionFor, WaitStrategy.VISIBLE, "Transaction for ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}


	public RetailHomePage clickOnCurrentPeriod() {
		try {
			click(currentPeriod, WaitStrategy.VISIBLE, "Current Period");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public RetailHomePage clickOnEnquiry() {
		try {
			click(enquiry, WaitStrategy.VISIBLE, "Enquiry ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public RetailHomePage clickOnEServices() {
		try {
			click(mheService, WaitStrategy.VISIBLE, "EServices");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public RetailHomePage clickOnAccountStatement() {
		try {
			click(accountStatement, WaitStrategy.VISIBLE, "Account statement");
		} catch (Exception e) {

			e.printStackTrace();
		}
		return this;
	}

	public RetailHomePage clickOnTermDep() {
		try {
			click(termDepoAcc, WaitStrategy.VISIBLE, "Term Deposite/other Account");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public RetailHomePage clickOntermLoanAccounts() {
		try {
			click(termLoanAccount, WaitStrategy.VISIBLE, "Term Loan Account");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}


	public RetailHomePage clickOnClosedIncorpAccount() {
		try {
			click(closedAccounts, WaitStrategy.VISIBLE, "Closed Accounts");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}


	public RetailHomePage clickOnLogout() throws Exception {

		clickForLogout(retailLogOut,WaitStrategy.VISIBLE ,"Logout button" );

		return this;
	}

	public RetailHomePage mouseHoverOnMyAccount() {
		mouseHover(myAccount, WaitStrategy.PRESENCE ,"My Account");
		return this;
	}

	public RetailHomePage clickOnAccountSummary() {
		try {
			click(accountSummary, WaitStrategy.PRESENCE, "Account Summary");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public RetailLogin  acceptAlert() {
		try {
			DriverManager.getDriver().switchTo().alert().accept();
			ExtentLogger.pass(" Alert accepted successfully ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new RetailLogin();
	}

}
