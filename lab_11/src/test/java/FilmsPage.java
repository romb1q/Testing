import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilmsPage {
    private WebDriver driver;
    private By yearItem = By.xpath("//li[contains(@class, 'smenu-selected') and contains(text(), 'Year')]");
    private By listElement = By.xpath("//a[@class='item' and contains(text(),' 1980s ')]");
    private By filmElement = By.xpath("//div[@class='react-component poster film-poster film-poster-842301 linked-film-poster' and @data-film-name='Challengers']");
    private By dateElement = By.xpath("//a[@href='/films/year/2024/' and contains(text(),'2024')]");
    private By newDateElement = By.xpath("//a[@href='/films/popular/year/2025/' and contains(text(),'2025')]");
    private By secondFilmElement = By.xpath("//div[@class='react-component poster film-poster film-poster-854691 linked-film-poster' and @data-film-name='Minecraft']");

    public FilmsPage(WebDriver driver) {
        this.driver = driver;
    }

    /*public void clickYearList() {
        driver.findElement(yearList).click();
        Manager.LOGGER.info("Clicked year list");

    }*/

    public void clickToListElement() {
        driver.findElement(listElement).click();
        Manager.LOGGER.info("Clicked to list element 1980s");
    }

    /*public void clickYearList() {
        // Находим блок сезона
        WebElement yearUl = driver.findElement(By.xpath("//ul[@class='smenu-menu browse-nav-smenu' and @data-placement='right-start' ]"));


        // Кликаем по элементу внутри следующего блока
        WebElement listElement = yearUl.findElement(By.xpath(".//li[@class='smenu-selected' and contains(text(),'Year')]"));
        listElement.click();

        Manager.LOGGER.info("Clicked year list element");
    }*/
    public void clickYearItem() {
        WebElement yearElement = driver.findElement(yearItem);
        yearElement.click();
        Manager.LOGGER.info("Clicked on Year item");
    }
    public void clickFilm() {
        driver.findElement(filmElement).click();
        Manager.LOGGER.info("Clicked to film Chellengers");
    }
    public void clickDateOfFilm() {
        driver.findElement(dateElement).click();
        Manager.LOGGER.info("Clicked to 2024");
    }
    public void clickNewDateOfFilm() {
        driver.findElement(newDateElement).click();
        Manager.LOGGER.info("Clicked to 2025");
    }
    public void clickSecondFilm() {
        driver.findElement(secondFilmElement).click();
        Manager.LOGGER.info("Clicked to Minecraft film");
    }
}