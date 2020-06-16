package com.wbl.test;

import com.wbl.base.BaseTest;
import com.wbl.pages.HomePage;
import com.wbl.utils.ConfigUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.*;
import com.wbl.utils.ExcelHelper;


public class HomePageTest extends BaseTest {
    HomePage hm;

    @BeforeSuite(dependsOnGroups = "suite2")
    @Override
    public void beforeSuite(ITestContext context) {
        ConfigUtil configUtil = new ConfigUtil("C:\\Users\\kulka\\IdeaProjects\\TalentscreenAutomationProject\\src\\main\\resources\\config.properties");
        url = ConfigUtil.getProperty("loginUrl");
        browser = ConfigUtil.getProperty("browser");
        TestRunner testRunner = (TestRunner) context;
        testRunner.setOutputDirectory("C:\\Users\\kulka\\IdeaProjects\\TalentscreenAutomationProject\\src\\main\\resources\\ireports");
    }

    @DataProvider(name="LogPassData")
    public Object[][] testData(){
        //return new String[][]{{"training123@gmail.com","training123","You have not registered. Please sign up."}};
        return ExcelHelper.getExcelData("testdata.xlsx","sheet1");
    }

    @Test(dataProvider = "LogPassData")
    public void loginTest(String UserName, String Password, String expMsg) throws InterruptedException {
        hm = PageFactory.initElements(driver,HomePage.class);
        String actualMsg = hm.login(UserName,Password);
        Assert.assertEquals(actualMsg,"You have not registered. Please sign up.");
    }

    @Test
    public void googleLoginTest(){
        hm = PageFactory.initElements(driver,HomePage.class);
        String actualTitle = hm.searchTitle("LOG IN WITH GOOGLE");
        Assert.assertEquals(actualTitle,"Sign in - Google Accounts");
    }

    @Test
    public void FacebookLoginTest(){
        hm = PageFactory.initElements(driver,HomePage.class);
        String actualTitle = hm.searchTitle("Log In with Facebook ");
        Assert.assertEquals(actualTitle,"Facebook");
    }

}
