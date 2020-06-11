package org.example.test;

import org.example.utils.ConfigUtil;
import org.example.utils.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected WebDriver driver;
    protected static String url;
    protected static String browser;

    @BeforeSuite
    public void beforeSuite(){
        ConfigUtil configUtil = new ConfigUtil("C:\\Users\\kulka\\IdeaProjects\\SuvWblAutomationFramework\\resources\\config.properties");
        url = ConfigUtil.getProperty("stageUrl");
        browser = ConfigUtil.getProperty("browser");

    }

    @BeforeMethod
    public void setUp(){
        driver = WebDriverUtil.getDriver(browser); //create a driver object
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit(); //close the driver object
    }
}
