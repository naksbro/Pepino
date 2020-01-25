package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class AdminCouponPage {

    private static WebDriver driver = Driver.getDriver();

    public AdminCouponPage () { PageFactory.initElements(driver,this); }

    @FindBy (xpath = " //button[text()=' Add']")
    public WebElement addBtn;

    @FindBy (xpath = "//select[@name='status']")
    public WebElement statusField;

    @FindBy (xpath = "//input[@placeholder='Percentage']")
    public WebElement percentField;

    @FindBy (xpath = "//input[@placeholder='Maximum Uses']")
    public WebElement usesField;

    @FindBy (xpath = "//input[@placeholder='Start Date']")
    public WebElement startDateField;

    @FindBy (xpath = "//td[@class='day  active']")
    public WebElement currentDate;

    @FindBy (xpath = "//input[@placeholder='Expiration Date']")
    public WebElement expDateField;

    @FindBy (xpath = "(//td[@class='day '])[4]")
    public WebElement endDate;

    @FindBy (xpath = "//input[@placeholder='Coupon Code']")
    public WebElement couponCodeField;

    @FindBy (xpath = "//button[text()=' Submit']")
    public WebElement submitBtn;

    @FindBy (xpath = "((//tr[@class='xcrud-row xcrud-row-0'])[1]/td[4]")
    public WebElement tableCouponCode;

    @FindBy (xpath = "(//tr[@class='xcrud-row xcrud-row-0'])[1]/td[5]")
    public WebElement tablePercentage;

    @FindBy (xpath = "(//tr[@class='xcrud-row xcrud-row-0'])[1]/td[6]")
    public WebElement tableUses;
}
