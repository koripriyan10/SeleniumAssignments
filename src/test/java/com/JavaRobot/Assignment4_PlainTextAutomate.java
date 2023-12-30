package com.JavaRobot;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utility.Library;

public class Assignment4_PlainTextAutomate extends Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.setProperty("webdriver.gecko.driver","D:\\JavaWorkSpace\\Selenium_LiveCourse_2204101110\\src\\test\\resources\\firefoxdriver-v33\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
	    String JavaTxt = 	driver.findElement(By.xpath("//p[@class=\"card-title fw-bold h6\" and text()=\"Java\"]")).getText();
	    String PythonTxt = 	driver.findElement(By.xpath("//p[@class=\"card-title fw-bold h6\" and text()=\"Python\"]")).getText();
		System.out.println(JavaTxt);
		System.out.println(PythonTxt);
		driver.quit();
	}

}
