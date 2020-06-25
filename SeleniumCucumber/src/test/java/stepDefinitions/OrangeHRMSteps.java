package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMSteps {

    WebDriver driver;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kulka\\IdeaProjects\\SeleniumCucumber\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        //throw new io.cucumber.java.PendingException();
    }

    @When("I open orange hrm homepage")
    public void i_open_orange_hrm_homepage() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.orangehrm.com/");
        //throw new io.cucumber.java.PendingException();
    }

    @Then("I verify that the logo present on page")
    public void i_verify_that_the_logo_present_on_page() {
        // Write code here that turns the phrase above into concrete actions
        //boolean status = driver.findElement(By.cssSelector(".navbar-brand > img[alt='OrangeHRM Inc Logo']")).isDisplayed();
        boolean status = driver.findElement(By.xpath("html//nav//a[@href='/']/img[@alt='OrangeHRM Inc Logo']")).isDisplayed();
        System.out.println("status : "+status);
        Assert.assertEquals(true,status);
        ///driver.findElement(By.xPath("html//nav//a[@href='/']/img[@alt='OrangeHRM Inc Logo']"));
        //throw new io.cucumber.java.PendingException();
    }

    @Then("close browser")
    public void close_browser() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
        //throw new io.cucumber.java.PendingException();
    }

}
