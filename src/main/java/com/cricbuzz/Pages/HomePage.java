 /*  @author Pramoth_Prabaharan */

package com.cricbuzz.Pages;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cricbuzz.BaseClass;

import junit.framework.Assert;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//a[contains(text(),'Schedule')]")
	WebElement schedule;
	

	

	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	
	}
	
	public void validateHomePageTitle() {
		String title=driver.getTitle();
		
		Assert.assertEquals("Cricket Score, Schedule, Latest News, Stats & Videos | Cricbuzz.com", title);
	
	}
	
	public void clickOnSchedule() {
		
		schedule.click();
	
	}
	
	
	
	
	

}
