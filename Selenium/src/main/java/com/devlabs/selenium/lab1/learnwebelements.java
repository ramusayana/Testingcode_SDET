package com.devlabs.selenium.lab1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnwebelements {

	public static void main(String[] args) {
		
		

		 System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
		 
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/");
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("onePlus 8", Keys.ENTER);
		 
		 // to find the multiple elements in single page dont use find element
		 
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		
		for (WebElement eachElement : elements) {
			System.out.println(eachElement.getText());
		}
		
		

	}

}
