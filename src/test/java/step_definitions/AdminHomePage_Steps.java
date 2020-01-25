package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AdminHomePage;
import pages.HomePage;
import step_definitions.step_impl.AdminHomePage_impl;
import utils.ConfigReader;
import utils.Driver;
import utils.SeleniumUtils;

public class AdminHomePage_Steps {

    private static WebDriver driver = Driver.getDriver();

    AdminHomePage adminHome = new AdminHomePage();
    AdminHomePage_impl adminHomeImpl = new AdminHomePage_impl();

    @Given("User opens admin home page")
    public void user_opens_admin_home_page() {
        Driver.getDriver().get(ConfigReader.readProperty("urlAdmin"));
    }

    @Given("Logs in")
    public void logs_in() {
        SeleniumUtils.waitForVisibility(adminHome.login_Btn);
        adminHomeImpl.adminLogin();
    }

    @Then("Verifies title is Dashboard")
    public void verifies_title_is_Dashboard() {
        SeleniumUtils.sleep(2000);
        Assert.assertEquals("Dashboard", driver.getTitle());
    }

}
