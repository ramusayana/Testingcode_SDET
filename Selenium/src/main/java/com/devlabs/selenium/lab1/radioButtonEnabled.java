package com.devlabs.selenium.lab1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtonEnabled {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devlabs-860f0.web.app/edit");
		// this shoudl return False
//	  driver.findElement(By.id("noEdit")).isEnabled();
		
		if(!driver.findElement(By.id("noEdit")).isEnabled()) {
		System.out.println("button is enabled");
		}
		else {
			System.out.println("button is diabled");
		}
		driver.quit();
	}
}
