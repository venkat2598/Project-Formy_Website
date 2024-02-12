package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonFunctions.CommonFuntions;

public class PageScroll_Interact extends CommonFuntions {

	@Test
	public void PagescrollLink() {

		driver.navigate().back();
		
		WebElement pagescrollLink = driver.findElement(By.linkText("Page Scroll"));
		pagescrollLink.click();
	}

	@Test(dependsOnMethods = "PagescrollLink" )
	public void PageScroll() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
		WebElement Fullname = driver.findElement(By.id("name"));
		jsexecutor.executeScript("arguments[0].scrollIntoView();", Fullname);
		Fullname.click();
		Fullname.sendKeys("Vijay");

		WebElement date = driver.findElement(By.id("date"));
		date.sendKeys("09/02/2024");


	}
}
