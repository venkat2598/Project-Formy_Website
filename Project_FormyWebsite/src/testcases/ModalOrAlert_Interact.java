package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonFunctions.CommonFuntions;

public class ModalOrAlert_Interact extends CommonFuntions {

	@Test
	public void ModalLink() {

		driver.navigate().back();
		driver.navigate().back();
		WebElement ModalLink = driver.findElement(By.linkText("Modal"));
		ModalLink.click();
	}

	@Test(dependsOnMethods = "ModalLink")
	public void Modal() {

		WebElement modalbtn	= driver.findElement(By.id("modal-button"));
		modalbtn.click();
		WebElement closetn = driver.findElement(By.id("close-button"));
		closetn.click();
	}
}
