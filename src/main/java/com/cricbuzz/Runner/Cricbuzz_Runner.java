 /*  @author Pramoth_Prabaharan */

package com.cricbuzz.Runner;
import java.io.*;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cricbuzz.Properties.FileReaderManager;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\Pradeep Prabhaharan\\workspace\\Cucumber_Cricbuzz\\src\\main\\java\\com\\cricbuzz\\Feature\\Cricbuzz.feature",
		glue = {"com.cricbuzz.Step_Definition"},
	    plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target//cucumber-reports//report.html"},	
		monochrome = true,
		dryRun=false

		
		)

public class Cricbuzz_Runner {
	
	
	 @AfterClass
	 public static void writeExtentReport() throws IOException {
		 
	 Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	 
	 System.out.println("Extent Report has been generated");
	 }


}
