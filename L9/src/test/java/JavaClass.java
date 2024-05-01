import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letterboxd.com/");

        Thread.sleep(3000);

        // Найти элемент <button> по классу
        WebElement searchButton = driver.findElement(By.xpath("//span[@class='label' and contains(text(),'Films')]"));

// Нажать на кнопку "Найти"
        searchButton.click();
        Thread.sleep(3000);

// Найти элемент <input> по классу
        WebElement searchInput = driver.findElement(By.xpath("//input[@class='field -borderless' and @id='search-q']"));

// Ввести текст "Reservoir Dogs" в поле ввода
        searchInput.sendKeys("Reservoir Dogs");
        Thread.sleep(3000);
// Найти элемент <button> по классу
        WebElement searchSubmitButton = driver.findElement(By.xpath("//input[@class='action' and @value='Search' and @type='submit']"));

// Нажать на кнопку "Найти"
        searchSubmitButton.click();
        Thread.sleep(3000);
// Найти элемент <div> с классом "ShowCatalogCard__title" и текстом "Reservoir Dogs"
        WebElement showTitle = driver.findElement(By.xpath("//a[contains(text(),'Reservoir Dogs ')]"));

// Нажать на элемент с названием шоу
        showTitle.click();
    }
}