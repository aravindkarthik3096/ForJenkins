package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	
	
	
public static WebDriver driver;
	
	public static void launchBrowser(String url) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\CucumberHooks\\DriNew\\chromedriver.exe" );
		driver= new ChromeDriver();
	
		driver.get(url);
	}	
	
   public static void fill(WebElement element,String value) {
	   
	   element.sendKeys(value);
	
	}
	
   public static void click(WebElement element) {
	   element.click();
   }
   
   public static void browserClose() {
	    
	  driver.close(); 
   }
}
