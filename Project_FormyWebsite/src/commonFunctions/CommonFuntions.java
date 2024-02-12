package commonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFuntions {

	static Properties prop;
	public static WebDriver driver;

	public Properties LoadProperty() {

		String name="C:\\Users\\user\\eclipse-workspace\\Project_FormyWebsite\\config.properties";
		try {
			FileInputStream input =new FileInputStream(name);
			prop = new Properties();
			prop.load(input);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		return prop;
	}


	@BeforeSuite
	public void LanuchBrowser() {
		LoadProperty();

		String Baseurl = prop.getProperty("url");
		String Browser = prop.getProperty("browser");
		String Drivelocation = prop.getProperty("driverlocation");
		
		if(Browser.equalsIgnoreCase("chroMe")) {
			System.setProperty("webdriver.chrome.driver", Drivelocation);
			driver= new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("fireFox")) {
			System.setProperty("webdriver.gecko.driver", Drivelocation);
			driver= new FirefoxDriver();

		}
		driver.navigate().to(Baseurl);

	}

	@AfterSuite
	public void Teardown() {

		//driver.quit();
	}
}
