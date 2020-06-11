package org.example.test;

import org.example.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    HomePage hm;

    @Test(priority = 4)
    public void searchURLTest1(){
        hm = PageFactory.initElements(driver,HomePage.class);
        String actualURL = hm.searchURL1("login");
        Assert.assertEquals(actualURL,"http://www.whiteboxqa.com/login.php");
    }

    @Test(priority = 3) //incorrect data test
    public void searchURLTest2() throws InterruptedException{
        hm = PageFactory.initElements(driver,HomePage.class);
        String actualURL = hm.searchURL2("wbl");
        Assert.assertEquals(actualURL,"http://www.whiteboxqa.com/index.php");
    }

    @Test(priority = 5)
    public void searchURLTest3(){
        hm = PageFactory.initElements(driver,HomePage.class);
        String actualURL = hm.searchURL3("schedule");
        Assert.assertEquals(actualURL,"http://www.whiteboxqa.com/schedule.php");
    }


    @Test(priority = 1)
    public void searchTextTest(){
        hm = PageFactory.initElements(driver,HomePage.class);
        //hm = new HomePage(driver);
        String actualText = hm.searchText("login");
        Assert.assertEquals(actualText,"Login");
    }

    @Test(priority = 2)
    public void techImagesTest(){
        hm = PageFactory.initElements(driver,HomePage.class);
        Assert.assertEquals(hm.techImages(),6);

    }
}
