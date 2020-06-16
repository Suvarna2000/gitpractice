package org.example.test;

import org.example.pages.LoginPage;
import org.testng.Assert;
import utils.ExcelHelper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseLoginTest{
    LoginPage lg;

    @DataProvider(name = "LogPassData")
    public Object[][] testData(){
        //return new String[][]{{"training123@gmail.com","training123","You have not registered."}};
        return ExcelHelper.getExcelData("LoginPage-data.xlsx","Sheet1");
    }

    @Test(dataProvider = "LogPassData")
    public void loginTest(String UserName, String Password, String expMsg) throws InterruptedException{
        lg = PageFactory.initElements(driver,LoginPage.class);
        System.out.println("UserName : :" + UserName);
        System.out.println("Password : :" + Password);
        String actMsg = lg.login(UserName,Password);
        Assert.assertEquals(actMsg,expMsg);
    }
}
