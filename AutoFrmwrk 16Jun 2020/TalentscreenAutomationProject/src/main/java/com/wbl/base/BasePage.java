package com.wbl.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){

        this.driver = driver;
    }

    public String searchURL1(String l){
        //driver.findElement(By.xpath("//div[@id='main-nav']//ul[class='nav navbar-nav navbar-nav-margin-left']//a[@href='https://app.talentscreen.io/#/subject-grid']")).click();
        if(l=="library") {
            driver.findElement(By.cssSelector(".navbar-nav-margin-left [href='https\\:\\/\\/app\\.talentscreen\\.io\\/\\#\\/subject-grid']")).click();
        }
        else if(l=="candidates"){
            driver.findElement(By.cssSelector("[href='\\#\\/candidate-homepage']")).click();
        }
        else if(l=="employers"){
            driver.findElement(By.linkText("Employers")).click();
        }
        else if(l=="companies"){
            driver.findElement(By.cssSelector(".navbar-nav-margin-left [href='https\\:\\/\\/app\\.talentscreen\\.io\\/\\#\\/companies']")).click();
        }
        else if(l=="login"){
            driver.findElement(By.linkText("LOG IN")).click();
        }

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL : " + driver.getCurrentUrl());
        return (currentURL);
    }

}
