package com.cricbuzz;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {

	public static WebDriver driver=null;
	public static Properties properties=null;
	
	
	public BaseClass() throws IOException {
	
		properties=new Properties();
		FileInputStream input=new FileInputStream("C:\\Users\\Pradeep Prabhaharan\\workspace\\Cucumber_Cricbuzz\\src\\main\\java\\com\\cricbuzz\\Properties\\config.properties");
		properties.load(input);
	}
	
	public void browserLaunch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Pramoth\\Driver\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	
	public void enterURL() {
		
		driver.get("https://www.cricbuzz.com/");
	}
	
	
	
	
	

}
