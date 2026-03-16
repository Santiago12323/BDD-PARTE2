package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage {

    WebDriver driver;

    public AlertPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//button[text()='Click for JS Alert']")
    WebElement alertButton;

    public void openPage(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    public void clickAlert(){
        alertButton.click();
    }

    public void acceptAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}