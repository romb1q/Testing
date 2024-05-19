import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class Manager {
    private static WebDriver driver;
    public static final Logger LOGGER = Logger.getLogger(Manager.class.getName());

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            LOGGER.info("Browser started");
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            LOGGER.info("Browser closed");
            driver = null;
        }
    }
}