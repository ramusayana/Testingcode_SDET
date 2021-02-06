package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertui {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devlabs-860f0.web.app/alert");
	    driver.findElement(By.id("12345rtf")).click();
	    
	     Alert promptAlert  = driver.switchTo().alert();
	    
	     promptAlert.accept();
	     
	     System.out.println("Alert Accepted");
	    
	    driver.quit();
		
	}

}
