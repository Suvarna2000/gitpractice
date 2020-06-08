package org.example.base;

import org.example.utils.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverUtil.getDriver("chrome"); //create a driver object
        driver.get("http://www.whiteboxqa.com/");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit(); //close the driver object
    }
}
