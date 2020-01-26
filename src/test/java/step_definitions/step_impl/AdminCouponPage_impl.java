package step_definitions.step_impl;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AdminCouponPage;
import testData.Coupon;
import utils.DateUtils;
import utils.Driver;
import utils.SeleniumUtils;

import java.nio.channels.SelectionKey;
import java.util.List;

public class AdminCouponPage_impl {

    private static WebDriver driver = Driver.getDriver();

    AdminCouponPage adminCoup = new AdminCouponPage();

    public static Coupon coup1 = new Coupon("69","7","naks", DateUtils.plusDays(0),DateUtils.plusDays(4));

    public void createNewCoupon () {
        SeleniumUtils.clickElement(adminCoup.addBtn);
        SeleniumUtils.waitForVisibility(adminCoup.statusField);
        SeleniumUtils.sleep(2000);
        SeleniumUtils.sendKeys(adminCoup.percentField, coup1.getPercent());
        SeleniumUtils.sendKeys(adminCoup.usesField, coup1.getUses());
        SeleniumUtils.clickElement(adminCoup.allTours);
        SeleniumUtils.clickElement(adminCoup.allCars);
        SeleniumUtils.clickElement(adminCoup.startDateField);
        SeleniumUtils.clickElement(adminCoup.currentDate);
        SeleniumUtils.sendKeys(adminCoup.expDateField, coup1.getEndDate());
        SeleniumUtils.sendKeys(adminCoup.couponCodeField, coup1.getCode());
        SeleniumUtils.clickElement(adminCoup.submitBtn);
    }

    public List<WebElement> getAllExistingCouponCodes(){
        List<WebElement> ls = driver.findElements(By.xpath(adminCoup.allCouponsCodes_XPATH));
        try {
            WebElement element = driver.findElement(By.xpath("//*[text()='" + coup1.getCode() + "']"));
            SeleniumUtils.waitForVisibility(element);
        }catch (StaleElementReferenceException e){
            WebElement element = driver.findElement(By.xpath("//*[text()='" + coup1.getCode() + "']"));
            SeleniumUtils.waitForVisibility(element);
            ls = driver.findElements(By.xpath(adminCoup.allCouponsCodes_XPATH));
        }
        return ls;
    }

    public boolean verifyIfCouponExists(){
        boolean exists = false;
        List<WebElement> ls = getAllExistingCouponCodes();
        try {
            ls = getAllExistingCouponCodes();
            for (WebElement element : ls) {
                if (element.getText().equalsIgnoreCase(coup1.getCode()))
                    exists = true;
            }
        }catch (StaleElementReferenceException e){
            ls = getAllExistingCouponCodes();
            for (WebElement element : ls) {
                if (element.getText().equalsIgnoreCase(coup1.getCode()))
                    exists = true;
            }
        }
        return exists;
    }

}
