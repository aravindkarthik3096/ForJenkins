package com.Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.StepDefenition.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features="src\\test\\resources", glue="com.StepDefenition" , monochrome= true, dryRun=false,
plugin= {"html:target/Reports/HtmlReport","json:src\\test\\resources\\Reports\\JsonReport\\fbpage.json",
		"junit:target/Reports/JSONReport/fbloginpage.xml"})


public class RunnerClass {

	@AfterClass
	
	public static void JvmReportGeneration() {
		
           JvmReport.generateJvmreport(
        		   System.getProperty("user.dir")+ "\\src\\test\\resources\\Reports\\JsonReport\\fbpage.json");
           
		
	}
	
}
