import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void testReservoirDogsSearch() throws InterruptedException {
        WebDriver driver = Manager.getDriver();
        driver.get("https://letterboxd.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickFilmsButton();
        Thread.sleep(3000);

        SearchPage searchPage = new SearchPage(driver);
        searchPage.search("Reservoir Dogs");
        Thread.sleep(3000);

        ResultsPage resultsPage = new ResultsPage(driver);
        resultsPage.clickShowTitle();
    }
}
