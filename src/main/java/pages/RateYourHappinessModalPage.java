package pages;

import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class RateYourHappinessModalPage {

    public static final String SLIDER_CSS = ".ui-slider-handle";
    public static final String UPDATE_MOOD_BUTTON = ".btn-primary.ButtonUpdate";
    public static final String GO_TO_MY_DIARY_BUTTON = ".ButtonMyDiary";
    public static final String MOOD_INPUT_FIELD = "#TextBoxUpdateMoodTag";



    public MoodUpdatedModalPage updateMood(int moodValue) {
        $(SLIDER_CSS).click();
        int defaultMoodValue = 5;
        Keys direction = null;
        if (moodValue > defaultMoodValue) {
            direction = Keys.ARROW_RIGHT;
        } else if (moodValue < defaultMoodValue) {
            direction = Keys.ARROW_LEFT;
        }
        if (moodValue != defaultMoodValue) {
            for (int i = 0; i < Math.abs(moodValue - defaultMoodValue); i++) {
                $(SLIDER_CSS).sendKeys(direction);
            }
        }
        $(UPDATE_MOOD_BUTTON).click();
        return new MoodUpdatedModalPage();
    }

    public MyDiaryPage clickGoToMyDiaryButton(){
        $(GO_TO_MY_DIARY_BUTTON).click();
        return  new MyDiaryPage();
    }

    public RateYourHappinessModalPage writeText(String text){
        $(MOOD_INPUT_FIELD).sendKeys(text);
        return this;
    }
}
