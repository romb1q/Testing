import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResultsPage {
    private WebDriver driver;
    private WebElement showTitle;

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
        showTitle = driver.findElement(By.xpath("//a[contains(text(),'CinemaFiend')]"));
    }

    public void clickShowTitle() {
        showTitle.click();
    }
}