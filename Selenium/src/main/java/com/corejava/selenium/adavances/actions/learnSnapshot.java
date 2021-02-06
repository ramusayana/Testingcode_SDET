package com.corejava.selenium.adavances.actions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class learnSnapshot {

	
	public static void main(String[] args) throws IOException {
	
	 System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
	 
	 ChromeDriver driver = new ChromeDriver();
	 
	 driver.get("https://devlabs-860f0.web.app/aui");
	 
	 driver.manage().window().maximize();
	 
	 
	WebElement element =driver.findElement(By.id("draggable"));
	 
	 //find hte drop point
	
	 WebElement target =driver.findElement(By.id("droppable"));
	 
	 // create a object for actions class
	 Actions builder = new Actions(driver);
	 
//	 builder.dragAndDrop(element , target).perform();
	 
	 builder.keyDown(Keys.CONTROL).dragAndDrop(element, target).perform();
	 
	 // take a snap and moving to temp
	  File temp =driver.getScreenshotAs(OutputType.FILE);
	  
	  
	  //creating an empty image
	  
	  File img = new File("./snaps/img001");
	  
	  FileUtils.copyDirectory(temp, img);
	  
	  File  temp1 = target.getScreenshotAs(OutputType.FILE);
	  
	  File img1 = new File("./snaps/img002.png");
	  
	  FileUtils.copyFile(temp1, img1);
	
	}
}
