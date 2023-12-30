package com.JavaRobot;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.utility.Library;

public class Assignment2_FileDownload extends Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\JavaWorkSpace\\Selenium_LiveCourse_2204101110\\src\\test\\resources\\firefoxdriver-v33\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//p[@class=\"card-text m-0 pb-1\"]/preceding::p[text()=\"Java\"]")).click();
		
		//Automate File download
		
		driver.close();
	}

}
