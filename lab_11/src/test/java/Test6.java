import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test6 {

    @Test
    public void testRegisterUser() throws InterruptedException {
        WebDriver driver = Manager.getDriver();
        driver.get("https://letterboxd.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickMembersButton();
        Thread.sleep(3000);

        MembersPage membersPage = new MembersPage(driver);
        membersPage.clickToUser();
        Thread.sleep(2000);
        UserPage userPage = new UserPage(driver);
        userPage.clickToActivityButton();
        Thread.sleep(2000);
        userPage.clickToLikesButton();
        Thread.sleep(3000);


    }
}
