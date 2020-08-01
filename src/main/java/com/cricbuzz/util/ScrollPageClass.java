package com.cricbuzz.util;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import com.cricbuzz.BaseClass;

public class ScrollPageClass extends BaseClass {

	public ScrollPageClass() throws IOException {
		super();
		
	}

	public static void ScrollPage() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		try{
			long lastHeight= ((Number) js.executeScript("return document.body.scrollHeight")).longValue();
			
			while(true) {
				js.executeScript("window.scrollBy(0,2000)", "");
				Thread.sleep(2000);
				
				long newHeight = ((Number) js.executeScript("return document.body.scrollHeight")).longValue();
				
				if(newHeight==lastHeight) {
					break;
				}
				lastHeight=newHeight;
			}
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		
	}
	
	
	
	
	
	
	
	
	
}
