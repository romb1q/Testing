import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SearchPage {
    private WebDriver driver;
    private WebElement searchInput;
    private WebElement searchSubmitButton;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://letterboxd.com/");
        searchInput = driver.findElement(By.xpath("//input[@class='field -borderless' and @id='search-q']"));
        searchSubmitButton = driver.findElement(By.xpath("//input[@class='action' and @value='Search' and @type='submit']"));
    }

    public void search(String query) {
        searchInput.sendKeys(query);
        searchSubmitButton.click();
    }
}