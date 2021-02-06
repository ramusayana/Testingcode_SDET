package SeleniumMethods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class verifyassert {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
	}
	
	@Test
	public void Test_Homepage() {
		
		driver.get("https://dotclicklabs.blogspot.com/");
		
	    driver.findElement(By.linkText("HOME")).click();
	    
	assertEquals(driver.getTitle(), "HOME");
	
	assertFalse(driver.findElement(By.id("Btn_1")).isEnabled(), "oh failed button is  enabled");
		
	}
	

	@AfterTest
	public void afterTest() {
	}

}
