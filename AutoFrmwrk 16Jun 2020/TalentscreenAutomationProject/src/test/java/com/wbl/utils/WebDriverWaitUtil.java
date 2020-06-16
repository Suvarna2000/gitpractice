package com.wbl.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class WebDriverWaitUtil {
    private static Logger log = LogManager.getLogger(WebDriverWaitUtil.class);

    public static WebElement waitForElementVisible(WebDriver driver, long timeInSec, WebElement element){
        try{
            WebDriverWait wait = new WebDriverWait(driver,timeInSec);
            element = wait.until(ExpectedConditions.visibilityOf(element));
        }
        catch(Exception e){
            log.error("Exception occurred while waiting explicitly for an element");
            log.error(e.getMessage());
        }
        return element;
    }

    public static void implicitWait(WebDriver driver, long timeInSec, TimeUnit unit){
        driver.manage().timeouts().implicitlyWait(timeInSec,unit);
    }

}