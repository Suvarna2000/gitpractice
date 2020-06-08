package org.example.test;

import org.example.base.BaseTest;
import org.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPageTest lg;

    @Test
    public void loginTest(){
        lg = new LoginPage(driver);
        String actualURL = lg.login();
        Assert.assertEquals(actualURL,"http://www.whiteboxqa.com/login.php");
    }
}
