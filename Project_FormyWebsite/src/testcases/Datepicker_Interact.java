package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonFunctions.CommonFuntions;

public class Datepicker_Interact extends CommonFuntions {

	@Test
	public void DatepickerLink() {

		driver.navigate().back();
		WebElement datepickerlink = driver.findElement(By.linkText("Datepicker"));
		datepickerlink.click();

	}
	@Test(dependsOnMethods = "DatepickerLink")
	public void datapickerusingSendkeys() {
		
		WebElement date = driver.findElement(By.id("datepicker"));
		date.sendKeys("02/10/2024"+ Keys.ENTER);
	}
	@Test(dependsOnMethods = "datapickerusingSendkeys")
	public void datepickerusingcalander() {
		
		WebElement dateclear = driver.findElement(By.id("datepicker"));
		dateclear.click();
		dateclear.clear();
		
		dateclear.click();
		WebElement customdateselect = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[3]/td[5]"));
		customdateselect.click();
		
	}

}
