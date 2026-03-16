package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.AlertPage;

public class AlertSteps {

    WebDriver driver;
    AlertPage page;

    @Before
    public void setUp(){

        ChromeOptions options = new ChromeOptions();

        options.setBinary("/usr/bin/google-chrome");

        options.addArguments("--headless");
        options.addArguments("--no-sandbox");

        driver = new ChromeDriver(options);

        page = new AlertPage(driver);
    }

    @Given("I open the alerts page")
    public void openPage(){
        page.openPage();
    }

    @When("I click the JS Alert button")
    public void clickAlert(){
        page.clickAlert();
    }

    @Then("I accept the alert")
    public void accept(){
        page.acceptAlert();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}