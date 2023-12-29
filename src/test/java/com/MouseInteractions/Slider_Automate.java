package com.MouseInteractions;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.utility.Library;

public class Slider_Automate extends Library {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\chromedriver-v119\\chromedriver.exe");
	     driver = new ChromeDriver();
		 driver.get("https://only-testing-blog.blogspot.com/2014/09/selectable.html");
		 driver.manage().window().maximize();
		 WebElement elmSlider = driver.findElement(By.xpath("//div[@id='slider']/span"));
		 Actions move = new Actions(driver);
		 move.moveToElement(elmSlider).clickAndHold().moveByOffset(40,0).release().perform();
		 Thread.sleep(5000);
		 driver.close();
	}

}
