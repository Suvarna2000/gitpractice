package org.example.pages;

import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(how = How.CSS, using = ".flex-caption")
    List<WebElement> listImages;

    @FindBy(how = How.CSS, using = ". nav-item")
    List<WebElement> navItem;

    public HomePage(WebDriver driver)    {
        super(driver);
    }

    public String searchURL1(String l){
        driver.findElement(By.id("loginButton")).click();
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL11111 : " + driver.getCurrentUrl());
        return (currentURL);
    }

    public String searchURL2(String l) throws InterruptedException{
        driver.findElement(By.id("wblhead")).click();
        String currentURL2 = driver.getCurrentUrl();
        System.out.println("currentURL22222 : " + driver.getCurrentUrl());
        return (currentURL2);
    }

    public String searchURL3(String l){
        driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']//ul[@class='nav navbar-nav']//li[@class=' nav-item']//a[@href='index.php']")).click();
        String currentURL3 = driver.getCurrentUrl();
        System.out.println("currentURL333333 : " + driver.getCurrentUrl());
        return (currentURL3);
    }

    public String searchURL4(String l){
        driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']//ul[@class='nav navbar-nav']//li[@class=' nav-item']//a[@href='schedule.php']")).click();
        String currentURL4 = driver.getCurrentUrl();
        System.out.println("currentURL444444 : " + driver.getCurrentUrl());
        return (currentURL4);
    }

    public String searchURL5(String l){
        driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']//ul[@class='nav navbar-nav']//li[@class=' nav-item']//a[@href='demos.php']")).click();
        String currentURL5 = driver.getCurrentUrl();
        System.out.println("currentURL555555 : " + driver.getCurrentUrl());
        return (currentURL5);
    }

    public String searchURL6(String l){
        driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']//ul[@class='nav navbar-nav']//li[@class=' nav-item']//a[@href='../faq.php']")).click();
        String currentURL6 = driver.getCurrentUrl();
        System.out.println("currentURL555555 : " + driver.getCurrentUrl());
        return (currentURL6);
    }

    public String searchText(String l){
        String loginText = driver.findElement(By.id("loginButton")).getText();
        System.out.println("loginText : " + loginText);
        return(loginText);
    }

    public int techImages(){
        System.out.println("listImages : " + listImages.size());
        return listImages.size();
    }
}
