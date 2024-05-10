import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    private WebDriver driver;
    private WebElement filmsButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://letterboxd.com/");
        filmsButton = driver.findElement(By.xpath("//span[@class='label' and contains(text(),'Films')]"));
    }

    public void clickFilmsButton() {
        filmsButton.click();
    }
}