package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import pages.AdminDashPage;
import utils.Driver;
import utils.SeleniumUtils;

public class AdminDashPage_impl {

    private static WebDriver driver = Driver.getDriver();

    AdminDashPage adminDash = new AdminDashPage();

    public void clickCouponBtn () {
        SeleniumUtils.clickElement(adminDash.couponBtn);
    }
}
