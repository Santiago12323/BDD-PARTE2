package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.AddRemovePage;

import static org.junit.Assert.assertTrue;

public class AddRemoveSteps {

    WebDriver driver;
    AddRemovePage page;

    @Before
    public void setUp(){

        ChromeOptions options = new ChromeOptions();

        options.setBinary("/usr/bin/google-chrome");

        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");

        driver = new ChromeDriver(options);

        page = new AddRemovePage(driver);
    }

    @Given("I open the add remove page")
    public void openPage(){
        page.openPage();
    }

    @When("I click the Add Element button")
    public void clickAdd(){
        page.clickAddElement();
    }

    @Then("the Delete button should appear")
    public void verifyDelete(){
        assertTrue(page.isDeleteVisible());
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}