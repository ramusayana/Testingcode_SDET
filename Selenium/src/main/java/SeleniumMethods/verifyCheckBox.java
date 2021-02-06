package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyCheckBox {
	
	public static void main(String[] args) {
		
	     System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
			 
			 ChromeDriver driver = new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 
			 driver.get("https://devlabs-860f0.web.app/radiobutton");
			 
//			 boolean status = driver.findElement(By.name("selected")).isSelected();
			 
			 driver.findElement(By.name("selected")).isSelected();
			 
			 if(driver.findElement(By.name("selected")).isSelected()) {
				 System.out.println("locator selected ");
				 
			 }
			 else { 
				 
				 System.out.println("not selected");
			 
			 }

             
			 
			 
             
             driver.getCurrentUrl();
             
             driver.quit();
	
}
}
