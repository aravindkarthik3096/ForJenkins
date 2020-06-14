package com.StepDefenition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generateJvmreport(String json) {
		 
		
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JvmReport");
		
		Configuration conn = new Configuration(f, "Facebook Applicaton");
	
         conn.addClassifications("Platform name", "Windows1");		
         conn.addClassifications("Platform name2", "Windows2");
         conn.addClassifications("Platform name3", "Windows3");
         conn.addClassifications("Platform name4", "Windows4");
         conn.addClassifications("Platform name5", "Windows5");
         
         List<String> jsonFiles = new ArrayList<String>();
         
         jsonFiles.add(json);
         
         ReportBuilder r = new ReportBuilder(jsonFiles, conn);
         r.generateReports();
         
	}

}
