import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResultsPage {
    private WebDriver driver;
    private WebElement showTitle;
    private By pulpFictionLink = By.xpath("//a[@href='/film/pulp-fiction/' and @class='frame has-menu']");
    private By pulpFictionGrade = By.cssSelector("div[style='height: 32px; width: 180px;']");

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
        showTitle = driver.findElement(By.xpath("//a[contains(text(),'Reservoir Dogs ')]"));

    }

    public void clickShowTitle() {
        showTitle.click();
    }

    public void clickPulpFictionLink() {
        WebElement pulpFictionElement = driver.findElement(pulpFictionLink);
        pulpFictionElement.click();
        Manager.LOGGER.info("Clicked on Pulp Fiction link");
    }
    public void clickPulpFictionGrade() {
        WebElement pulpFictionElement = driver.findElement(pulpFictionGrade);
        pulpFictionElement.click();
        Manager.LOGGER.info("Clicked on Pulp Fiction grade");
    }
}