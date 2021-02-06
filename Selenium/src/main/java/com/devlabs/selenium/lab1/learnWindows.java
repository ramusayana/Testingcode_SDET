package com.devlabs.selenium.lab1;

import org.openqa.selenium.chrome.ChromeDriver;

public class learnWindows {

	
	
	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
	 	 
	 	 ChromeDriver driver = new ChromeDriver();
	 	 
	 	 driver.get("https://www.naukri.com/");
	 	 
	 	 driver.manage().window().maximize();
	 	 
	 	String  currnetwindow =driver.getWindowHandle();
	 	 
		
	}
}
