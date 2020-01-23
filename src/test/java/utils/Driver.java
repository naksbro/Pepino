package utils;

import constants.SeleniumConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver = null;
    private static String propertyPath = "/src/test/resources/conf/conf.properties";

    public static void initialize (String browser) {
        if (driver != null) return;
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                System.out.println("Invalid browser");
        }
        driver.manage().timeouts().implicitlyWait(SeleniumConstants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(SeleniumConstants.PAGE_LOAD_TIME, TimeUnit.SECONDS);
    }

    public static void closeDriver () {
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }

    public static void quitDriver () {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static WebDriver getDriver () {
        if (driver != null) return driver;
        initialize(ConfigReader.readProperty(propertyPath,"browser"));
        return driver;
    }

}
