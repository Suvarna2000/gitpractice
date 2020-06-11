package org.example.pages;

import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class LoginPage extends HomePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public String login(String unamez, String pass) {
        System.out.println("get the current url : " + driver.getCurrentUrl());
        System.out.println("I am here...........");
        System.out.println("username : " + driver.findElement(By.id("username")));
        driver.findElement(By.id("username")).sendKeys(unamez);
        System.out.println("password : " + driver.findElement(By.id("password")));
        driver.findElement(By.id("password")).sendKeys(pass);
        System.out.println("login button : " + driver.findElement(By.id("login")));
        driver.findElement(By.id("login")).submit();
        String message = driver.findElement(By.xpath("//h6[@class='text-danger']")).getText();
        System.out.println("Message : "+ message);
        return (message);
    }
}