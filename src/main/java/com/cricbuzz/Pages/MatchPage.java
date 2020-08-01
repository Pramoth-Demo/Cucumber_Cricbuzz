package com.cricbuzz.Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cricbuzz.BaseClass;
import com.cricbuzz.util.Write_Scorecard;

public class MatchPage extends BaseClass{
	
	@FindBy(xpath="//img[@title='Cricbuzz Logo']")
	WebElement cricbuzzLogo;
	
	@FindBy(xpath="(//li[@class='cb-col cb-col-25 cb-mtch-blk cb-vid-sml-card-api videos-carousal-item cb-carousal-item-large cb-view-all-ga'])[1]")
	WebElement liveMatch;
	
	@FindBy(xpath="//a[contains(text(),'Scorecard')]")
	WebElement scorecard;
	
	@FindBy(xpath="//h1[@class='cb-nav-hdr cb-font-18 line-ht24']")
	public static WebElement matchTitle;
	
	@FindBy(xpath="//div[@class='cb-col cb-scrcrd-status cb-col-100 cb-text-complete ng-scope']")        // Status of the Completed match [Match Result]
	public static WebElement matchStatusCompleted;
	
	@FindBy(xpath="//div[@class='cb-col cb-scrcrd-status cb-col-100 cb-text-live ng-scope']")        // Status of the Live match [Match Result]
	public static WebElement matchStatusLive;
	
	@FindBy(xpath="//*[@id='innings_1']/div[1]/div[1]/span[1]")                          
	WebElement firstInningsHeader;
	
	@FindBy(xpath="//*[@id='innings_1']/div[1]/div[14]/div")                              
	public static List<WebElement> innings_1_extras;
	
	@FindBy(xpath="//*[@id='innings_1']/div[1]/div[15]/child::div")                              
	public static List<WebElement> innings_1_total;
	
	@FindBy(xpath="//div[@id='innings_1']//div[contains(text(),'Fall of Wickets')]")                              
	public static WebElement innings_1_FOWHeader;
	
	@FindBy(xpath="//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-col-rt cb-font-13']//child::span")                              
	public static List<WebElement> innings_1_FOW;
	
	@FindBy(xpath="(//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-scrd-sub-hdr cb-bg-gray'])[2]//child::div")                              
	public static List<WebElement> innings_1_BowlerCardHeader;
	
	
	
	
	
	
	
	
	

	
	
	
//	@FindBy(xpath="//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-scrd-itms']//child::div[1]")                              
//	public static List<WebElement> firstInningsBatsmenName;
	
	
	
	Write_Scorecard writeScorecard;
	
	
	
	
	
	
	public MatchPage() throws IOException {
		PageFactory.initElements(driver, this);
	
	}
	
	public void ClickOnCricbuzzLogo() {
		
		cricbuzzLogo.click();
		
	}
	
	public void ClickOnLiveMatch() {
		
		liveMatch.click();
	}
	
	public void ClickOnScorecard() {
		scorecard.click();
	}
	
	public void FetchingScorecard() throws IOException {
		
		writeScorecard=new Write_Scorecard();
		writeScorecard.FeedingTitleOfTheMatch();
		writeScorecard.FeedingMatchStatus();
		writeScorecard.Feeding_Scorecard();
		
		Write_Scorecard.closeExcel();
		
	}

}
