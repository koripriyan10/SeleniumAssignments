package com.MouseInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.utility.Library;

public class MouseMove_Click_Automate extends Library {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		 System.setProperty("webdriver.chrome.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\chromedriver-v119\\chromedriver.exe");
	     driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com");
		 driver.manage().window().maximize();

		 
		 driver.findElement(By.xpath("//span[@class=\"_30XB9F\"]")).click();
		 Thread.sleep(5000);
		 Actions objActions = new Actions(driver);
		 WebElement elm = driver.findElement(By.xpath("//span[contains(text(),\"Fashion\")]/following-sibling::span"));
		 objActions.moveToElement(elm);
    	 objActions.build().perform();
    	 driver.findElement(By.xpath("//a[contains(text(),\"Women Footwear\")]")).click();
    	 driver.close();
	}

}
