package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonFunctions.CommonFuntions;

public class RadioButton_Interact extends CommonFuntions {

	@Test
	public void RadioButtonLink() {

		driver.navigate().back();

		WebElement Radiolink =	driver.findElement(By.linkText("Radio Button"));
		Radiolink.click();
	}

	@Test(dependsOnMethods ="RadioButtonLink" )
	public void RadioButtons() {

		WebElement Radiobtn1 = driver.findElement(By.xpath("//*[@value=\"option1\"]"));
		Radiobtn1.click();	
		WebElement Radiobtn2 = driver.findElement(By.xpath("//*[@value=\"option2\"]"));
		Radiobtn2.click();	
		WebElement Radiobtn3 = driver.findElement(By.xpath("//*[@value=\"option3\"]"));
		Radiobtn3.click();
	}
}
