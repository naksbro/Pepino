package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import pages.AdminHomePage;
import utils.ConfigReader;
import utils.Driver;
import utils.SeleniumUtils;

public class AdminHomePage_impl {

    private static WebDriver driver = Driver.getDriver();

    AdminHomePage adminHome = new AdminHomePage();

    public void adminLogin () {
        SeleniumUtils.sendKeys(adminHome.emailField, ConfigReader.readProperty("login"));
        SeleniumUtils.sendKeys(adminHome.pwField, ConfigReader.readProperty("password"));
        SeleniumUtils.clickElement(adminHome.login_Btn);
    }
}
