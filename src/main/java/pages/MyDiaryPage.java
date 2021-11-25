package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MyDiaryPage {

    public static final By I_AM_IN_CRISIS_BUTTON = By.partialLinkText("I'm in crisis");


    public UrgentPage clickIAmInCrisisButton() {
        $(I_AM_IN_CRISIS_BUTTON).click();
        return new UrgentPage();
    }

    public String moodRate() {
        return $(".media-heading>.badge").getText();
    }

    public String getMoodText() {
        return $(".MoodPostItem").getText();
    }
}
