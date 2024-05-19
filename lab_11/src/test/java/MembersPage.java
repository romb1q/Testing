import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MembersPage {
    private WebDriver driver;
    private By userElement = By.xpath("//a[@class='avatar -a150 -large' and @href='/schaffrillas/']");

    public MembersPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickToUser() {
        driver.findElement(userElement).click();
        Manager.LOGGER.info("Clicked to user Schaffrillas");
    }
}