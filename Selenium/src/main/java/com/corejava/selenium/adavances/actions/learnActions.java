package com.corejava.selenium.adavances.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class learnActions {

	
	public static void main(String[] args) {
		
		

		 System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
		 
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://devlabs-860f0.web.app/aui");
		 
		 driver.manage().window().maximize();
		 
		 
		WebElement element =driver.findElement(By.id("draggable"));
		 
		 //find hte drop point
		
		 WebElement target =driver.findElement(By.id("droppable"));
		 
		 // create a object for actions class
		 Actions builder = new Actions(driver);
		 
		 builder.dragAndDrop(element , target).perform();
		 
		 
		 
		 
	}
}
