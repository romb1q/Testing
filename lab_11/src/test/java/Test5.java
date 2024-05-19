import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test5 {

    @Test
    public void testRegisterUser() throws InterruptedException {
        WebDriver driver = Manager.getDriver();
        driver.get("https://letterboxd.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickFilmsButton();
        Thread.sleep(3000);

        FilmsPage filmsPage = new FilmsPage(driver);
        filmsPage.clickFilm();
        Thread.sleep(2000);
        filmsPage.clickDateOfFilm();
        Thread.sleep(2000);

        filmsPage.clickNewDateOfFilm();
        Thread.sleep(2000);

        filmsPage.clickSecondFilm();
        Thread.sleep(3000);


    }
}
