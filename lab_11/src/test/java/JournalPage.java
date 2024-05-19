import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JournalPage {
    private WebDriver driver;
    private By sectionsButton = By.xpath("//span[@class='label' and contains(text(),'Sections')]");
    private By awardsButton = By.xpath("//span[@class='label' and contains(text(),'Awards')]");

    public JournalPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickSectionsButton() {
        driver.findElement(sectionsButton).click();
        Manager.LOGGER.info("Clicked Sections button");
    }
    public void clickAwardsButton() {
        driver.findElement(awardsButton).click();
        Manager.LOGGER.info("Clicked awards button");
    }
}