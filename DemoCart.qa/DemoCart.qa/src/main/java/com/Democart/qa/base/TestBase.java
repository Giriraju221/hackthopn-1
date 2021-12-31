package com.Democart.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			
			//Reading Properties from Properties File
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\pagid\\eclipse-workspace\\DemoCart.qa\\src\\main\\java\\com\\Democart\\qa\\Configuration\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
    
	//browser initialization
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\pagid\\Desktop\\naveen 2\\chromedriver_win32\\chromedriver.exe");  //Chrome browser
			driver = new ChromeDriver();
		} else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\pagid\\Desktop\\naveen 2\\geckodriver-v0.29.1-win64\\geckodriver.exe");  //Firefox Browser
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();  //Window maximize
		driver.manage().deleteAllCookies(); //Delete all cookies
		driver.get(prop.getProperty("url")); //getting url from Properties File
		driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
	}
}
