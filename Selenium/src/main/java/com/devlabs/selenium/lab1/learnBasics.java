package com.devlabs.selenium.lab1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnBasics {
 public static void main(String[] args) {
	
	 // open chrome browser
	 System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
	 
	 ChromeDriver driver = new ChromeDriver();
	 
	 driver.get("https://devlabs-860f0.web.app/edit");
	 
	 driver.manage().window().maximize();
	 
	  String title=driver.getTitle();
	 System.out.println(title);
	 
	 WebElement elementfirstnametextbox = driver.findElement(By.id("fullName"));
	  elementfirstnametextbox.sendKeys("ramu");
	  
	  driver.findElement(By.id("join")).sendKeys("humanbeing" , Keys.TAB);
	  
	  
	 
	 driver.close();
}
}
