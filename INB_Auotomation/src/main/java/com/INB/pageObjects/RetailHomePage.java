package com.INB.pageObjects;

import org.openqa.selenium.By;
import com.INB.driver.DriverManager;
import com.INB.enums.WaitStrategy;
import com.INB.reports.ExtentLogger;

public final class RetailHomePage extends BasePage{

	private final By retailLogOut=By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]");
	private final By myAccount=By.xpath("//li[@class='dropdown li-active']");
	private final By eServices=By.xpath("/html/body/header/nav[2]/div/div/ul/li[2]/a"); 
	private final By request=By.xpath("/html/body/header/nav[2]/div/div/ul/li[3]/a");
	private final By enquiry=By.xpath("/html/body/header/nav[2]/div/div/ul/li[4]/a");
	private final By accountSummary=By.xpath("/html/body/header/nav[2]/div/div/ul/li[1]/ul/li[1]/a");
	private final By accountStatement=By.xpath("/html/body/header/nav[2]/div/div/ul/li[1]/ul/li[2]/a");
	private final By termDepoAcc=By.xpath("//*[@id=\"summaryDiv\"]/ul/li[2]/a");
	private final By termLoanAccount=By.xpath("//*[@id=\"summaryDiv\"]/ul/li[3]/a");
	private final By closedAccounts=By.xpath("//*[@id=\"summaryDiv\"]/ul/li[4]/a");
	private final By transactionFor=By.xpath("//*[@id=\"command\"]/div[2]/div/div/input");
	private final By specifiedPeriod=By.cssSelector("/#command > div:nth-child(3) > div > div > input");
	private final By specifiedPeriodList=By.xpath("//ul[contains(@class, 'dropdown-content select-dropdown ')]//li//span");
	private final By currentPeriod=By.xpath("//*[@id=\"select-options-dc2b5fac-56be-4dbc-8b84-3a3363a01854\"]/li[3]");


	

	public RetailHomePage clickOnSpecifiedPeriod() {
		try {
			getRequiredElementFromTheList(WaitStrategy.VISIBLE, specifiedPeriodList,"Specified");
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		return this;
	}
	public RetailHomePage clickOnTransactionFor() {
		try {
			click(transactionFor, WaitStrategy.CLICKABLE, "Transaction for ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}


	public RetailHomePage clickOnCurrentPeriod() {
		try {
			click(currentPeriod, WaitStrategy.CLICKABLE, "Current Period");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public RetailHomePage clickOnEnquiry() {
		try {
			click(enquiry, WaitStrategy.CLICKABLE, "Enquiry ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public RetailHomePage clickOnRequest() {
		try {
			click(request, WaitStrategy.CLICKABLE, " Request ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public RetailHomePage clickOnEServices() {
		try {
			click(eServices, WaitStrategy.CLICKABLE, "EServices");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public RetailHomePage clickOnAccountStatement() {
		try {
			click(accountStatement, WaitStrategy.CLICKABLE, "Account statement");
		} catch (Exception e) {

			e.printStackTrace();
		}
		return this;
	}

	public RetailHomePage clickOnTermDep() {
		try {
			click(termDepoAcc, WaitStrategy.CLICKABLE, "Term Deposite/other Account");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public RetailHomePage clickOntermLoanAccounts() {
		try {
			click(termLoanAccount, WaitStrategy.CLICKABLE, "Term Loan Account");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}


	public RetailHomePage clickOnClosedIncorpAccount() {
		try {
			click(closedAccounts, WaitStrategy.CLICKABLE, "Closed Accounts");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}


	public RetailHomePage clickOnLogout() throws Exception {

		clickForLogout(retailLogOut,WaitStrategy.CLICKABLE ,"Logout button" );

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
