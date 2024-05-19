import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    private WebDriver driver;
    private By registerEmailField = By.xpath("//input[@class='field signin-field' and @name='username' and @type='email')]");
    private By loginUsernameField = By.xpath("//input[@type='email' and @name-'username' and @class='field signin-field' and @id='username')]");
    private By loginPasswordField = By.xpath("//input[@class='field signin-field' and @name='password')]");
    private By registerPasswordField = By.cssSelector("input.field.signin-field[name='password']");
    private By ageCheckbox = By.xpath("//input[@class='checkbox' and @name='termsAndAge')]");
    private By privatePolicyCheckbox = By.xpath("//input[@class='checkbox' and @name='acceptPrivacyPolicy')]");
    private By captchaCheckbox = By.xpath("//div[@id='checkbox' and @role='checkbox')]");
    private By submitButton = By.cssSelector("input.button.-action.button-green[type='submit'][value='Sign in']");



    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String userEmail) {
        driver.findElement(registerEmailField).sendKeys(userEmail);
        Manager.LOGGER.info("Email: " + userEmail);
    }
    public void enterUsername(String userName) {
        WebElement signInForm = driver.findElement(By.cssSelector("form.signin.signin-form.js-header-signin-form.js-signin#signin"));
        WebElement userField = signInForm.findElement(By.cssSelector("input.field.signin-field[name='username']"));
        userField.sendKeys(userName);
        Manager.LOGGER.info("UserName: " + userName);
    }
        public void enterPassword(String userPassword) {
            driver.findElement(registerPasswordField).sendKeys(userPassword);
            Manager.LOGGER.info("UserPassword: " + userPassword);
        }
    public void enterAge() {
        driver.findElement(ageCheckbox).click();
        Manager.LOGGER.info("Clicked age button");
    }
    public void enterPrivatePolicy() {
        driver.findElement(privatePolicyCheckbox).click();
        Manager.LOGGER.info("Clicked private policy button");
    }
    public void enterCaptcha() {
        driver.findElement(captchaCheckbox).click();
        Manager.LOGGER.info("Clicked captcha button");
    }
    public void loginSubmit() {
        driver.findElement(submitButton).click();
        Manager.LOGGER.info("Login success");
    }

}