package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifications {
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://dotclicklabs.blogspot.com/");
	    
	      driver.findElement(By.linkText("HOME")).click();
	    
	    if(driver.getTitle().equalsIgnoreCase("HOME")){
	    	System.out.println("test passed");}
	    else {
	    		System.out.println("test failed");
	    	}
// currently there is cookies enabled for "OK" Need to find solution
//	    driver.findElement(By.id("Btn_2")).click();

	    
//	    if(driver.findElement(By.id("display_1")).getText().equalsIgnoreCase("OMG..You Clicked Me!")) {
//	    	System.out.println("OMG Passed");
//	    }
//	    else {
//	    	System.out.println("OMG Failed");
//	    }
	    WebElement button =driver.findElement(By.id("Btn_1"));
	    
	 if (button.isEnabled()) {
		 System.out.println("test is failed");
	 }
	 else {
		 System.out.println("test is  passed");
	 }
	    
    
	    driver.quit();
	 
}
}
