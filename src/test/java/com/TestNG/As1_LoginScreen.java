package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.utility.Library;

public class As1_LoginScreen extends Library {
 

  @Test(priority=0)
  public void LauchBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\chromedriver-v119\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");	 
	    driver.manage().window().maximize();
	    
  }
  
  @Test(priority=1)
  public void ValidateLogin() throws InterruptedException {
	  
	    //Using hard Coded values to Automate Sauce Demo Website
	  
	    driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
	    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
	    Thread.sleep(5000);	    
	    driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();		
	    
   
	    Thread.sleep(5000);	    
	    driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("problem_user");
	    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
	    Thread.sleep(5000);	 
	    driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	    
	    driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("performance_glitch_user");
	    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
	    Thread.sleep(5000);	 
	    driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	    
	    driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("error_user");
	    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
	    Thread.sleep(5000);	 
	    driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	    
	    driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("visual_user");
	    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
	    Thread.sleep(5000);	 
	    driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	    Thread.sleep(2000);	 
        driver.quit();
	   	    
  }
}
