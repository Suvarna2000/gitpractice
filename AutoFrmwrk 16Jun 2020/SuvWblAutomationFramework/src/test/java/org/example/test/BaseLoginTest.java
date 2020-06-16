package org.example.test;

import org.testng.ITestContext;
import org.testng.TestRunner;
import utils.ConfigUtil;
import utils.ScreenshotUtil;
import utils.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseLoginTest {
    protected WebDriver driver;
    protected static String url;
    protected static String browser;

    @BeforeSuite
    public void beforeSuite(ITestContext context){
        ConfigUtil configUtil = new ConfigUtil("C:\\Users\\kulka\\IdeaProjects\\SuvWblAutomationFramework\\resources\\config.properties");
        url = ConfigUtil.getProperty("loginUrl");
        browser = ConfigUtil.getProperty("browser");
        TestRunner testRunner = (TestRunner) context;
        testRunner.setOutputDirectory("C:\\Users\\kulka\\IdeaProjects\\SuvWblAutomationFramework\\resources\\ireports");
    }

    @BeforeMethod
    public void setUp(){
        driver = WebDriverUtil.getDriver(browser); //create a driver object
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(ITestResult rs){
        if(ITestResult.FAILURE == rs.getStatus()){
            ScreenshotUtil.takeScreenShot(rs.getName(),driver);
        }
        driver.quit(); //close the driver object
    }
}
