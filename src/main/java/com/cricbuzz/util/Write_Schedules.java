package com.cricbuzz.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;

import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import com.cricbuzz.BaseClass;
import com.cricbuzz.Pages.SchedulePage;
import com.cricbuzz.Pages.SeriesPage;



public class Write_Schedules extends BaseClass{
	
	static File source;
	static FileInputStream fis;
	static FileOutputStream fos;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet=null;
	
	static int indexOfSaturtday=0;

	


	public static String date="";
	public static String details="";
	public static String detailNew="";
    public static String series="";
    public static String month="";
	  
	static Write_Schedules write=null;
	static List<String> dates=null;
	static int dateRow=0;
	
	
	public Write_Schedules() throws IOException{

		source=new File("C:\\Users\\Pradeep Prabhaharan\\Desktop\\Cricbuzz.xlsx");
		
		fis =new FileInputStream(source);
		
		workbook=new XSSFWorkbook(fis);
	}
	
	public void FeedingSchedules() throws IOException {
		
		 int rowCount=1;
		 int index=0;
			
			sheet=workbook.getSheet("Scenario_1");                                
			
			if(sheet!=null) {
				index =workbook.getSheetIndex("Scenario_1");                     // To get the index of the sheet
				workbook.removeSheetAt(index);                                   // Removing the sheet using index
			}
			sheet=workbook.createSheet("Scenario_1");
		
		
		for(int i=0;i<SchedulePage.matchDate.size();i++) {
			
			
		if (!SchedulePage.matchDate.get(i).getText().contains("SAT")) {                           // Removing SATURDAY matches
			
			date=SchedulePage.matchDate.get(i).getText();
			
			String detail1=driver.findElement(By.xpath("//*[@id='international-list']/div["+(i+1)+"]")).getText().toString();
			detailNew=detail1.replace(date, "");
			
			
			sheet.createRow(rowCount).createCell(0).setCellValue(date);
			sheet.getRow(rowCount).createCell(1).setCellValue(detailNew);
			
			rowCount++;
			
			}
		
		    XSSFRow dateRow=sheet.createRow(0);                                                    // Setting font Style for Headers
			XSSFCell dateCell=dateRow.createCell(0);
			XSSFCellStyle dateStyle=workbook.createCellStyle();
			XSSFFont dateFont=workbook.createFont();
			dateFont.setBold(true);
			dateFont.setFontHeight(10);                   
			dateFont.setFontName("Lucida Fax");
			dateStyle.setFont(dateFont);
			
			dateCell.setCellStyle(dateStyle);
			dateCell.setCellValue("Date"); 
		
			
				XSSFRow detailsRow=sheet.getRow(0);
				XSSFCell detailsCell=detailsRow.createCell(1);
				XSSFCellStyle detailsStyle=workbook.createCellStyle();
				XSSFFont detailsFont=workbook.createFont();
				detailsFont.setBold(true);
				detailsFont.setFontHeight(10);                   
				detailsFont.setFontName("Lucida Fax");
				detailsStyle.setFont(detailsFont);
				
				detailsCell.setCellStyle(detailsStyle);
				detailsCell.setCellValue("Match Details"); 
				
			
			
		}
	
	}
	
	
	public void FeedingAustraliaSeries() throws IOException {
		
		 int rowCount=1;
		 int index=0;
			
			sheet=workbook.getSheet("Scenario_2");                                
			
			if(sheet!=null) {
				index =workbook.getSheetIndex("Scenario_2");                     // To get the index of the sheet
				workbook.removeSheetAt(index);                                   // Removing the sheet using index
			}
			
			
			sheet=workbook.createSheet("Scenario_2");
			
		
		for(int i=0;i<SeriesPage.seriesDetails.size();i++) {
			
	  if(SeriesPage.seriesDetails.get(i).getText().contains("Australia")) {
		  
		  month=SeriesPage.month.get(i).getText().toString();
		  
		  String series1=SeriesPage.seriesDetails.get(i).getText().toString();
		  
		  series=series1.replace(month, "");
		  
		  
		
		  
		    XSSFRow monthRow=sheet.createRow(0);                                                    // Setting font Style for Headers
			XSSFCell monthCell=monthRow.createCell(0);
			XSSFCellStyle monthStyle=workbook.createCellStyle();
			XSSFFont monthFont=workbook.createFont();
			monthFont.setBold(true);
			monthFont.setFontHeight(10);                   
			monthFont.setFontName("Lucida Fax");
			monthStyle.setFont(monthFont);
			
			monthCell.setCellStyle(monthStyle);
			monthCell.setCellValue("Month"); 
		
		
			
		
				XSSFRow detailsRow=sheet.getRow(0);
				XSSFCell detailsCell=detailsRow.createCell(1);
				XSSFCellStyle detailsStyle=workbook.createCellStyle();
				XSSFFont detailsFont=workbook.createFont();
				detailsFont.setBold(true);
				detailsFont.setFontHeight(10);                   
				detailsFont.setFontName("Lucida Fax");
				detailsStyle.setFont(detailsFont);
				
				detailsCell.setCellStyle(detailsStyle);
				detailsCell.setCellValue("Australia Series Details"); 
				
				sheet.createRow(rowCount).createCell(0).setCellValue(month);
				sheet.getRow(rowCount).createCell(1).setCellValue(series);
		  
		        rowCount++;
		  
		  
	  }
	      
	}
		


	}
	
	
	public static void closeExcel() throws IOException {                                // Closing the excel file

	    fos=new FileOutputStream(source);
		workbook.write(fos);
		workbook.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
