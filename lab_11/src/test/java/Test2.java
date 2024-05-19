import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test2 {

    @Test
    public void testRegisterUser() throws InterruptedException {
        WebDriver driver = Manager.getDriver();
        driver.get("https://letterboxd.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickSignInButton();
        Thread.sleep(3000);

        RegisterPage registerPage = new RegisterPage(driver);
        Thread.sleep(2000);
        registerPage.enterUsername("romb1q");
        Thread.sleep(2000);
        registerPage.enterPassword("123123123131");
        Thread.sleep(2000);
        registerPage.loginSubmit();
        Thread.sleep(3000);

    }
}
