package testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonFunctions.CommonFuntions;

public class FileUpload_Interact extends CommonFuntions {

	Robot robot;
	@Test
	public void fileuploadLink() {

		driver.navigate().back();
		driver.navigate().back();
		WebElement fileuploadlink =	driver.findElement(By.linkText("File Upload"));
		fileuploadlink.click();

	}

	@Test(dependsOnMethods = "fileuploadLink")
	public void Fileupload() {
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement choosebtn = driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-choose']"));
		choosebtn.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String file="C:\\Users\\user\\Downloads\\American-Airlines-Admirals-Club.jpeg";

		StringSelection selection= new StringSelection(file);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		try {
			robot=new Robot();	
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	
		

	}



}
