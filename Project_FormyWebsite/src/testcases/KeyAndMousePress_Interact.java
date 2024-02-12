package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonFunctions.CommonFuntions;

public class KeyAndMousePress_Interact extends CommonFuntions {

	@Test
	public void KeyAndMousePressLink() {
		driver.navigate().back();
		WebElement KeyAndMouselink = driver.findElement(By.linkText("Key and Mouse Press"));
		KeyAndMouselink.click();

	}
	
	@Test(dependsOnMethods = "KeyAndMousePressLink")
	public void KeyAndMouseInteract() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement fullname = driver.findElement(By.id("name"));
		fullname.click();
		fullname.sendKeys("hello racer"+Keys.ENTER);


		WebElement btn = driver.findElement(By.id("button"));
		btn.click();

	}
}
