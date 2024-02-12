package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import commonFunctions.CommonFuntions;

public class Checkbox_Interact extends CommonFuntions {

	@Test
	public void checkboxlink() {

		driver.navigate().back();
		WebElement checkboxlink = driver.findElement(By.linkText("Checkbox"));
		checkboxlink.click();
	}

	@Test(dependsOnMethods = "checkboxlink")
	public void checkboxes() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		//WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement checkbox1 = driver.findElement(By.xpath("//*[@value=\'checkbox-1\']"));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@value=\'checkbox-1\']")));
		checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"checkbox-2\"]"));
		checkbox2.click();
		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
		checkbox3.click();
	}

}
