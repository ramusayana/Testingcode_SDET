package com.corejava.selenium.adavances.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class learnWindow {
	
	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
	 	 
	 	 ChromeDriver driver = new ChromeDriver();
	 	 
	 	 driver.get("https://www.naukri.com/");
	 	 
	 	 driver.manage().window().maximize();
	 	 
	 	String  currnetwindow=driver.getWindowHandle();
	 	
	 	System.out.println(currnetwindow);
	 	
	 	
	 	// to find all the unique locators of all windows
	 	
	 	Set<String> allwindowhandles = driver.getWindowHandles();
	 	
	 	
	 	
	 	System.out.println(allwindowhandles.size());
	 	
	 	List<String> list = new ArrayList<String>(allwindowhandles);
	 	
	 	// to go to unique reference of 2nd window
	 	
	 	 String Uniqueref = list.get(1);
	 	
	 	driver.switchTo().window(Uniqueref);
	 	
//	 	 System.out.println(driver.getCurrentUrl());
	 	 
	 	System.out.println(driver.getTitle());
	 	 
	 	 
	 
	 	 
	 	 
	 	
	 	
	 	
	 	
	 	
	 	 
		
	}

}
