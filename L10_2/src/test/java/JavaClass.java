import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //HomePage homePage = new HomePage(driver);
        //homePage.clickFilmsButton();
        //Thread.sleep(3000);

        SearchPage searchPage = new SearchPage(driver);
        searchPage.search("Reservoir Dogs");
        Thread.sleep(3000);

        NextPage nextPage = new NextPage(driver);
        nextPage.clickListsButton();
        Thread.sleep(3000);

        ResultsPage resultsPage = new ResultsPage(driver);
        resultsPage.clickShowTitle();
    }
}
