import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

public class BaseTest {

    LoginPage loginPage;
    FeedPage feedPage;
    MoodUpdatedModalPage moodUpdatedModalPage;
    MyDiaryPage myDiaryPage;
    RateYourHappinessModalPage rateYourHappinessModalPage;
    UrgentPage urgentPage;

    @BeforeMethod
    public void init(){
        Configuration.browser = "chrome";
        Configuration.timeout = 15000;
        Configuration.holdBrowserOpen = true;
        Configuration.headless = false;
        loginPage = new LoginPage();
        feedPage = new FeedPage();
        moodUpdatedModalPage = new MoodUpdatedModalPage();
        myDiaryPage = new MyDiaryPage();
        rateYourHappinessModalPage = new RateYourHappinessModalPage();
        urgentPage = new UrgentPage();
    }

    @AfterMethod
    public void quit(){
    }
}
