package com.wbl.pages;

import com.wbl.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String login(String user, String pass) throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.cssSelector("[type='submit']")).submit();
        Thread.sleep(2000);
        String msg = driver.findElement(By.cssSelector("[name='loginMessage']")).getText();
        return msg;
    }

    public String searchTitle(String s){
        if(s=="LOG IN WITH GOOGLE") {
            driver.findElement(By.linkText("LOG IN WITH GOOGLE")).click();
        }
        else if(s=="Log In with Facebook "){
            driver.findElement(By.linkText("Log In with Facebook ")).click();
        }
        String currentTitle = driver.getTitle();
        return currentTitle;
    }
}