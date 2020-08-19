package com.cricbuzz.Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigFileReader {
	
	
	public static Properties properties1=null;



	public ConfigFileReader() throws IOException {
		
		properties1=new Properties();
		FileInputStream input=new FileInputStream("C:\\Users\\Pradeep Prabhaharan\\workspace\\Cucumber_Cricbuzz\\src\\main\\java\\com\\cricbuzz\\Properties\\Configuration.properties");
		properties1.load(input);
		
	}

	public String getReportConfigPath(){
		
		String reportConfigPath = properties1.getProperty("reportConfigPath");
		
		if(reportConfigPath!= null) return reportConfigPath;
		
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}

}
