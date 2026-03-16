package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputsPage {

    WebDriver driver;

    public InputsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName="input")
    WebElement inputField;

    public void openPage(){
        driver.get("https://the-internet.herokuapp.com/inputs");
    }

    public void enterNumber(String number){
        inputField.sendKeys(number);
    }

    public String getValue(){
        return inputField.getAttribute("value");
    }
}