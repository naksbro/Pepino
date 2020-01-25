package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AdminCouponPage;
import step_definitions.step_impl.AdminCouponPage_impl;
import step_definitions.step_impl.AdminDashPage_impl;
import utils.Driver;
import utils.SeleniumUtils;

public class AdminCouponPage_Steps {

    private static WebDriver driver = Driver.getDriver();

    AdminCouponPage couponPage = new AdminCouponPage();
    AdminCouponPage_impl coupon_impl = new AdminCouponPage_impl();

    @When("Creates a new coupon")
    public void creates_a_new_coupon() {
        coupon_impl.createNewCoupon();
    }

    @Then("Verifies new coupon is created")
    public void verifies_new_coupon_is_created() {
        Assert.assertEquals(SeleniumUtils.getText(couponPage.tableCouponCode), coupon_impl.code);
        Assert.assertEquals(SeleniumUtils.getText(couponPage.tablePercentage), coupon_impl.percent);
        Assert.assertEquals(SeleniumUtils.getText(couponPage.tableUses), coupon_impl.uses);
    }

}
