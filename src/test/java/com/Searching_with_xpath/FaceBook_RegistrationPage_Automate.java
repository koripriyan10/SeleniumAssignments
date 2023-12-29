package com.Searching_with_xpath;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_RegistrationPage_Automate {
    
    public static String firstWinHandle;
    public static String secondWinHandle;
    
	public static void main(String[] args) throws InterruptedException {
		
		
		
//		1. Automate Facebook Registration Page using Direct Locator's in Chrome
//		Browser https://www.facebook.com/r.php
		
//		2. Automate dropdowns part of Facebook Registration Page using Direct
//		Locator's in Firefox Browser- https://www.facebook.com/r.php

		
		System.setProperty("webdriver.chrome.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\chromedriver-v119\\chromedriver.exe");
	    WebDriver chromedriver = new ChromeDriver();
	    chromedriver.navigate().to("https://www.facebook.com/r.php");
	    chromedriver.manage().window().maximize();	 
	    
	    String HeaderTitle = chromedriver.findElement(By.xpath("//img[@class=\"fb_logo _agiv img\"]")).getAttribute("alt");
	    System.out.println("HeaderText-"+ HeaderTitle);
	    
	    chromedriver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Koripriyan");
	    chromedriver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Chokkalingam");
	    chromedriver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("koripriyan@gmail.com");
	    chromedriver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("CATkori$56");
	    
	    
	    chromedriver.findElement(By.xpath("//select[@name=\"birthday_day\"]")).click();
	    WebElement SelBirthDay =  chromedriver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
	    Select SelectDay = new Select(SelBirthDay);
	    SelectDay.selectByValue("5");
	    chromedriver.findElement(By.xpath("//select[@name=\"birthday_day\"]")).click();
	    
	    
	    chromedriver.findElement(By.xpath("//select[@name=\"birthday_month\"]")).click();
	    WebElement SelBirthMonth =  chromedriver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));	    
	    Select SelectMonth = new Select(SelBirthMonth);
	    SelectMonth.selectByVisibleText("Apr");
	    chromedriver.findElement(By.xpath("//select[@name=\"birthday_month\"]")).click();
	    
	    chromedriver.findElement(By.xpath("//select[@name=\"birthday_year\"]")).click();
	    WebElement SelBirthYear =  chromedriver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
	    Select SelectYear = new Select(SelBirthYear);
	    SelectYear.selectByVisibleText("1993");
	    chromedriver.findElement(By.xpath("//select[@name=\"birthday_year\"]")).click();
	    
	    chromedriver.findElement(By.xpath("//label[@class=\"_58mt\" and contains(text(),\"Male\")]")).click();
	    

	    	    
	    System.setProperty("webdriver.gecko.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\firefoxdriver-v33\\geckodriver.exe");
	    WebDriver firefoxdriver = new FirefoxDriver();
	    firefoxdriver.navigate().to("https://www.facebook.com/r.php");
	    firefoxdriver.manage().window().maximize();	    
	    
	    firefoxdriver.findElement(By.xpath("//select[@name=\"birthday_day\"]")).click();
	    WebElement SelFireFoxBirthDay =  firefoxdriver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
	    Select SelectFireFoxDay = new Select(SelFireFoxBirthDay);
	    SelectFireFoxDay.selectByValue("5");
	    firefoxdriver.findElement(By.xpath("//select[@name=\"birthday_day\"]")).click();
	    
	    
	    firefoxdriver.findElement(By.xpath("//select[@name=\"birthday_month\"]")).click();
	    WebElement SelFireFoxBirthMonth =  firefoxdriver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));	    
	    Select SelectFireFoxMonth = new Select(SelFireFoxBirthMonth);
	    SelectFireFoxMonth.selectByVisibleText("Apr");
	    firefoxdriver.findElement(By.xpath("//select[@name=\"birthday_month\"]")).click();
	    
	    firefoxdriver.findElement(By.xpath("//select[@name=\"birthday_year\"]")).click();
	    WebElement SelFireFoxBirthYear =  firefoxdriver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
	    Select SelectFireFoxYear = new Select(SelFireFoxBirthYear);
	    SelectFireFoxYear.selectByVisibleText("1993");
	    firefoxdriver.findElement(By.xpath("//select[@name=\"birthday_year\"]")).click();
	    
	    
	  }
	}
