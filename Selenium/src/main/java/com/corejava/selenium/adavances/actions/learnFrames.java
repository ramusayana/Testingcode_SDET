package com.corejava.selenium.adavances.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnFrames {

	
	 public static void main(String[] args) {
		 
		 System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
		 	 
		 	 ChromeDriver driver = new ChromeDriver();
		 	 
		 	 driver.get("https://jqueryui.com/selectable/");
		 	 
		 	 driver.manage().window().maximize();
		 	 
		 	 driver.switchTo().frame(0);
		 	 
//		 	 driver.switchTo().frame("demoFrame");
//		 	 
//		 	 WebElement element = driver.findElement(By.id(demoFrame));
//		 	 
//		 	 driver.switchTo().frame(frameElement);
		 	 
		 WebElement	element= driver.findElement(By.xpath("//li[@class=\"ui-widget-content ui-selectee ui-selected\"]"));
		 	 
		 element.click();
		 
		 driver.switchTo().defaultContent();
		 
		 driver.findElement(By.linkText("Download")).click();
		 
		 
		 	 
		 	 
	 }	 	 
}
