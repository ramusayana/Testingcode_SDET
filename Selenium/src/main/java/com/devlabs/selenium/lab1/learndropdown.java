package com.devlabs.selenium.lab1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class learndropdown {

	public static void main(String[] args) {
		
		

		 System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
		 
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://devlabs-860f0.web.app/dropdown");
		 
		 driver.manage().window().maximize();
		 
		 WebElement elementdropdownbox =driver.findElement(By.id("Index"));
		 
		 Select dd = new Select(elementdropdownbox);
		 
//		 dd.selectByIndex(2);
//		 
//		 dd.selectByVisibleText("Mango");
//		 
//		 dd.selectByValue("1");
		
		 List<WebElement> options =   dd.getOptions();
		 
		 System.out.println("no. of options available " + options.size());
		 
		 for (WebElement  eachOption : options) {
			 System.out.println(eachOption.getText());
			 
		 }
		 
		 driver.close();
		 
		 
		 
		 
		 
	}

}
