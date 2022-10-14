package com.INB.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


import com.INB.driver.DriverManager;

public class TC_Login extends BaseTest {




	@Test
	public void Test1() {

		DriverManager.getDriver().findElement(By.name("q")).sendKeys("kiran ", Keys.ENTER);
	
	}


}
