package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class BookingPage {

    private static WebDriver driver = Driver.getDriver();

    public BookingPage () {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='btn btn-secondary btn-block mt-20 btn-action btn-lg loader']")
    public WebElement bookNowBtn;

    @FindBy(xpath = "//label[@class='pure-material-textfield-outlined float-none coupon-label']//input[contains(@placeholder,'')]")
    public  WebElement couponCodeField;

    @FindBy(xpath = "//button[@class='btn btn-danger applycoupon btn-block']")
    public WebElement applyCoupBtn;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement confirmText;

    @FindBy(xpath = "//button[@aria-label='dismiss cookie message']")
    public WebElement cookiesBtn;
}
