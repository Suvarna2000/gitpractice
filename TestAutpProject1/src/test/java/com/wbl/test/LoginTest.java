package com.wbl.test;

import com.wbl.base.BaseTest;
import com.wbl.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage lp;

    @Test
    public void loginTest(){
        lp = new LoginPage(driver);
        String actualMessage = null;
        try {
            actualMessage = lp.login("training123@gmail.com","training123");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(actualMessage,"You have not registered.");
    }
}
