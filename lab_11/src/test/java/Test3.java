import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test3 {

    @Test
    public void testRegisterUser() throws InterruptedException {
        WebDriver driver = Manager.getDriver();
        driver.get("https://letterboxd.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickJournalButton();
        Thread.sleep(3000);

        JournalPage journalPage = new JournalPage(driver);
        journalPage.clickSectionsButton();
        Thread.sleep(2000);
        journalPage.clickAwardsButton();
        Thread.sleep(3000);

    }
}
