package com.test.master;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseHandler {

	public static WebDriver driver;
	public static Properties prop;

	public BaseHandler() {

		try {
			prop = new Properties();
			FileInputStream fip = new FileInputStream("./config.properties");
			prop.load(fip);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browseName = prop.getProperty("browser");
		if (browseName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			driver = new ChromeDriver();
		}
		// need to implement for other browsers later

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
