package step_definitions.step_impl;

import com.github.javafaker.Faker;
import io.cucumber.java.eo.Se;
import org.apache.poi.ss.usermodel.DateUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.AdminCouponPage;
import utils.DateUtils;
import utils.Driver;
import utils.SeleniumUtils;

public class AdminCouponPage_impl {

    private static WebDriver driver = Driver.getDriver();

    AdminCouponPage adminCoup = new AdminCouponPage();

    public String percent = "69";
    public String uses = "7";
    public String code = "naks";

    public void createNewCoupon () {
        SeleniumUtils.clickElement(adminCoup.addBtn);
        SeleniumUtils.waitForVisibility(adminCoup.statusField);
        SeleniumUtils.sleep(2000);
        SeleniumUtils.sendKeys(adminCoup.percentField, percent);
        SeleniumUtils.sendKeys(adminCoup.usesField, uses);
        SeleniumUtils.clickElement(adminCoup.startDateField);
        SeleniumUtils.clickElement(adminCoup.currentDate);
        SeleniumUtils.clickElement(adminCoup.endDate);
        SeleniumUtils.sendKeys(adminCoup.couponCodeField, code);
        SeleniumUtils.clickElement(adminCoup.submitBtn);
    }



}
