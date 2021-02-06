package com.devlabs.selenium.lab1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listDropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://devlabs-860f0.web.app/dropdown");
	
	// getOptions() will retrieve all the options in Dropdown
	
	WebElement elements = driver.findElement(By.id("Index"));
	Select ele = new Select(elements);
    List<WebElement> listoptions=ele.getOptions();
    
//    for (WebElement drop : listoptions) {
//		System.out.println(drop.getText());
//	}
   for (int i = 0; i <listoptions.size(); i++) {
	System.out.println(i);
}
   
   
    
	driver.quit();
}
}
