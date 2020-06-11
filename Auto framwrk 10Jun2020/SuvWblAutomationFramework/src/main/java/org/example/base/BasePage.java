package org.example.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BasePage {

    protected WebDriver driver;

   // @FindBy(how = How.ID, using = "loginButton")
    //WebElement linkString;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

//as this is a part of header, we are automating inside BasePage.java

    /*public void searchLink(String l){
        //driver.get("http://www.whiteboxqa.com/index.php");
        linkString.click();
        //String searchUrl = driver.getCurrentUrl();
        //return new LoginResultsPage;
    }*/
}
