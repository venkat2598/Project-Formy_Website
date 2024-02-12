package testcases;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import commonFunctions.CommonFuntions;

public class Windows_interact extends CommonFuntions {

	@Test
	public void Windowslink() {

		driver.navigate().back();
		driver.navigate().back();
	
		WebElement windowslink = driver.findElement(By.linkText("Switch Window"));
		windowslink.click();
	}

	@Test(dependsOnMethods = "Windowslink")
	public void windows() {

		WebElement openAlert = driver.findElement(By.id("alert-button"));
		openAlert.click();

		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		String oldwindow = driver.getWindowHandle();
		
		WebElement newtabBtn =  driver.findElement(By.id("new-tab-button"));
		newtabBtn.click();

		Set<String> windows =driver.getWindowHandles();
		for (String newwindow : windows) {
			driver.switchTo().window(newwindow);
			
		}
		driver.close();
		driver.switchTo().window(oldwindow);
		
		
		
		



	}
}
