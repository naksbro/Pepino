package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import pages.BookingPage;
import testData.Coupon;
import utils.Driver;
import utils.SeleniumUtils;

public class BookingPage_impl {

    private static WebDriver driver = Driver.getDriver();

    BookingPage book = new BookingPage();

    public void applyCoupon (Coupon coup) {
        SeleniumUtils.sendKeys(book.couponCodeField, coup.getCode());
        SeleniumUtils.clickElement(book.applyCoupBtn);
    }

    public String appliedCouponMsg () {
        return SeleniumUtils.getText(book.confirmText);
    }

    public void clickButton (String buttonName) {
        switch (buttonName.toLowerCase()) {
            case "book now":
                SeleniumUtils.clickElement(book.bookNowBtn);
                break;
            case "cookie":
                SeleniumUtils.clickElement(book.cookiesBtn);
        }
    }
}
