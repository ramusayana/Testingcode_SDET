package SeleniumMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJavaScripts {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/kodandaram/eclipse-workspace/SDET-Workspace/SDET2-Workspace/Selenium/drivers/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://dotclicklabs.blogspot.com/p/home.html");
	
	// to create or initate javascript executor
	JavascriptExecutor js =(JavascriptExecutor)driver;
	
//	js.executeScript("your java script", "optional argument");
	
 js.executeScript("document.getElementById('Btn_2').click()", "optional argument");
	
	js.executeScript("document.getElementById('fname').value ='ramu'");
	
	//scroll webpage
	js.executeScript("window.scrollBy(100,10)");
	
	System.out.println("js executed");

	driver.quit();
		
}
}
