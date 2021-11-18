package pages;

import com.codeborne.selenide.Condition;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class FeedPage {

    public static final String UPDATE_MOOD_BUTTON = "#LinkUpdate";

    public FeedPage waitForUpdateButton(){
        $(UPDATE_MOOD_BUTTON).shouldBe(Condition.visible, Duration.ofSeconds(10,10));
        return this;
    }

    public RateYourHappinessModalPage clickUpdateMoodButton() {
        $(UPDATE_MOOD_BUTTON).click();
        return new RateYourHappinessModalPage();
    }
}
