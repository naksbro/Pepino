package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utils.Driver;

public class HomePage_impl {

    private static WebDriver driver = Driver.getDriver();

    HomePage home = new HomePage();

    public void rand () {
        home.logo.sendKeys();
    }

    public String getTitle () {
        return driver.getTitle();
    }

    public void clickMyAccountBtn () {
        home.myAccount_Btn.click();
    }

    public void clickSignUp () {
        clickMyAccountBtn();
        home.signUp_Btn.click();
    }
}
