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

    public LoginResultsPage login(String unamez, String pass) {
        System.out.println("I am here...........");
        driver.findElement(By.id("username")).sendKeys(unamez);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.id("login")).submit();
        System.out.println("I am after submit");
        WebElement ele = driver.findElement(By.xpath("//h6[@class='text-danger']//text()"));
        System.out.println(ele);
        //String message = driver.findElement(By.cssSelector("h6.text-danger")).getTagName();
        String message = driver.findElement(By.xpath("//h6[@class='text-danger']//text()")).getText();
        //String message = driver.findElement(By.xpath("//article[@class='contact-form col-md-4 col-sm-5 page-row']//h6[@class='text-danger']")).getText();
        System.out.println("I am after message");
        System.out.println(message);
        System.out.println("I am after before return");
        return PageFactory.initElements(driver, LoginResultsPage.class);
    }
}