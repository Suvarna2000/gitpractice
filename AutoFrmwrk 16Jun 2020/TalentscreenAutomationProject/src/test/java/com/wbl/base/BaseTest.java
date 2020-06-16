package com.wbl.base;

import com.wbl.utils.ConfigUtil;
import com.wbl.utils.ScreenshotUtil;
import com.wbl.utils.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.*;
import org.testng.annotations.*;

public class BaseTest {
protected WebDriver driver;
protected static String url;
protected String browser;

BasePage bp;

    @BeforeSuite()
    public void beforeSuite(ITestContext context){
        ConfigUtil configUtil = new ConfigUtil("C:\\Users\\kulka\\IdeaProjects\\TalentscreenAutomationProject\\src\\main\\resources\\config.properties");
        url = ConfigUtil.getProperty("stageUrl");
        browser = ConfigUtil.getProperty("browser");
        TestRunner testRunner = (TestRunner) context;
        testRunner.setOutputDirectory("C:\\Users\\kulka\\IdeaProjects\\TalentscreenAutomationProject\\src\\main\\resources\\ireports");
    }

    @BeforeMethod
    public void setUp(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
}

    @Test(priority = 1)
    public void searchURLTest1(){
        bp = PageFactory.initElements(driver,BasePage.class);
        String actualURL = bp.searchURL1("library");
        Assert.assertEquals(actualURL,"https://app.talentscreen.io/#/subject-grid");
    }

    @Test(priority = 2)
    public void searchURLTest2(){
        bp = PageFactory.initElements(driver,BasePage.class);
        String actualURL = bp.searchURL1("candidates");
        Assert.assertEquals(actualURL,"https://talentscreen.io/#/candidate-homepage");
    }

    @Test(priority = 3)
    public void searchURLTest3(){
        bp = PageFactory.initElements(driver,BasePage.class);
        String actualURL = bp.searchURL1("employers");
        Assert.assertEquals(actualURL,"https://talentscreen.io/#/employer-homepage");
    }

    @Test(priority = 4)
    public void searchURLTest4(){
        bp = PageFactory.initElements(driver,BasePage.class);
        String actualURL = bp.searchURL1("companies");
        Assert.assertEquals(actualURL,"https://app.talentscreen.io/#/companies");
    }

    @Test(priority = 5)
    public void searchURLTest5(){
        bp = PageFactory.initElements(driver,BasePage.class);
        String actualURL = bp.searchURL1("login");
        Assert.assertEquals(actualURL,"https://app.talentscreen.io/#/login");
    }


    @AfterMethod
    public void tearDown(ITestResult rs){
        if(ITestResult.FAILURE == rs.getStatus()){
            ScreenshotUtil.takeScreenShot(rs.getName(),driver);
        }
        driver.close();
    }

    @AfterSuite
    public void afterSuite(){
        driver.quit();
    }
}
