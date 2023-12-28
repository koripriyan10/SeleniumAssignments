package com.BrowserAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\chromedriver-v120\\chromedriver.exe");
	    WebDriver chromedriver = new ChromeDriver();
	    chromedriver.navigate().to("https://www.google.com");
	    chromedriver.manage().window().maximize();	    
	    System.out.println(chromedriver.getCurrentUrl());
	    Thread.sleep(5000);
	    chromedriver.navigate().to("https://www.selenium.dev/");
	    System.out.println(chromedriver.getCurrentUrl());
	    Thread.sleep(5000);
	    chromedriver.navigate().back();
	    System.out.println(chromedriver.getCurrentUrl());
	    Thread.sleep(5000);
	    chromedriver.navigate().forward();
	    System.out.println(chromedriver.getCurrentUrl());
	    Thread.sleep(5000);
	    chromedriver.navigate().refresh();
	    Thread.sleep(5000);
	    System.out.println(chromedriver.getCurrentUrl());
	    chromedriver.quit();

	}

}
