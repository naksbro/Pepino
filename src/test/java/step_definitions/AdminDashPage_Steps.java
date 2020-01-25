package step_definitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import step_definitions.step_impl.AdminDashPage_impl;
import utils.Driver;

public class AdminDashPage_Steps {

    private static WebDriver driver = Driver.getDriver();

    AdminDashPage_impl adminDash = new AdminDashPage_impl();

    @Then("Navigates to coupon page")
    public void navigates_to_coupon_page() {
        adminDash.clickCouponBtn();
    }
}
