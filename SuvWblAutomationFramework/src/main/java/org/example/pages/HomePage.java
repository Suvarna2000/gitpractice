package org.example.pages;

import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String search(String l){
        driver.get("http://www.whiteboxqa.com/");
        driver.findElement(By.id("loginButton")).click();
        String currentURL = driver.getCurrentUrl();
        return (currentURL);
    }
}
