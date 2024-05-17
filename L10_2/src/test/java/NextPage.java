import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NextPage {
    private WebDriver driver;
    private WebElement filmsButton;

    public NextPage(WebDriver driver) {
        this.driver = driver;
        filmsButton = driver.findElement(By.xpath("//a[@href='/search/lists/Reservoir+Dogs/' and contains(text(),'Lists')]"));
    }

    public void clickListsButton() {
        filmsButton.click();
    }
}