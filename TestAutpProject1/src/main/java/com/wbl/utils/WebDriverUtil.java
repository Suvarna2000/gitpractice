package com.wbl.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtil {
    public static WebDriver getDriver(String browserName){
       WebDriver driver;

            switch(browserName){
                case "chrome" :
                    System.setProperty("webdriver.chrome.driver","C:\\Users\\kulka\\IdeaProjects\\TestAutpProject1\\resources\\chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                case "firefox" :
                    System.setProperty("webdriver.firefox.driver","C:\\Users\\kulka\\IdeaProjects\\TestAutpProject1\\resources\\chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                default :
                    System.setProperty("webdriver.chrome.driver","C:\\Users\\kulka\\IdeaProjects\\TestAutpProject1\\resources\\chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
            }
            return driver;
    }
}
