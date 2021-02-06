package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertUIPrompt {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devlabs-860f0.web.app/alert");
	    driver.findElement(By.id("zxcvbnm")).click();
	    
	   Alert confirmalert  =driver.switchTo().alert();
	    
	   confirmalert.dismiss();
	   
	   System.out.println("Not accepeted");
	   
	   driver.quit();
	    
	    }

}
