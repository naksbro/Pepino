package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AdminCouponPage;
import step_definitions.step_impl.AdminCouponPage_impl;
import utils.Driver;
import utils.SeleniumUtils;

public class AdminCouponPage_STEPS {

    private static WebDriver driver = Driver.getDriver();

    AdminCouponPage couponPage = new AdminCouponPage();
    AdminCouponPage_impl coupon_impl = new AdminCouponPage_impl();

    @When("Creates a new coupon")
    public void creates_a_new_coupon() {
        coupon_impl.createNewCoupon();
    }

    @Then("Verifies new coupon is created")
    public void verifies_new_coupon_is_created() {
        Assert.assertTrue(coupon_impl.verifyIfCouponExists());
    }

}
