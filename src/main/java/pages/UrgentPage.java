package pages;

import static com.codeborne.selenide.Selenide.$;

public class UrgentPage {

    private final String FIND_A_HELPLINE_BUTTON = ".btn btn-primary";

    public void findAHelplineClick(){
        $(FIND_A_HELPLINE_BUTTON).click();
    }

    public String getHelpText(){
        return $(".media>div>div").getText();
    }
}
