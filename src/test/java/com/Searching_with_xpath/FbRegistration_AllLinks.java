package com.Searching_with_xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbRegistration_AllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\chromedriver-v119\\chromedriver.exe");
	    WebDriver chromedriver = new ChromeDriver();
	    chromedriver.navigate().to("https://www.facebook.com");
	    chromedriver.manage().window().maximize();	    
	    List<WebElement> Anchortag = chromedriver.findElements(By.tagName("a"));
	    int count = Anchortag.size();
	    
	    System.out.println("Number of Link Tags in facebook page -"+count); 
	}

}
