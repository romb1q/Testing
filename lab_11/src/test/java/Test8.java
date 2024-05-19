import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test8 {

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
        registerPage.enterPassword("Zevics24");
        Thread.sleep(2000);
        registerPage.loginSubmit();
        Thread.sleep(3000);

        SearchPage searchPage = new SearchPage(driver);
        searchPage.serarchClick();
        Thread.sleep(2000);

        searchPage.search("Pulp Fiction");
        Thread.sleep(3000);

        ResultsPage resultsPage = new ResultsPage(driver);
        resultsPage.clickPulpFictionLink();
        Thread.sleep(3000);
        resultsPage.clickPulpFictionGrade();
        Thread.sleep(3000);





    }
}
