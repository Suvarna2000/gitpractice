package org.example.pages;

import org.example.base.BaseLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseLoginPage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public String login(String unamez, String pass) throws InterruptedException {

        driver.findElement(By.id("username")).sendKeys(unamez);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.id("login")).submit();
        Thread.sleep(2000);

        String message = driver.findElement(By.cssSelector(".text-danger")).getText();
        return message;
    }
}