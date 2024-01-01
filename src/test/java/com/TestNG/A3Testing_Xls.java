package com.TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.utility.Library;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class A3Testing_Xls extends Library {
  
	
  @Test(priority=0)
  public void LauchBrowser() 
  {
	    System.setProperty("webdriver.chrome.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\chromedriver-v119\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");	
	    driver.manage().window().maximize();
  }
  
  @Test(priority=1)
  public void ValidateLogin() throws BiffException, IOException, InterruptedException 
  {
	  Workbook wb = Workbook.getWorkbook(new File("D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\Sample.xls"));
		Sheet sh = wb.getSheet("abc");
		
		for(int i=1; i < sh.getRows(); i++ )
		{
			
			WebElement fname = driver.findElement(By.xpath("//input[@id='user-name']"));
			WebElement lname = driver.findElement(By.xpath("//input[@id='password']"));
			
			fname.sendKeys(sh.getCell(0,i).getContents());
			lname.sendKeys(sh.getCell(1,i).getContents());
			
			driver.findElement(By.xpath("//input[@id='login-button']")).click();

			Thread.sleep(5000);

			driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		}
		
		Thread.sleep(5000);
		driver.quit();
  }
}
