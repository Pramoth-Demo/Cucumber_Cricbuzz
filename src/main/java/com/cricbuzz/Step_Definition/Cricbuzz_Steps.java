 /*  @author Pramoth_Prabhaharan */

package com.cricbuzz.Step_Definition;

import java.io.IOException;
import java.sql.Driver;

import com.cricbuzz.BaseClass;
import com.cricbuzz.Pages.HomePage;
import com.cricbuzz.Pages.MatchPage;
import com.cricbuzz.Pages.SchedulePage;
import com.cricbuzz.Pages.SeriesPage;
import com.cricbuzz.util.ScrollPageClass;
import com.cricbuzz.util.Write_Schedules;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cricbuzz_Steps {

	
	BaseClass baseClass;
    HomePage homePage;
    SchedulePage schedulePage;
    SeriesPage seriesPage;
    MatchPage matchPage;
	Write_Schedules write;
    
	
	//  SCENARIO 1
	
	@Given("^Open the browser$")
	public void open_the_browser() throws IOException {
		baseClass=new BaseClass();
		
		baseClass.browserLaunch();

	}

	@When("^User enters the url$")
	public void user_enters_the_url() {
		
		baseClass.enterURL();
       
	}
	
	@Then("^User should be in Cricbuzz home page$")
	public void user_should_be_in_Cricbuzz_home_page() throws IOException  {
	
		homePage=new HomePage();
		
		homePage.validateHomePageTitle();
		
	}

	@Then("^User clicks on Schedule$")
	public void user_clicks_on_Schedule()  throws IOException {
		
		homePage.clickOnSchedule();
	}

	@Then("^User fetching international cricket match schedules$")
	public void user_fetching_international_cricket_match_schedules() throws IOException, InterruptedException  {

		schedulePage=new SchedulePage();
		
		schedulePage.FeedingSchedulesToExcel();
	}
	
	
	
	// SCENARIO 2
	

@Then("^Click on series$")
public void click_on_series() throws IOException  {
  
	seriesPage=new SeriesPage();
	
	seriesPage.clickOnSeriesModule();
	
}

@Then("^Fetching International tour of Australia$")
public void fetching_International_tour_of_Australia() throws IOException {
	
	seriesPage.FetchingAustraliaTourDetails();
	
  
}


   // SCENARIO 3

@Then("^Go to HomePage by click on Cricbuzz Logo$")
public void go_to_HomePage_by_click_on_Cricbuzz_Logo() throws IOException  {
	
	matchPage=new MatchPage();
	matchPage.ClickOnCricbuzzLogo();
}

@Then("^Click on first live match$")
public void click_on_first_live_match() {
	matchPage.ClickOnLiveMatch();

}

@Then("^Click on scorecard$")
public void click_on_scorecard()  {
	matchPage.ClickOnScorecard();
}

@Then("^Fetching scorecard details$")
public void Fetching_scorecard_details() throws IOException {
	
	matchPage.FetchingScorecard();
}

@Then("^Quit the browser$")
public void quit_the_browser() {
	
	matchPage.quitBrowser();
}
	
	

	
}
