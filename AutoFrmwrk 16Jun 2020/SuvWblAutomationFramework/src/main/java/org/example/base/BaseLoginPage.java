package org.example.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BaseLoginPage {
    protected WebDriver driver;

    public BaseLoginPage(WebDriver driver){

        this.driver = driver;
    }



}
