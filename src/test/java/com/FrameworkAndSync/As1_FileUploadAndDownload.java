package com.FrameworkAndSync;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.Library;

public class As1_FileUploadAndDownload extends Library {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\chromedriver-v119\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("https://smallpdf.com/word-to-pdf");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//span[contains(text(),\"Choose Files\")]")).click();
	     
	     File objFile = new File(System.getProperty("user.dir") + "//src//test//resources//TestDoc.docx");

			StringSelection ObjStringSelection = new StringSelection(objFile.toString());
			Clipboard objClipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			objClipboard.setContents(ObjStringSelection, null);

			Transferable objTransferable = objClipboard.getContents(null);

			if (objTransferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
				try {
					System.out.println(objTransferable.getTransferData(DataFlavor.stringFlavor));
				}

				catch (Exception e) {
					e.printStackTrace();
					
				}
			}
			
			try {
				Thread.sleep(5000);
				Robot objRoot = new Robot();

				objRoot.keyPress(KeyEvent.VK_CONTROL);
				objRoot.keyPress(KeyEvent.VK_V);

				objRoot.keyRelease(KeyEvent.VK_V);
				objRoot.keyRelease(KeyEvent.VK_CONTROL);

				objRoot.keyPress(KeyEvent.VK_ENTER);
				objRoot.keyRelease(KeyEvent.VK_ENTER);

			}

			catch (AWTException e) {
				e.printStackTrace();
			}
			
			Thread.sleep(10000);
//			WebDriverWait wait = new WebDriverWait(driver, 10000);		    
//		    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[contains(text(),\"Download\")]")));
		    driver.findElement(By.xpath("//span[contains(text(),\"Download\")]")).click();
		    Thread.sleep(10000);
			driver.quit();
	     
	}

}
