package org.example.test;

import org.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseLoginTest{
    LoginPage lg;

    @DataProvider(name = "LogPassData")
    public Object[][] testData(){
        return new String[][]{{"You have not registered.","You have not registered."}};
    }

    @Test
    public void loginTest(){
        lg = new LoginPage(driver);
        String actualMsg = lg.login("training123.wbl@gmail.com","training123");
        Assert.assertEquals(actualMsg,"You have not registered.");

    }
}
