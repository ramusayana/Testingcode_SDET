package com.devlabs.selenium.lab1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDWait {
	
	public static void main(String[] args) {
		
		

		 System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
		 
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/");
		 
		 driver.manage().window().maximize();
		 
		
		 
		 // you can create an object to class for webdriver wait class onetime activity created instance for webdriver class
         
		 WebDriverWait wait = new WebDriverWait(driver ,15);
		 
		 // expected conditions lot of classes
		
//		 wait.until(ExpectedConditions.visibilityOf(e);

}
}
