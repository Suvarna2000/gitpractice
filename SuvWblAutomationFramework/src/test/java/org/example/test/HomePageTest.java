package org.example.test;

import org.example.base.BaseTest;
import org.example.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage hm;

    @Test
    public void searchURLTest(){
        hm = new HomePage(driver);
        String actualURL = hm.search("login");
        Assert.assertEquals(actualURL,"http://www.whiteboxqa.com/login.php");

    }
}
