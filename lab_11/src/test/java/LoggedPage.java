import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoggedPage {
    private WebDriver driver;
    private By toggleMenu = By.xpath("//a[contains(@class, 'has-icon') and contains(@class, 'toggle-menu') and contains(text(), 'romb1q')]");
    private By filmsLink = By.cssSelector("a[href='/romb1q/films/']");

    public LoggedPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterUsername(String userName) {
        WebElement signInForm = driver.findElement(By.cssSelector("form.signin.signin-form.js-header-signin-form.js-signin#signin"));
        WebElement userField = signInForm.findElement(By.cssSelector("input.field.signin-field[name='username']"));
        userField.sendKeys(userName);
        Manager.LOGGER.info("UserName: " + userName);
    }
    public void userList() {
        WebElement menuElement = driver.findElement(toggleMenu);
        menuElement.click();
        Manager.LOGGER.info("Clicked on toggle menu");
    }
    public void userFilmsElement() {
        WebElement menuElement = driver.findElement(filmsLink);
        menuElement.click();
        Manager.LOGGER.info("Clicked on films menu");
    }

}