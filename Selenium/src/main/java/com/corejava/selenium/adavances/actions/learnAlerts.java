package com.corejava.selenium.adavances.actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnAlerts {
 public static void main(String[] args) {
	 
System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
	 
	 ChromeDriver driver = new ChromeDriver();
	 
	 driver.get("https://devlabs-860f0.web.app/alert");
	 
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.id("aswdefr")).click();
	 
	 // swtich to alert
	 
	 Alert alert = driver.switchTo().alert();
	 
	 System.out.println(alert.getText());
	 
	 alert.sendKeys("devlabs");
	 
//	 alert.accept();
//	 alert.dismiss();
	 
	 
	 
	  
	
}
}
