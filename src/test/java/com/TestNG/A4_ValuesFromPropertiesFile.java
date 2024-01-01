package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import com.utility.Library;

public class A4_ValuesFromPropertiesFile extends Library {
	 @Test(priority=0)
	  public void LauchBrowser() {
		 System.setProperty("webdriver.gecko.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\firefoxdriver-v33\\geckodriver.exe");
			driver = new FirefoxDriver();
		    driver.get("https://www.saucedemo.com/");	   
		    driver.manage().window().maximize();
	  }
	  
	  @Test(priority=1)
	  public void ValidateLogin() throws InterruptedException {
		    ReadPropertiesFile();
		    
		    System.out.println(objProperties.getProperty("SauceDemostandard_user"));
		    System.out.println(objProperties.getProperty("SauceDemoPassword"));
		    
		    driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys(objProperties.getProperty("SauceDemostandard_user"));
		    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(objProperties.getProperty("SauceDemoPassword"));
		    driver.findElement(By.xpath("//input[@id='login-button']")).click();
		    driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
		    Thread.sleep(5000);	    
		    driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();		 	
		    
		    driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys(objProperties.getProperty("SauceDemoproblem_user"));
		    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(objProperties.getProperty("SauceDemoPassword"));
		    driver.findElement(By.xpath("//input[@id='login-button']")).click();
		    driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
		    Thread.sleep(5000);	    
		    driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();		
		    
		    
		    driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys(objProperties.getProperty("SauceDemoperformance_glitch_user"));
		    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(objProperties.getProperty("SauceDemoPassword"));
		    driver.findElement(By.xpath("//input[@id='login-button']")).click();
		    Thread.sleep(10000);	
		    driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
		    Thread.sleep(5000);	    
		    driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();		

		    driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys(objProperties.getProperty("SauceDemoerror_user"));
		    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(objProperties.getProperty("SauceDemoPassword"));
		    driver.findElement(By.xpath("//input[@id='login-button']")).click();
		    driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
		    Thread.sleep(5000);	
		    driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();		

		    driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys(objProperties.getProperty("SauceDemovisual_user"));
		    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(objProperties.getProperty("SauceDemoPassword"));
		    driver.findElement(By.xpath("//input[@id='login-button']")).click();
		    driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();		
    	    driver.quit();
		    
		    
	  }
}
