package com.wbl.pages;

import com.wbl.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public String login(String Username,String Password) throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys(Username);
        driver.findElement(By.id("password")).sendKeys(Password);
        driver.findElement(By.id("login")).click();

        //driver.findElement(By.xpath("//h6[@class='text-danger']"));
        //driver.findElement(By.xpath("//h6[contains(text(),'You have not registered.')]"));
        driver.findElement(By.xpath("//article[@class='contact-form col-md-4 col-sm-5 page-row']//h6[@class='text-danger']"));
        Thread.sleep(2000);
        System.out.println("After the xpath element");
        String message = driver.findElement(By.xpath("")).getText();
        System.out.println("After the xpath message");
        return message;
    }
}
