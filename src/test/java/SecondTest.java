import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.DragAndDropOptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SecondTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
    @Test

    void simpleCheckTestForGitHub(){
        open("https://github.com");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
$("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));
$(".enterprise-section-rounded").shouldHave(text("Deliver secure software fast, with enterprise-ready CI/CD using GitHub Actions."));
}

    @Test
    void dragAndDropTest(){
    open("https://the-internet.herokuapp.com/drag_and_drop");
    $("#column-a").dragAndDrop(DragAndDropOptions.to("#column-b"));
    $("#column-a").shouldHave(text("B"));
    $("#column-b").shouldHave(text("A"));

}
}
