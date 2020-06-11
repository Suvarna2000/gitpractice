package org.example.pages;

import org.example.base.BaseLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginResultsPage extends BaseLoginPage {

    public LoginResultsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,LoginResultsPage.class);
    }

    public String getText(){
        return driver.findElement(By.xpath("//article[@class='contact-form col-md-4 col-sm-5 page-row']//h6[@class='text-danger']")).getText();
    }
}
