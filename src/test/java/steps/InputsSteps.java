package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.InputsPage;

import static org.junit.Assert.assertEquals;

public class InputsSteps {

    WebDriver driver;
    InputsPage page;

    @Before
    public void setUp(){

        ChromeOptions options = new ChromeOptions();

        options.setBinary("/usr/bin/google-chrome");

        options.addArguments("--headless");
        options.addArguments("--no-sandbox");

        driver = new ChromeDriver(options);

        page = new InputsPage(driver);
    }

    @Given("I open the inputs page")
    public void openPage(){
        page.openPage();
    }

    @When("I enter the number {string}")
    public void enterNumber(String number){
        page.enterNumber(number);
    }

    @Then("the input value should be {string}")
    public void verify(String number){
        assertEquals(number, page.getValue());
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}