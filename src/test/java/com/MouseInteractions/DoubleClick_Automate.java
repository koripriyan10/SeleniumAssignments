package com.MouseInteractions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.utility.Library;

public class DoubleClick_Automate extends Library {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\chromedriver-v119\\chromedriver.exe");
	     driver = new ChromeDriver();
		 driver.get("https://only-testing-blog.blogspot.com/2014/09/selectable.html");
		 driver.manage().window().maximize();
		 WebElement elm = driver.findElement(By.xpath("//button[contains(text(),\"Double-Click Me To See Alert\")]"));
		 Actions objActions = new Actions(driver);
		 objActions.doubleClick(elm).build().perform();
		 Thread.sleep(5000);
		 Alert alert =  driver.switchTo().alert();
		 alert.accept();		 
		 driver.quit();
	}

}
