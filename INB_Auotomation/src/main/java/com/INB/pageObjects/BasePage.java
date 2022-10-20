package com.INB.pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.INB.driver.DriverManager;
import com.INB.enums.WaitStrategy;
import com.INB.factories.ExplicitWaitFactory;
import com.INB.reports.ExtentLogger;

public class BasePage {
	private final Actions action = new Actions(DriverManager.getDriver());

	protected void click(By by ,WaitStrategy waitStratergy ,String elementName) throws Exception {
		WebElement element=	ExplicitWaitFactory.performExlpicitWait(waitStratergy, by);
		element.click();
		ExtentLogger.pass(elementName+ " is  clicked",true);
	}

	protected void clickForLogout(By by ,WaitStrategy waitStratergy ,String elementName) throws Exception {
		WebElement element=	ExplicitWaitFactory.performExlpicitWait(waitStratergy, by);
		element.click();
		ExtentLogger.pass(elementName+ " is  clicked");
	}

	protected void sendKeys(By by, String value,WaitStrategy waitStratergy,String elementName) throws Exception {
		WebElement element=ExplicitWaitFactory.performExlpicitWait(waitStratergy, by);
		element.sendKeys(value);
		ExtentLogger.pass(value+ " is successufully entered in "+elementName , true );
	}

	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();

	}

	protected void mouseHover(By by,WaitStrategy waitStratergy , String elementName) {

		try {

			WebElement element=ExplicitWaitFactory.performExlpicitWait(waitStratergy, by);
			action.moveToElement(element).perform();
			ExtentLogger.pass("Mouse Hover is done on "+elementName, true);
		} catch (Exception e) {
			e.printStackTrace();
		}

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

	protected BasePage getRequiredElementFromTheList( WaitStrategy waitStratergy, By by , String element){
		try
		{
			List<WebElement> list=DriverManager.getDriver().findElements(by);
			for(WebElement wantedList:list) {
				if(wantedList.getText().contains(element)) {
					wantedList.click();
					ExtentLogger.pass(element+" is selected from the list ", true);
					break;
				}

			}
		}
		catch (Exception e) { e.printStackTrace(); }

		return this; 
	}


	protected BasePage getWindowHandle() {

		Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(windowHandles);
		System.out.println(windowHandlesList.size());
		for(String curr:windowHandlesList){
			System.out.println(curr+" "+windowHandlesList.size()+windowHandlesList.get(0));
			DriverManager.getDriver().switchTo().window(curr);	
		}
		return this;
	}


}













