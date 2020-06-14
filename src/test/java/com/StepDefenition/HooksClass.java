package com.StepDefenition;

import java.util.concurrent.TimeUnit;

import com.Base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {


	@Before 
	
	public  void beforeExecution() {
		
		System.out.println("Before will execute first");
		launchBrowser("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	}
	
	@After
	
	public void afterClass() {
	
		System.out.println("After the after each scenario");
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
