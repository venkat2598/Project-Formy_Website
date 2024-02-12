package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.CommonFuntions;

public class Complete_WebForm_Interact extends CommonFuntions {

	@Test
	public void WebformLink() {
		driver.navigate().back();
		WebElement webformlink = driver.findElement(By.linkText("Complete Web Form"));
		webformlink.click();
	}

	@Test(dependsOnMethods = "WebformLink")
	public void Webform() {


		WebElement firstname = driver.findElement(By.id("first-name"));
		firstname.sendKeys("vijay");

		WebElement lastname = driver.findElement(By.id("last-name"));
		lastname.sendKeys("kumar");

		WebElement jobtitle = driver.findElement(By.id("job-title"));
		jobtitle.sendKeys("Automation Test Engineer");

		WebElement education = driver.findElement(By.id("radio-button-2"));
		education.click();

		WebElement	gender = driver.findElement(By.id("checkbox-1"));
		gender.click();

		WebElement yearofexp = driver.findElement(By.id("select-menu"));
		Select select = new Select(yearofexp);
		select.selectByIndex(1);

		WebElement	date =  driver.findElement(By.id("datepicker"));
		date.sendKeys("02/09/2024");

		WebElement submitbtn = driver.findElement(By.linkText("Submit"));
		submitbtn.click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds());
		
		WebElement SumbitConformation =	driver.findElement(By.xpath("//div[@role=\"alert\"]"));
		String message = SumbitConformation.getText();
		System.out.println(message);
		Assert.assertEquals(message, "The form was successfully submitted!");
	}


}
