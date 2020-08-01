package com.cricbuzz.Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cricbuzz.BaseClass;
import com.cricbuzz.util.ScrollPageClass;
import com.cricbuzz.util.Write_Schedules;

public class SchedulePage extends BaseClass {
	
	
	
	
	@FindBy(xpath="//div[@id='international-list']/child::*")
	public static List<WebElement> overAll;
	
	
	@FindBy(xpath="//div[@id='international-list']//div[@class='cb-lv-grn-strip text-bold']")
	public static List<WebElement> matchDate;
	
	@FindBy(xpath="//div[@class='cb-col-100 cb-col']//div[@class='cb-col-100 cb-col']")
	public static List<WebElement> Details;

	
	
	
	public static List<String> matchDates=null;
	Write_Schedules write=null;

	public SchedulePage() throws IOException {
		
		PageFactory.initElements(driver, this);                                           // Initialising the PageFactory
		
	}
	
	
		
	
	public void FeedingSchedulesToExcel() throws IOException, InterruptedException {
		
		
		
		
		write=new Write_Schedules();                                                                
	
		ScrollPageClass.ScrollPage();                                                        // Calling ScrollDown page function
		
		write.FeedingSchedules();                                                            // Calling Feeding schedule details into excel function
		
	
		
		
	}
	
	}
