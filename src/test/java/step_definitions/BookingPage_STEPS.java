package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.BookingPage;
import step_definitions.step_impl.AdminCouponPage_impl;
import step_definitions.step_impl.BookingPage_impl;
import utils.Driver;
import utils.SeleniumUtils;

public class BookingPage_STEPS {

    private static WebDriver driver = Driver.getDriver();

    BookingPage book = new BookingPage();
    BookingPage_impl book_impl = new BookingPage_impl();

    @When("Clicks on {string} button")
    public void clicks_on_button(String button) {
        book_impl.clickButton("cookie");
        book_impl.clickButton(button);
    }

    @When("applies existing coupon code")
    public void applies_existing_coupon_code() {
       book_impl.applyCoupon(AdminCouponPage_impl.coup1);
    }

    @Then("Verifies positive message is displayed")
    public void verifies_positive_message_is_displayed() {
        Assert.assertEquals(AdminCouponPage_impl.coup1.getPercent(), book_impl.appliedCouponMsg().substring(0,2));
    }

}
