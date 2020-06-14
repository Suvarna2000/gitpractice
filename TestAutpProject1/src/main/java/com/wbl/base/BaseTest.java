package com.wbl.base;

import com.wbl.utils.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.get("http://www.whiteboxqa.com/login.php");

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
