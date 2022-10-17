package com.INB.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.INB.driver.DriverManager;
import com.INB.enums.WaitStrategy;
import com.INB.factories.ExplicitWaitFactory;
import com.INB.reports.ExtentLogger;

public class BasePage {

	protected void click(By by ,WaitStrategy waitStratergy ,String elementName) throws Exception {
		WebElement element=	ExplicitWaitFactory.performExlpicitWait(waitStratergy, by);
		element.click();
		ExtentLogger.pass(elementName+ " is  clicked" , true);
	}

	protected void sendKeys(By by, String value,WaitStrategy waitStratergy,String elementName) throws Exception {
		WebElement element=ExplicitWaitFactory.performExlpicitWait(waitStratergy, by);
		element.sendKeys(value);
		ExtentLogger.pass(value+ " is successufully entered in "+elementName , true );
			}

	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();
		
	}

	protected  void acceptAlert() throws Exception {
		DriverManager.getDriver().switchTo().alert().accept();
		ExtentLogger.pass(" Alert accepeted successufully " , true);
		
	}
	
	protected void getCaptcha(By imageCode , By fieldCaptcha , WaitStrategy waitStratergy ) {
		ExplicitWaitFactory.performExlpicitWait(waitStratergy, fieldCaptcha);
		ExplicitWaitFactory.performExlpicitWait(waitStratergy, imageCode);
		WebElement imageCaptchaCodeValue=DriverManager.getDriver().findElement(imageCode);
		DriverManager.getDriver().findElement(fieldCaptcha).sendKeys(imageCaptchaCodeValue.getAttribute("value"));
		try {
			ExtentLogger.pass(imageCaptchaCodeValue.getAttribute("value")+" successfully sent  to  the Captcha Code" ,true);
		} catch (Exception e) {
					e.printStackTrace();
		}
		
	}
}













