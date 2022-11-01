package com.INB.pageObjects;

import org.openqa.selenium.By;

import com.INB.enums.WaitStrategy;

public final  class RetailLogin extends BasePage{

	private final By retailLoginUserName=By.xpath("//input[@name='username']");
	private final By retailLoginPassWord=By.xpath("//input[@name='password']");
	private final By captchaField=By.xpath("//input[@id='txtInput']");
	private final By imageCaptacha=By.xpath("//*[@id=\"mainCaptcha\"]");
	private final By clickLoginButton=By.xpath("//button[@id='doLogin']");	



	public RetailHome loginToTheApp(String userName,String passWord) {
		enterUserName(userName).enterPass(passWord).getCaptchCode().clickOnLogin();
		return new RetailHome();
	}
	public RetailLogin enterUserName(String userName) {
		sendKeys(retailLoginUserName, userName, WaitStrategy.CLICKABLE , "user name");

		return this;
	}

	public RetailLogin enterPass(String pass)  {
		sendKeys(retailLoginPassWord, pass, WaitStrategy.CLICKABLE,"Password");

		return this;																									
	}

	public RetailLogin getCaptchCode() {

		getCaptcha(imageCaptacha, captchaField , WaitStrategy.PRESENCE);
		return this;
	}

	public RetailHome clickOnLogin()  {
		click(clickLoginButton , WaitStrategy.CLICKABLE,"LogIn button");
		return new RetailHome();
	}

	public String getTitle() {

		return getPageTitle();
	}






}
