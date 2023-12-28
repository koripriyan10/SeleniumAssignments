package com.BrowserAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Library;

public class Assignment2 extends Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.setProperty("webdriver.chrome.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\chromedriver-v120\\chromedriver.exe");
	    WebDriver chromedriver = new ChromeDriver();
	    chromedriver.get("https://netbanking.hdfcbank.com/netbanking/");
	    chromedriver.manage().window().maximize();
	    System.out.println(chromedriver.getTitle());
	    ReadPropertiesFile();
	    chromedriver.switchTo().frame("login_page");
	    chromedriver.findElement(By.xpath("//*[@id=\"nortonimg1\"]/div[2]/span[2]/a")).click();
	    String mainWindowHandle = chromedriver.getWindowHandles().iterator().next();
	    		
	    Set<String> AllWindows = chromedriver.getWindowHandles();
	    
	    for(String IndividualWindow :AllWindows)
		 {
	    	chromedriver.switchTo().window(IndividualWindow);
	    	String NewWindowTitle = chromedriver.getTitle();
	        if(NewWindowTitle.equals(objProperties.getProperty("newBrowserWindowTitle")))
	        {
	        	System.out.println(NewWindowTitle);
	        }		     
		 } 
	    
	     chromedriver.switchTo().window(mainWindowHandle);
	     System.out.println(chromedriver.getTitle());
	     chromedriver.close();
	}

}
