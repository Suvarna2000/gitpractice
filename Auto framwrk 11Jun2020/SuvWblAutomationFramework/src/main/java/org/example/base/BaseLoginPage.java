package org.example.base;

import org.example.pages.LoginResultsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BaseLoginPage {
    protected WebDriver driver;

    @FindBy (how= How.ID, using="username")
    WebElement user;
    @FindBy (how= How.ID, using="password")
    WebElement passwd;
    @FindBy (how= How.ID, using="login")
    WebElement log;

    public BaseLoginPage(WebDriver driver){

        this.driver = driver;
    }

    public LoginResultsPage login(String loginData1, String loginData2) throws InterruptedException{

        user.sendKeys(loginData1);
        passwd.sendKeys(loginData2);
        log.click();
        return PageFactory.initElements(driver, LoginResultsPage.class);
    }

}
