package com.INB.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


import com.INB.driver.DriverManager;

public final class TC_HomePage extends BaseTest {
	
	private TC_HomePage() {
		
	}

	@Test
	public void Test3	() {
	
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("kiran HOME ", Keys.ENTER);

	}
}
