package org.example.test;

import org.example.pages.LoginPage;
import org.example.pages.LoginResultsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseLoginTest{
    LoginPage lg;

    @DataProvider(name = "LogPassData")
    public Object[][] testData(){
        return new String[][]{{"training123@gmail.com","training123","You have not registered."}};
    }

    @Test(dataProvider = "LogPassData")
    public void loginTest(String UserName, String Password, String expMsg) throws InterruptedException{
        lg = PageFactory.initElements(driver,LoginPage.class);
        System.out.println("UserName : :" + UserName);
        System.out.println("Password : :" + Password);
        LoginResultsPage lp = lg.login(UserName,Password);
        //Assert.assertEquals(lp.getText(),expMsg);
        System.out.println(lp.getText());
        System.out.println(expMsg);

    }
}
