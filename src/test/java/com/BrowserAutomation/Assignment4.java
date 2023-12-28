package com.BrowserAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utility.Library;

public class Assignment4 extends Library {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\firefoxdriver-v33\\geckodriver.exe");
		WebDriver FirefoxDriver = new FirefoxDriver();
		FirefoxDriver.get("https://netbanking.hdfcbank.com/netbanking/");
		FirefoxDriver.manage().window().maximize();
	    System.out.println(FirefoxDriver.getTitle());
	    ReadPropertiesFile();
	    FirefoxDriver.switchTo().frame("login_page");
	    FirefoxDriver.findElement(By.xpath("//*[@id=\"nortonimg1\"]/div[2]/span[2]/a")).click();
	    String mainWindowHandle = FirefoxDriver.getWindowHandles().iterator().next();
	    		
	    Set<String> AllWindows = FirefoxDriver.getWindowHandles();
	    
	    for(String IndividualWindow :AllWindows)
		 {
	    	FirefoxDriver.switchTo().window(IndividualWindow);
	    	String NewWindowTitle = FirefoxDriver.getTitle();
	        if(NewWindowTitle.equals(objProperties.getProperty("newBrowserWindowTitle")))
	        {
	        	System.out.println(NewWindowTitle);
	        	
	        	//FirefoxDriver.close();
	        }		     
		 } 
	    
	    Thread.sleep(10000);
	    FirefoxDriver.close();
	    FirefoxDriver.switchTo().window(mainWindowHandle);
	    System.out.println(FirefoxDriver.getTitle());
	    Thread.sleep(8000);
	    FirefoxDriver.close();

	}

}
