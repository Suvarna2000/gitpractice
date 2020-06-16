package com.wbl.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtil {
    public static WebDriver getDriver(String browserName) {
        WebDriver driver;

        switch (browserName) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\kulka\\IdeaProjects\\TalentscreenAutomationProject\\src\\main\\resources\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();
            default:
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\kulka\\IdeaProjects\\TalentscreenAutomationProject\\src\\main\\resources\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();
        }
        return driver;
    }
}
