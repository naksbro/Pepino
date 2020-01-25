package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class AdminHomePage {

    private static WebDriver driver = Driver.getDriver();

    public AdminHomePage () { PageFactory.initElements(driver, this);}

    @FindBy (xpath = "//input[@name=\"email\"]")
    public WebElement emailField;

    @FindBy (xpath = "//input[@type='password']")
    public WebElement pwField;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement login_Btn;
}
