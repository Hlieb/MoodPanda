import org.testng.annotations.Test;

public class MoodPandaTest extends BaseTest{

    @Test
    public void moodTest(){
        loginPage.openPage()
                .login("hlieb@mailinator.com","Glebon97")
                .waitForUpdateButton()
                .clickUpdateMoodButton()
                .updateMood(9);
    }
}
