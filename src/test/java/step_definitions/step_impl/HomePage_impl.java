package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utils.Driver;
import utils.SeleniumUtils;

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

    public void openFeaturedTour (String name) {
        switch (name.toLowerCase()) {
            case "first tour":
                SeleniumUtils.clickElement(home.featTour);
                break;
        }
    }
}
