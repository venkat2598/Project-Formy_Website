package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import commonFunctions.CommonFuntions;

public class Dropdown_Interact extends CommonFuntions{

	@Test
	public void DropdownLink() {
		driver.navigate().back();
		WebElement DDLink =  driver.findElement(By.linkText("Dropdown"));
		DDLink.click();

	}

	@Test(dependsOnMethods ="DropdownLink" )
	public void DropDown() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdownbtn  = driver.findElement(By.id("dropdownMenuButton"));
		dropdownbtn.click();

		WebElement dropdownlist = driver.findElement(By.xpath("//div[@class=\"dropdown-menu show\"]/a[9]"));
		dropdownlist.click();

 
	}

	
}
