package org.example.pages;

import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(){
        driver.findElement(By.id("username")).sendKeys("training123@wbl.com");
        driver.findElement(By.id("password")).sendKeys("training123");
        driver.findElement(By.id("login")).submit();
    }
}
