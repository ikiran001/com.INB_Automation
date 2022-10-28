package com.INB.factories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.INB.constants.FrameworkConstants;
import com.INB.driver.DriverManager;
import com.INB.enums.WaitStrategy;

public final  class ExplicitWaitFactory {

	private ExplicitWaitFactory() {

	}

	public static WebElement performExlpicitWait(WaitStrategy wait, By by) {
		WebElement element=null;
		if(wait==WaitStrategy.CLICKABLE) {
			element=new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitwait())
					.until(ExpectedConditions.elementToBeClickable(by));
		}else if(wait==WaitStrategy.PRESENCE){	
			element=new WebDriverWait(DriverManager.getDriver(),FrameworkConstants.getExplicitwait())
					.until(ExpectedConditions.presenceOfElementLocated(by));
		}
		else if(wait==WaitStrategy.VISIBLE) {
			element=  new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitwait())
					.until(ExpectedConditions.visibilityOfElementLocated(by));
		}

		else if(wait==WaitStrategy.NONE) {
			element=DriverManager.getDriver().findElement(by);
		}
		return element;

	}
}
