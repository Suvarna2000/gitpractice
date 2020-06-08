package org.example.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

//as this is a part of header, we are automating inside BasePage.java

    public String search(String l){
        driver.findElement(By.id("loginButton")).click();
        String searchUrl = driver.getCurrentUrl();
        return searchUrl;
    }
}
