package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifycheckbox1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
			 
			 ChromeDriver driver = new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 
			 driver.get("https://devlabs-860f0.web.app/radiobutton");
			 
			 WebElement firstradio = driver.findElement(By.id("name1"));
			 
//			 if(!firstradio.isSelected()) {
//				 firstradio.click();
//				 }
//				 else {
//					 
//					 System.out.println("not selected");
//					 
//				 }
			 
			 if(firstradio.isSelected()) {
				System.out.println(" not selected");;
				 }
				 else {
					 
					 System.out.println("checkbox  not selected");
					 
				 }
			 
			 driver.quit();
			 }
	}


