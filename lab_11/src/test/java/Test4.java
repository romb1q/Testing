import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test4 {

    @Test
    public void testRegisterUser() throws InterruptedException {
        WebDriver driver = Manager.getDriver();
        driver.get("https://letterboxd.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickFilmsButton();
        Thread.sleep(3000);

        FilmsPage filmsPage = new FilmsPage(driver);
        filmsPage.clickYearItem();
        Thread.sleep(2000);
        filmsPage.clickToListElement();
        Thread.sleep(3000);

    }
}
