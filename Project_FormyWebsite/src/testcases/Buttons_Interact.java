package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import commonFunctions.CommonFuntions;

public class Buttons_Interact extends CommonFuntions {

	@Test
	public void ButtonsLink() {

		WebElement buttonlink = driver.findElement(By.linkText("Buttons"));
		buttonlink.click();
	}

	@Test(dependsOnMethods = "ButtonsLink")
	public void Buttons() {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement primarybtn =  driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[1]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/form/div[1]/div/div/button[1]")));
		primarybtn.click();


		WebElement successbtn = driver.findElement(By.className("btn-success"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-success")));
		successbtn.click();

		WebElement infobtn = driver.findElement(By.className("btn-info"));
		infobtn.click();

		WebElement warningbtn = driver.findElement(By.className("btn-warning"));
		warningbtn.click();

		WebElement dangerbtn =driver.findElement(By.className("btn-danger"));
		dangerbtn.click();

		WebElement linkbtn = driver.findElement(By.className("btn-link"));
		linkbtn.click();
	}

	@Test(dependsOnMethods = "Buttons")
	public void AllignmentButtons() {


		WebElement leftbtn = driver.findElement(By.xpath("//div[@aria-label =\"Basic example\"]/button[1]"));
		leftbtn.click();

		WebElement middlebtn = driver.findElement(By.xpath("//div[@aria-label =\"Basic example\"]/button[2]"));
		middlebtn.click();	

		WebElement rightbtn = driver.findElement(By.xpath("//div[@aria-label =\"Basic example\"]/button[3]"));
		rightbtn.click();

	}

	@Test(dependsOnMethods = "AllignmentButtons")
	public void NumbersButtons() {

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement onebtn =	driver.findElement(By.xpath("//div[@aria-label =\"Button group with nested dropdown\"]/button[1]"));
		onebtn.click();

		WebElement twobtn = driver.findElement(By.xpath("//div[@aria-label =\"Button group with nested dropdown\"]/button[2]"));
		twobtn.click();

		WebElement dropdownbtn = driver.findElement(By.id("btnGroupDrop1"));
		dropdownbtn.click();

		WebElement droplist = driver.findElement(By.xpath("//div[@aria-labelledby =\"btnGroupDrop1\"]/a[1]"));
		dropdownbtn.click();

	}
}
