 /*  @author Pramoth_Prabaharan */

package com.cricbuzz.Runner;



import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\Pradeep Prabhaharan\\workspace\\Cucumber_Cricbuzz\\src\\main\\java\\com\\cricbuzz\\Feature\\Cricbuzz.feature",
		glue = {"com.cricbuzz.Step_Definition"},
		plugin={"C:\\Users\\Pradeep Prabhaharan\\workspace\\Cucumber_Cricbuzz\\target\\report.html"},	
		monochrome = true,
		dryRun=false
//		tags={"@TestFinal","@TestScorecard"}
		
		)

public class Cricbuzz_Runner {
	
	@AfterClass
	public static void writeExtentReport() {
		
	
		
	}

}
