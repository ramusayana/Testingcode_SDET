package SeleniumMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleWindow {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devlabs-860f0.web.app/window");
	    driver.findElement(By.id("mye")).click();
	    
	    Set<String> windowhandles = driver.getWindowHandles();
	    
        System.out.println(windowhandles.size());
	    
	    for (String windowhandle : windowhandles) {
	    	
	    	System.out.println( windowhandle);
			
		}
		
		
			driver.quit();
	}

}
