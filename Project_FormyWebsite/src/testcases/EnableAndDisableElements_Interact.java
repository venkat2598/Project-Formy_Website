package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonFunctions.CommonFuntions;

public class EnableAndDisableElements_Interact extends CommonFuntions {

	@Test
	public void EnableAndDisableLink() {
		driver.navigate().back();
		driver.navigate().back();
		WebElement enablelink =	driver.findElement(By.partialLinkText("Enabled"));
		enablelink.click();
	}

	@Test(dependsOnMethods = "EnableAndDisableLink")
	public void EnableAndDisable() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		WebElement disable = driver.findElement(By.id("disabledInput"));
		boolean enableOrDisable = disable.isEnabled();
		System.out.println(enableOrDisable);
		
		WebElement enable = driver.findElement(By.id("input"));
		if(enable.isEnabled()) {
			enable.click();
			enable.sendKeys("hello!");
		}
	}
}
