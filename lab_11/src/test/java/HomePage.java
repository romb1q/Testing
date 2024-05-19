import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    private WebDriver driver;
    private By filmsButton = By.xpath("//span[@class='label' and contains(text(),'Films')]");
    private By registerButton = By.xpath("//span[@class='label' and contains(text(),'Create account')]");
    private By signInButton = By.xpath("//span[@class='label' and contains(text(),'Sign in')]");
    private By journalButton = By.xpath("//span[@class='label' and contains(text(),'Journal')]");
    private By membersButton = By.xpath("//span[@class='label' and contains(text(),'Members')]");

    private By loginUsernameField = By.xpath("//input[@type='email' and @name-'username' and @class='field signin-field' and @id='username')]");
    private By loginPasswordField = By.xpath("//input[@class='field signin-field' and @name='password')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFilmsButton() {
        driver.findElement(filmsButton).click();
        Manager.LOGGER.info("Clicked films button");

    }

    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
        Manager.LOGGER.info("Clicked register button");
    }
    public void clickSignInButton() {
        driver.findElement(signInButton).click();
        Manager.LOGGER.info("Clicked sign in button");
    }
    public void clickJournalButton() {
        driver.findElement(journalButton).click();
        Manager.LOGGER.info("Clicked journal button");
    }
    public void clickMembersButton() {
        driver.findElement(membersButton).click();
        Manager.LOGGER.info("Clicked Members button");
    }
    public void enterUsername(String userName) {
        driver.findElement(loginUsernameField).sendKeys(userName);
        Manager.LOGGER.info("UserName: " + userName);
    }
    public void enterPassword(String userPassword) {
        driver.findElement(loginPasswordField).sendKeys(userPassword);
        Manager.LOGGER.info("UserPassword: " + userPassword);
    }
}