package com.JavaRobot;

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
import org.openqa.selenium.interactions.Actions;

import com.utility.Library;

public class Assignment1_FileUpload extends Library {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\chromedriver-v119\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://smallpdf.com/word-to-pdf");
		driver.manage().window().maximize();
	    WebElement ChooseElem =	driver.findElement(By.xpath("//div[@class=\"l3tlg0-6 kkceuK\"]"));
		Actions objActions = new Actions(driver);
		objActions.click(ChooseElem).build().perform();
		
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
	    driver.close();
	}

}
