import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserPage {
    private WebDriver driver;
    private By activityButton = By.xpath("//a[@class='navlink' and @href='/schaffrillas/activity/']");
    private By likesButton = By.xpath("//a[@class='svg-action -like cannot-like ' and @href='/schaffrillas/film/babe/likes/']");

    public UserPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickToActivityButton() {
        driver.findElement(activityButton).click();
        Manager.LOGGER.info("Clicked to activity button of user Schaffrillas");
    }
    public void clickToLikesButton() {
        driver.findElement(likesButton).click();
        Manager.LOGGER.info("Clicked to likes of user Schaffrillas");
    }
}