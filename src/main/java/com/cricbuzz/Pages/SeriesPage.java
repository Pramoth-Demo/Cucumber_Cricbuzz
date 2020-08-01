package com.cricbuzz.Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cricbuzz.BaseClass;
import com.cricbuzz.util.Write_Schedules;

public class SeriesPage extends BaseClass {
	
	
	@FindBy(xpath="//*[@id='seriesDropDown']/a")
	WebElement series;
	
	@FindBy(xpath="//div[@class='cb-col-100 cb-col ng-scope']")
	public static List<WebElement> seriesDetails;
	
	@FindBy(xpath="//div[@class='cb-col-16 cb-col text-bold cb-mnth ']")
	public static List<WebElement> month;
	
	
	
	
	Write_Schedules write=null;
	
	
	public SeriesPage() throws IOException {
		PageFactory.initElements(driver, this);
	
	}
	
	public void clickOnSeriesModule() {
		series.click();
	}
	
	public void FetchingAustraliaTourDetails() throws IOException {
		
		write=new Write_Schedules(); 
		
		write.FeedingAustraliaSeries();
		
		
		
	}
	
	
	

}
