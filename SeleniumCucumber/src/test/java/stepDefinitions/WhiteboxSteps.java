package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhiteboxSteps {
    WebDriver driver;

    @Given("i launch chrome browser1")
    public void i_launch_chrome_browser1() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kulka\\IdeaProjects\\SeleniumCucumber\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("i am on the main page of whitebox1")
    public void i_am_on_the_main_page_of_whitebox1() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://www.whiteboxqa.com/");
    }

    @Then("i got and verified the whitebox logo")
    public void i_got_and_verified_the_whitebox_logo() {
        // Write code here that turns the phrase above into concrete actions
        boolean status = driver.findElement(By.id("logo")).isDisplayed();
        Assert.assertEquals(true,status);
    }

    @Then("i closed the browser1")
    public void i_closed_the_browser1() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }

    @Given("i launch chrome browser2")
    public void i_launch_chrome_browser2() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kulka\\IdeaProjects\\SeleniumCucumber\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("i am on the main page of whitebox2")
    public void i_am_on_the_main_page_of_whitebox2() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://www.whiteboxqa.com/");
    }

    @When("i saw and clicked on schedule tab")
    public void i_saw_and_clicked_on_schedule_tab() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.linkText("SCHEDULE")).click();
    }

    @Then("i verified the schedule page")
    public void i_verified_the_schedule_page() {
        // Write code here that turns the phrase above into concrete actions
        String actUrl = driver.getCurrentUrl();
        Assert.assertEquals("http://www.whiteboxqa.com/schedule.php",actUrl);
    }

    @Then("i closed the browser2")
    public void i_closed_the_browser2() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }

    @Given("i launch chrome browser3")
    public void i_launch_chrome_browser3() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kulka\\IdeaProjects\\SeleniumCucumber\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("i am on the main page of whitebox3")
    public void i_am_on_the_main_page_of_whitebox3() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://www.whiteboxqa.com/");
    }

    @When("i saw and clicked on login link")
    public void i_saw_and_clicked_on_login_link() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("loginButton")).click();
    }

    @Then("i verified the login page")
    public void i_verified_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        String actURL = driver.getCurrentUrl();
        Assert.assertEquals("http://www.whiteboxqa.com/login.php",actURL);
    }

    @Then("i closed the browser3")
    public void i_closed_the_browser3() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }


}
