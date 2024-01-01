package com.FrameworkAndSync;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Library;

import com.Pages.LoginScreenObjects;

public class As4_LoginScreenAutomate extends Library {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	   	 System.setProperty("webdriver.chrome.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\chromedriver-v119\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("https://www.saucedemo.com/");
	     driver.manage().window().maximize();
	     driver.findElement(LoginScreenObjects.username).clear();
	     driver.findElement(LoginScreenObjects.password).clear();
	     driver.findElement(LoginScreenObjects.username).sendKeys("standard_user");
	     driver.findElement(LoginScreenObjects.password).sendKeys("secret_sauce");
	     String fontfamily =  driver.findElement(By.xpath("//div[@class='login_logo']")).getCssValue("font-family");
	     String BgColor =  driver.findElement(By.tagName("body")).getCssValue("background-color");
	     System.out.println(fontfamily);
	     System.out.println(BgColor);
	     Thread.sleep(5000);
	     driver.findElement(LoginScreenObjects.login).click();
	     driver.quit();
	}

}
