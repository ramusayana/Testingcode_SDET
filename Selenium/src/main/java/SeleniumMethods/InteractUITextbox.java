package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractUITextbox {

	public static void main(String[] args) {
	
     System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
		 
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://devlabs-860f0.web.app/edit");
		 
		 driver.findElement(By.id("fullName")).sendKeys("SATYA");
		 
		 String defaultvalue = driver.findElement(By.id("join")).getAttribute("value");
		 
		 if(!defaultvalue.equals("I am good")) {
			 System.out.println("Im in not condition");
		 }
		 else {
			 
			 System.out.println("I am good");
		 
		 }
		 
		 driver.quit();
		 

	}

}
