import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodPandaTest extends BaseTest {

    @Test(description = "Opening 'Update mood' window, choosing mood value and click button 'Go to my Diary'")
    public void moodTest() {
        loginPage.openPage()
                .login("hlieb@mailinator.com", "Glebon97")
                .waitForUpdateButton()
                .clickUpdateMoodButton()
                .updateMood(9);
        rateYourHappinessModalPage.clickGoToMyDiaryButton();
        Assert.assertEquals(myDiaryPage.moodRate(), "9", "Error");
    }

    @Test(description = "Opening page 'My diary', clicking button 'I am in crisis'")
    public void pressIAmInCrisisButtonTest() {
        loginPage.openPage()
                .login("hlieb@mailinator.com", "Glebon97")
                .openMyDiary();
        myDiaryPage.clickIAmInCrisisButton();
        Assert.assertEquals(urgentPage.getHelpText(), "If you're in urgent danger: call 999, 911, 112 or your local emergency services");
    }

    @Test(description = "Opening Update mood' window, put in text'Today Lvivske Nefiltrovane costs cheaper then yesterday' choosing mood value and click button 'Go to my Diary'")
    public void putTextInToMoodFieldTest() {
        loginPage.openPage()
                .login("hlieb@mailinator.com", "Glebon97")
                .waitForUpdateButton()
                .clickUpdateMoodButton()
                .writeText("Today Lvivske Nefiltrovane costs cheaper then yesterday")
                .updateMood(9);
        rateYourHappinessModalPage.clickGoToMyDiaryButton();
        Assert.assertEquals(myDiaryPage.getMoodText(), "Today Lvivske Nefiltrovane costs cheaper then yesterday");
    }
}
