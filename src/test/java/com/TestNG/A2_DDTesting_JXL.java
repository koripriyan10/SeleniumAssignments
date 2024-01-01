package com.TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.utility.Library;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class A2_DDTesting_JXL extends Library {

	@Test
	public void LauchBrowser() {
		System.setProperty("webdriver.gecko.driver",
				"D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\firefoxdriver-v33\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void ValidateLogin() throws InterruptedException, BiffException, IOException {
		
		ReadPropertiesFile();
		Workbook wb = Workbook.getWorkbook(new File("D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\Sample.xls"));
		Sheet sh = wb.getSheet("abc");
		
		for(int i=1; i < sh.getRows(); i++ )
		{
 	 
			WebElement username = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
			WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
			
			username.sendKeys(sh.getCell(0,i).getContents());
			password.sendKeys(sh.getCell(1,i).getContents());
			
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
		    Thread.sleep(5000);	    
		    driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();	
			
		}
		

		driver.quit();

	}
}
