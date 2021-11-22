package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FeedPage {

    public static final String UPDATE_MOOD_BUTTON = "#LinkUpdate";
    public static final String I_AM_IN_CRISIS_BUTTON = ".btn-danger";
    public static final By ME_MENU = By.xpath("//*[text()='Me']");
    public static final By MY_FEED_BUTTON = By.linkText("My updates");


    public MyDiaryPage openMyDiary() {
        $(ME_MENU).click();
        $(MY_FEED_BUTTON).click();
        return new MyDiaryPage();
    }

    public FeedPage waitForUpdateButton() {
        $(UPDATE_MOOD_BUTTON).shouldBe(Condition.visible, Duration.ofSeconds(10, 10));
        return this;
    }

    public RateYourHappinessModalPage clickUpdateMoodButton() {
        $(UPDATE_MOOD_BUTTON).click();
        return new RateYourHappinessModalPage();
    }
}
